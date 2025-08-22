public class PasarPorValor {
    public static void main(String[] args) {
        System.out.println("Iniciando main\n");
        int i = 1;
        System.out.println("Valor de la variable i en main:" + i);
        test(i);
        System.out.printf("Valor de la variable i no se modifica (en main):" + i );
    }
    public static void test(int i){
        i = 50;
        System.out.println("Valor de la variable i en test :" + i );
    }
}
