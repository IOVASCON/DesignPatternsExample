# DesignPatternsExample

Este projeto demonstra a implementação de vários padrões de design em Java, incluindo Singleton, Factory, Observer e Strategy. O objetivo é fornecer uma base prática para o estudo e aplicação desses padrões de design em um contexto empresarial, especificamente para a administração financeira.

## Padrões de Design Implementados

1. **Singleton Pattern**: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. Utilizado para gerenciar a conexão com o banco de dados.

2. **Factory Pattern**: Define uma interface para criar objetos, mas permite que subclasses decidam qual classe instanciar. Utilizado para criar diferentes tipos de contas financeiras (Poupança e Corrente).

3. **Observer Pattern**: Define uma dependência um-para-muitos entre objetos para que, quando um objeto muda de estado, todos os seus dependentes sejam notificados e atualizados automaticamente. Utilizado para notificar os clientes sobre transações financeiras.

4. **Strategy Pattern**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Utilizado para implementar diferentes estratégias de cálculo de juros.

## Estrutura de Pastas

DesignPatternsExample
├── lib
│   └── com
│       └── exemplo
│           └── designpatterns
│               ├── DatabaseConnection.class
│               ├── Account.class
│               ├── SavingsAccount.class
│               ├── CheckingAccount.class
│               ├── AccountFactory.class
│               ├── Observer.class
│               ├── Client.class
│               ├── Subject.class
│               ├── AccountSubject.class
│               ├── InterestStrategy.class
│               ├── RegularInterestStrategy.class
│               ├── HighInterestStrategy.class
│               ├── AccountContext.class
│               └── FinancialManagementSystem.class
├── src
│   └── com
│       └── exemplo
│           └── designpatterns
│               ├── DatabaseConnection.java
│               ├── Account.java
│               ├── AccountFactory.java
│               ├── Observer.java
│               ├── InterestStrategy.java
│               └── FinancialManagementSystem.java
├── README.md
├── .gitignore

## Arquivo .gitignore

O arquivo `.gitignore` é utilizado para especificar quais arquivos e diretórios o Git deve ignorar e não incluir no controle de versão. Isso é importante para evitar que arquivos desnecessários, como arquivos temporários ou compilados, sejam incluídos no repositório.

### Por que Ignorar a Pasta `lib`

No contexto deste projeto, a pasta `lib` contém os arquivos `.class` compilados a partir dos arquivos fonte `.java`. Estes arquivos não precisam ser versionados por várias razões:

1. **Reprodutibilidade:** Qualquer desenvolvedor que clone o repositório pode compilar os arquivos fonte localmente para gerar os arquivos `.class`. Versionar arquivos compilados não é necessário e pode causar conflitos se diferentes desenvolvedores tiverem versões ligeiramente diferentes dos mesmos arquivos compilados.

2. **Espaço em Disco e Performance:** Arquivos compilados podem ser grandes e incluir muitos deles no repositório pode aumentar significativamente o tamanho do repositório, o que pode afetar a performance e o tempo de clonagem.

3. **Manutenção e Limpeza:** Manter arquivos compilados no repositório pode tornar o gerenciamento do código mais difícil, pois é necessário garantir que eles sejam atualizados sempre que os arquivos fonte mudarem. É mais simples e limpo compilar os arquivos quando necessário.

Por essas razões, a pasta `lib` é incluída no arquivo `.gitignore` para garantir que os arquivos compilados não sejam versionados.

## Executando o Projeto

Para executar o projeto, siga as instruções abaixo:

1. Compile os arquivos Java:

   javac -d lib src/com/exemplo/designpatterns/*.java

2. Execute a classe principal:

   java -cp lib com.exemplo.designpatterns.FinancialManagementSystem

## Exemplo de Saída

Ao executar o projeto, você verá a seguinte saída no console:

Conectado ao banco de dados.
Conta Poupança
Conta Corrente
Transação realizada: Depósito de $1000
Cliente Alice: Transação: Depósito de $1000
Cliente Bob: Transação: Depósito de $1000
Juros Regular: 30.0
Juros Alto: 50.0
Desconectado do banco de dados.

>>>Resumo do que será mostrado:

    Conexão com o Banco de Dados (Singleton):
        "Conectado ao banco de dados."

    Tipos de Conta Criados (Factory):
        "Conta Poupança"
        "Conta Corrente"

    Notificações de Transações (Observer):
        "Transação realizada: Depósito de $1000"
        "Cliente Alice: Transação: Depósito de $1000"
        "Cliente Bob: Transação: Depósito de $1000"

    Cálculo de Juros (Strategy):
        "Juros Regular: 30.0"
        "Juros Alto: 50.0"

    Desconexão do Banco de Dados (Singleton):
        "Desconectado do banco de dados."

## Explicação dos Padrões de Design

>>>Singleton Pattern

A classe DatabaseConnection garante que apenas uma instância da conexão com o banco de dados exista.

>>>Factory Pattern

A classe AccountFactory cria objetos Account sem expor a lógica de criação para o cliente.

>>>Observer Pattern

A classe AccountSubject notifica os observadores (clientes) sobre as transações realizadas.

>>>Strategy Pattern

A classe AccountContext utiliza diferentes estratégias de cálculo de juros.

## Contribuindo

Se você deseja contribuir para este projeto, siga os passos abaixo:

    Fork o repositório
    Crie uma branch para sua feature (git checkout -b feature/nova-feature)
    Faça o commit de suas mudanças (git commit -am 'Adiciona nova feature')
    Envie para o branch (git push origin feature/nova-feature)
    Crie um novo Pull Request

## Licença

Este projeto é licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato.
