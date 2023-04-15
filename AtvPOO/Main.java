import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("O jogo começou defina um nome, uma classe e uma familia para o seu bicho");
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        System.out.println("Digite uma classe: ");
        String classe = sc.next();
        System.out.println("Digite uma Familia: ");
        String familia = sc.next();

        Animal A = new Animal(nome, classe, familia);

        while (A.geteEstado() == true) {
            System.out.println(
                    "O seu bicho está vivo ele pode fazer as seguintes ações \n a- comer \n b- comer \n c- dormir \n d- sair do programa ");
            String decisao = sc.next();
            switch (decisao) {
                case "a":
                    A.comer();
                    break;

                case "b":
                    A.correr();
                    break;

                case "c":
                    A.dormir();
                    break;

                case "d":
                    A.morrer();

            }
        }
    }
}
