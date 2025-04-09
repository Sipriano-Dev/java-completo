public class ValoresPadrao {

    //Inicializa com um valor padrão 0, declarado no escopo da classe
    //serve para float double ou int
    static int numero;

    //Inicializa com false
    static boolean verdadeiroOuFalso;

    //Classe inicia com null (não aponta para nenhum espaço em memoria)
    static String nome;

    public static void main(String[] args) {
        //Dentro do metodo não atribui valor padrão
        //int num = 0;
        System.out.println(numero);
        System.out.println(verdadeiroOuFalso);
        System.out.println(nome);

        if (verdadeiroOuFalso) {
            int outroNumero = 0; //Não pode usar fora desse método
            System.out.println(outroNumero);
        }

    }
}
