package B_funcoesInteressantesParaString;

public class ComandosEmString {
    public static void main(String[] args) {
        String original = "laRiSSA da SilVA ferNaNdEs ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("laRi", "gata");
        int i = original.indexOf("i");
        int j = original.lastIndexOf("i");

        System.out.println("Letras originais: -" + original + "-");
        System.out.println("Letras minúsculas toLowerCase: -" + s01 + "-");
        System.out.println("Letras maiúsculas toUpperCase: -" + s02 + "-");
        System.out.println("Mantém às letras originais e eliminar os espaços dos lados trim: -" + s03 + "-");
        System.out.println("Pega somente os caracteres depois do 2 substring(2): -" + s04 + "-");
        System.out.println("Pega somente os caracteres depois do 2 ao 9  substring(2, 9): -" + s05 + "-");
        System.out.println("Substitui a letra (a), pela letra (x).  replace('a', 'x'): -" + s06 + "-");
        System.out.println("Substitui as letras (laRi), pelas letras (gata), replace('lari', 'xy'): -" + s07 + "-");
        System.out.println("Qual á a primeira ocorrência da letra i (qual sua primeira posição na frase)  Index of 'i': " + i);
        System.out.println("Qual á a primeira ocorrência da letra i (qual sua última posição na frase) Last index of 'i': " + j);
    }
}

/** split: Serve para recortar o String em espaço em branco*/
class OperacaoSplit {
    public static void main(String[] args) {
        String s = "arroz, feijão, carne.";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}