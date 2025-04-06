package servidor;

import model.Pedido;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
//servidor
public class ServidorRestaurante {
    public static void main(String[] args) {
        int porta = 12345;

        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("🟢 Servidor aguardando conexões na porta " + porta);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("🧑‍💻 Nova conexão recebida: " + socket.getInetAddress());

                // Cria uma nova thread para lidar com o ClienteMesa1
                new Thread(() -> {
                    try (ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {
                        Pedido pedido = (Pedido) input.readObject();
                        System.out.println("📥 Pedido recebido: " + pedido);
                    } catch (Exception e) {
                        System.out.println("⚠️ Erro ao receber pedido: " + e.getMessage());
                    }
                }).start();
            }
        } catch (Exception e) {
            System.out.println("❌ Erro no servidor: " + e.getMessage());
        }
    }
}
