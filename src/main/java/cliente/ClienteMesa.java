package cliente;

import model.Pedido;

import javax.swing.*;
import java.awt.*;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClienteMesa extends JFrame {

    private final int numeroMesa;

    private JCheckBox pizzaCheckBox;
    private JCheckBox refrigeranteCheckBox;
    private JCheckBox saladaCheckBox;
    private JCheckBox sobremesaCheckBox;

    public ClienteMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;

        setTitle("Mesa " + numeroMesa + " - Sistema de Pedidos");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel painelItens = new JPanel(new GridLayout(0, 1));

        pizzaCheckBox = new JCheckBox("Pizza");
        refrigeranteCheckBox = new JCheckBox("Refrigerante");
        saladaCheckBox = new JCheckBox("Salada");
        sobremesaCheckBox = new JCheckBox("Sobremesa");

        painelItens.add(pizzaCheckBox);
        painelItens.add(refrigeranteCheckBox);
        painelItens.add(saladaCheckBox);
        painelItens.add(sobremesaCheckBox);

        add(painelItens, BorderLayout.CENTER);

        JButton enviarButton = new JButton("Enviar Pedido");
        enviarButton.addActionListener(e -> enviarPedido());
        add(enviarButton, BorderLayout.SOUTH);
    }

    private void enviarPedido() {
        List<String> itensSelecionados = new ArrayList<>();

        if (pizzaCheckBox.isSelected()) itensSelecionados.add("Pizza");
        if (refrigeranteCheckBox.isSelected()) itensSelecionados.add("Refrigerante");
        if (saladaCheckBox.isSelected()) itensSelecionados.add("Salada");
        if (sobremesaCheckBox.isSelected()) itensSelecionados.add("Sobremesa");

        if (itensSelecionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione ao menos um item!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pedido pedido = new Pedido(numeroMesa, itensSelecionados);

        try (Socket socket = new Socket("localhost", 12345);
             ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream())) {

            output.writeObject(pedido);
            JOptionPane.showMessageDialog(this, "Pedido enviado com sucesso!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar pedido: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        int mesa = 1; // padrão
        if (args.length > 0) {
            try {
                mesa = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Número da mesa inválido. Usando mesa 1.");
            }
        }

        int finalMesa = mesa;
        SwingUtilities.invokeLater(() -> {
            ClienteMesa cliente = new ClienteMesa(finalMesa);
            cliente.setVisible(true);
        });
    }
}
