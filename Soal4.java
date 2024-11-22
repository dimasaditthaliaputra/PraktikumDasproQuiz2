import java.text.SimpleDateFormat;
import java.util.Date;

public class Soal4 {
    public static void main(String[] args) {
        Date tgl = new Date();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        SimpleDateFormat d = new SimpleDateFormat("d");
        String ini_tanggal = d.format(tgl);

        SimpleDateFormat m = new SimpleDateFormat("M");
        int ini_bulan = Integer.parseInt(m.format(tgl));

        SimpleDateFormat y = new SimpleDateFormat("Y");
        String ini_tahun = y.format(tgl);

        System.out.println(ini_tanggal + " " + namaBulan[ini_bulan - 1] + " " + ini_tahun);
    }
}