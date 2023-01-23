package edu.mario.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá turma, sejam bem vindos!");
        String _$br1_$ ="casa";
        System.out.println(_$br1_$);
        String primeiroNome = "Gleyson";
        int anoFrabricacao = 1962;
        String segundoNome = "Malaquias";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome) ;
    }
}
