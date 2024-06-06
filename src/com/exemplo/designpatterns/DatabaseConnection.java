package com.exemplo.designpatterns;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Código de inicialização da conexão com o banco de dados
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        // Código de conexão
        System.out.println("Conectado ao banco de dados.");
    }

    public void disconnect() {
        // Código de desconexão
        System.out.println("Desconectado do banco de dados.");
    }
}
