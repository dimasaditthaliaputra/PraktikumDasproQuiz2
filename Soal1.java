public class Soal1 {
    public static void main(String[] args) {
        int key = 5;

        for (int i = 1; i <= key; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}