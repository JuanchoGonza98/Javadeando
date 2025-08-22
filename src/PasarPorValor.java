public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; //Toda variable primitiva siempre se pasa por valor

        System.out.println("Iniciamos el metodo main con i= " + i);
        test(i);
        System.out.println("Finaliza el metodo main con i= " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i= " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i= " + i);
    }
}
