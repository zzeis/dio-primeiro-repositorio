
/**
 * Classe de exemplo para oa exercicio da aula sobre operadores logicos e
 * relacionais, controle de fluxo e bloco
 */

public class App {
    public static void main(String[] args) throws Exception {

        ifsemFlecha(); // ELSE-IF
        // ifFerias();
        // ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
        teste();
    }

    private static void ifsemFlecha() {
        int mes = 9;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Marco");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
    }

    private static void switchSemana() {
        String dia = "Terca";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia Invalido!");
                break;
        }
    }

    private static void switchNumero() {
        int numero = 2;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;

        }

    }

    private static void switchFerias() {
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mes Indefinido");
                break;
        }
    }

    public static void teste(){
        boolean b2 = true;

        if(!b2)
            System.out.println("verdade");
        else{
            System.out.println("mentira");
        }
    }

}
