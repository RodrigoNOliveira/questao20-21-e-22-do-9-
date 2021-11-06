import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] C = new int[10];

        System.out.println("Digite 10 valores para A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite 10 valores para B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scanner.nextInt();
        }
        System.out.println("Os valores de C são: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = vetorA[i] - vetorB[i];

            System.out.println(C[i]);
        }
            scanner.close();
    }
}