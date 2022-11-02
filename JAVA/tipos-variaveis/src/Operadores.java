

public class Operadores {
    public static void main(String[] args) {

      /////////LOGICOS/////////////
      
      boolean condicao1 = true; 
      boolean condicao2 = true; 

      if(condicao1 &&  (7 > 4)){ //E; verifica se as duas condicoes sao verdadeiras.
        System.out.println("as duas condicoes sao verdadeiras");
      }

      if(condicao1 || condicao2){ //OU; verifica se alguma das condicoes e verdadeira.
        System.out.println("uma das condicoes e verdadeira");
      }
      


      System.out.println("fim");








        /////// INCREMENTO///////////
        // int numero = 5;
        // repeticao
        // numero++; //incremento
        // System.out.println(numero--);
        // System.out.println(numero);

        /////// BOLEAN///////////////
        // boolean variavel = true;

        // variavel = !variavel;

        // System.out.println(variavel);

        ////// TERNARIO/////////////
        // int a, b;
        // a = 6;
        // b = 6;
        // String resultado = a == b ? "verdadeiro" : "falso";
        // System.out.println(resultado);
        
        //////RELACIONAIS/////////

        // String nomeUm = "zeis"; 
        // String nomeDois = new String("zeis"); 

        // System.out.print(nomeUm.equals(nomeDois));

        // int numero1 = 1; 
        // int numero2 = 2; 

        // boolean simNao = numero1 == numero2; 
        // if(numero1 < numero2){
        //     System.out.println("a nossa condicao e verdadeira");
        // }



        // System.out.println("numeroUm e igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm e diferente a numeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numeroUm e maior a numeroDois? " + simNao);

    }
}
