

# 🍽️ Sistema de Pedidos de Restaurante - Java Swing + Socket

Este é um projeto didático que simula um sistema de pedidos para um pequeno restaurante com **3 mesas**, onde cada mesa é representada por um cliente com interface gráfica (Java Swing) que envia os pedidos para um **servidor central** por meio de **Sockets TCP/IP**.

---

## 💻 Tecnologias Utilizadas

- Java 17+
- Java Swing (interface gráfica)
- `java.net.Socket` e `java.net.ServerSocket` (comunicação em rede)
- Threads Java (para lidar com múltiplos clientes)
- Serializable (para envio de objetos entre cliente e servidor)
- IntelliJ IDEA (IDE recomendada)

---

## 🧱 Estrutura do Projeto

```
src/
├── cliente/
│   ├── ClienteMesa1.java
│   ├── ClienteMesa2.java
│   └── ClienteMesa3.java
├── servidor/
│   └── ServidorRestaurante.java
└── model/
    └── Pedido.java
```

---

## 🚀 Como Executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/RestaurantePedidos-SocketSwing.git
cd RestaurantePedidos-SocketSwing
```

### 2. Compile o projeto no IntelliJ
- Abra o projeto com IntelliJ IDEA.
- Marque a pasta `src` como `Sources Root` se necessário.

### 3. Execute o servidor
Execute a classe:
```
servidor/ServidorRestaurante.java
```

### 4. Execute um ou mais clientes (mesas)
Execute qualquer uma das classes:
```
cliente/ClienteMesa1.java
cliente/ClienteMesa2.java
cliente/ClienteMesa3.java
```

---

## 📸 Demonstração

> A interface gráfica de cada mesa permite selecionar os itens do cardápio e enviá-los ao servidor com um clique.

---

## ✅ Funcionalidades

- [x] Enviar pedido da mesa ao servidor
- [x] Servidor escuta múltiplas conexões simultâneas
- [x] Interface Swing simples e funcional
- [ ] Armazenamento dos pedidos recebidos
- [ ] Exibição em tempo real dos pedidos no servidor

---

## 📌 Observações

Este projeto foi desenvolvido com fins didáticos para estudos de:
- Programação orientada a objetos
- Comunicação cliente-servidor
- Interfaces gráficas com Java Swing
- Concorrência e threads

---

## 👨‍🏫 Autor

**Prof. Herysson**  
Projeto de exemplo para uso em disciplinas de Programação Orientada a Objetos e Projeto de Software.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.


