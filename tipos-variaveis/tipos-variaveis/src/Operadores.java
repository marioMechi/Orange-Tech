public class Operadores {
    public static void main(String[] args) {
        String NomeCompleto = "LINGUAGEM"+"JAVA";
        System.out.println(NomeCompleto);

        String concatenacao = "?";

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+"1"+"1"+1;

        System.out.println(concatenacao);

        concatenacao = "1"+"1"+"1"+"1";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+"1";

        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = -numero;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(numero --);

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a , b;
        a=5;
        b=6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        a=6;
        String resultado2 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado2);

        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2){
            System.out.println("As duas são verdadeiras");
        }
        if( condicao1 || condicao2){
            System.out.println("Uma delas é verdadeira");
        }
    }
}
