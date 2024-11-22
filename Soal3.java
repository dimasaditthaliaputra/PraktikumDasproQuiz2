import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] array = new char[4][5];

        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = sc.nextLine();
        namaLengkap = namaLengkap.replace(" ", "");
        int index = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (index < namaLengkap.length()) {
                    array[i][j] = namaLengkap.charAt(index);
                    index++;
                } else {
                    array[i][j] = (char) (Math.random() * 26 + 'A');
                }
            }
        }

        System.out.println("Array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOutput:");
        for (int i = 0; i < 4; i++) {
            char hurufTerbesar = array[i][0];
            int kolomHurufTerbesar = 0;
            for (int j = 1; j < 5; j++) {
                if (array[i][j] > hurufTerbesar) {
                    hurufTerbesar = array[i][j];
                    kolomHurufTerbesar = j;
                }
            }
            System.out.println(hurufTerbesar + " adalah huruf terbesar pada baris "
                    + (i + 1) + " berada di kolom " + (kolomHurufTerbesar + 1));
        }
    }
}
