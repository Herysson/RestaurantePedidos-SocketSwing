# 🍽️ Sistema de Pedidos de Restaurante - Java Swing + Sockets

Este é um projeto didático que simula um sistema de pedidos para um pequeno restaurante com **3 mesas**, onde cada mesa é representada por um cliente com interface gráfica (Java Swing) que envia os pedidos para um **servidor central** via **Sockets TCP/IP**.

---

## 💻 Tecnologias Utilizadas

- Java 17+
- Java Swing (interface gráfica)
- `java.net.Socket` e `java.net.ServerSocket` (comunicação em rede)
- Threads Java (concorrência no servidor)
- Serializable (para envio de objetos)
- IntelliJ IDEA (IDE recomendada)

---

## 🧱 Estrutura do Projeto

```
src/
├── cliente/
│   └── ClienteMesa.java        # Classe única e genérica para todas as mesas
├── servidor/
│   └── ServidorRestaurante.java
└── model/
    └── Pedido.java             # Modelo do pedido, serializável
```

---

## 🚀 Como Executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/RestaurantePedidos-SocketSwing.git
cd RestaurantePedidos-SocketSwing
```

### 2. Compile o projeto (se necessário)
Se estiver usando linha de comando:
```bash
javac cliente/ClienteMesa.java servidor/ServidorRestaurante.java model/Pedido.java
```

---

## ▶️ Executando o servidor

Execute o servidor primeiro:

```bash
java servidor.ServidorRestaurante
```

---

## 🧑‍💻 Executando os clientes (mesas)

Você pode abrir quantos clientes quiser, informando o número da mesa como argumento:

```bash
java cliente.ClienteMesa 1
java cliente.ClienteMesa 2
java cliente.ClienteMesa 3
```

Ou configure no IntelliJ da seguinte forma:

### IntelliJ (GUI):
1. Vá em **Run > Edit Configurations...**
2. Crie novas configurações do tipo **Application**
3. Para cada cliente, configure:

| Cliente       | Main class             | Program arguments |
|---------------|------------------------|-------------------|
| ClienteMesa1  | `cliente.ClienteMesa`  | `1`               |
| ClienteMesa2  | `cliente.ClienteMesa`  | `2`               |
| ClienteMesa3  | `cliente.ClienteMesa`  | `3`               |

4. Execute as configurações desejadas para abrir múltiplas janelas.

---

## ✅ Funcionalidades

- [x] Interface gráfica simples para seleção de itens
- [x] Envio de pedidos via rede
- [x] Servidor com múltiplos clientes simultâneos
- [x] Uso de serialização para troca de objetos
- [x] Cliente genérico com número de mesa parametrizável

---

## 📌 Observações

Este projeto foi desenvolvido com fins didáticos para ensinar:
- Programação orientada a objetos
- Programação concorrente com threads
- Comunicação cliente-servidor
- Interfaces gráficas em Java (Swing)

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍🏫 Autor

**Prof. Herysson**  
Projeto acadêmico para as disciplinas de Programação Orientada a Objetos e Projeto de Software.


