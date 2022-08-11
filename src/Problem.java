import java.util.Scanner;

public class Problem {
    static final String CONTINUAR = "SIM";
    static final String CANCELAR = "NAO";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        String escolhas;



// TODO: complete os espaços em branco com sua solução para o problema
        System.out.println("Bem vindos! Você deseja prosseguir no cadastro de Universidades? Sim para continuar e Não para cacelar.");
        escolhas = sc.nextLine();//identificar erro=======================<
        if (escolhas.equals("NAO") || escolhas.isEmpty()){
            System.out.println("ERROR! É NECESSÁRIO INFORMAR OS VALORES COM OS NOMES.");
            System.exit(0);
        }else {
            for (int i = 0; i < 10; i++) {
                nomes[i] = sc.nextLine();
            }
        }

        if(nomes[3] != null) {
            System.out.println("Imprimindo o terceiro nome da Lista:" + nomes[3]);
            System.out.println("Imprimindo o sétimo nome da Lista:" + nomes[7]);
            System.out.println("Imprimindo o nono nome da Lista:" + nomes[9]);
        }else{
            System.out.println("É necessário informas o campo com os nomes de 1 até 10. Obrigado!");
        }




    }
}