
package tabela;

import java.util.Scanner;

public class Tabela {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        TabelaBrasileirao tabela = new TabelaBrasileirao();

        tabela.adicionarTime(new Time("Palmeiras", 81));
        tabela.adicionarTime(new Time("Internacional", 73));
        tabela.adicionarTime(new Time("Fluminense", 70));
        tabela.adicionarTime(new Time("Corinthians", 65));
        tabela.adicionarTime(new Time("Flamengo", 62));
        tabela.adicionarTime(new Time("Athletico-PR", 58));
        tabela.adicionarTime(new Time("Atlético-MG", 58));
        tabela.adicionarTime(new Time("Fortaleza", 55));
        tabela.adicionarTime(new Time("São Paulo", 54));
        tabela.adicionarTime(new Time("América-MG", 53));
        tabela.adicionarTime(new Time("Botafogo", 53));
        tabela.adicionarTime(new Time("Santos", 47));
        tabela.adicionarTime(new Time("Goiás", 46));
        tabela.adicionarTime(new Time("RB Bragantino", 44));
        tabela.adicionarTime(new Time("Coritiba", 42));
        tabela.adicionarTime(new Time("Cuiabá", 41));
        tabela.adicionarTime(new Time("Ceará", 37));
        tabela.adicionarTime(new Time("Atlético-GO", 36));
        tabela.adicionarTime(new Time("Avaí", 35));
        tabela.adicionarTime(new Time("Juventude", 22));




        Scanner scanner = new Scanner(System.in);
        String comando;
        do {
            System.out.println("\nTabela atual:");
            tabela.exibirTabela();

            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Adicionar time");
            System.out.println("2. Remover time");
            System.out.println("3. Sair");
            comando = scanner.nextLine();

            switch (comando) {
                case "1":
                    System.out.println("Digite o nome do time:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a pontuação do time:");
                    int pontos = Integer.parseInt(scanner.nextLine());
                    tabela.adicionarTime(new Time(nome, pontos));
                    break;
                case "2":
                    System.out.println("Digite o nome do time a ser removido:");
                    nome = scanner.nextLine();
                    tabela.removerTime(nome);
                    break;
                case "3":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        } while (!comando.equals("3"));

        scanner.close();
    }
}