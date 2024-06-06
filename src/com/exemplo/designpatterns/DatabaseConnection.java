/**
 * DatabaseConnection.java
 *
 * Este arquivo demonstra o uso do padrão de design Singleton.
 * O padrão Singleton é utilizado para garantir que uma classe tenha apenas uma instância
 * e para fornecer um ponto global de acesso a essa instância.
 *
 * Usar o padrão Singleton para gerenciar a conexão com o banco de dados melhora a eficiência
 * e a consistência do acesso ao banco de dados, evitando a criação de múltiplas conexões.
 *
 * Comentários em cada linha são fornecidos para facilitar a compreensão dos desenvolvedores iniciantes.
 */

package com.exemplo.designpatterns;

public class DatabaseConnection {
    // A única instância da classe
    private static DatabaseConnection instance;

    // Construtor privado para evitar a criação de instâncias adicionais
    private DatabaseConnection() {
        // Código de inicialização da conexão com o banco de dados
    }

    // Método para retornar a única instância da classe
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para conectar ao banco de dados
    public void connect() {
        // Código de conexão
        System.out.println("Conectado ao banco de dados.");
    }

    // Método para desconectar do banco de dados
    public void disconnect() {
        // Código de desconexão
        System.out.println("Desconectado do banco de dados.");
    }
}
