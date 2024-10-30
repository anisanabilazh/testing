import java.util.Scanner;

public class stargame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== SELAMAT DATANG DI PETUALANGAN HALLOWEEN =====");
        System.out.println("Malam Halloween yang gelap gulita. Angin kencang berhembus, daun-daun beterbangan.");
        System.out.println("Anda berjalan melewati sebuah rumah tua berhantu yang dihiasi oleh labu dengan senyuman menyeramkan.");
        System.out.println("Tiba-tiba, Anda mendengar suara misterius memanggil nama Anda...");

        System.out.println("Di depan Anda ada dua pilihan: jalan terus menuju rumah berhantu atau berbalik.");
        System.out.println("Apa yang akan Anda lakukan? (ketik 'masuk' atau 'balik'): ");
        String pilihan = input.nextLine().toLowerCase();

        if (pilihan.equals("masuk")) {
            System.out.println("Anda membuka pintu rumah berhantu. Suara pintu berderit menambah suasana mencekam.");
            System.out.println("Di dalam rumah, Anda melihat ruangan penuh dengan hiasan Halloween, dan di sudut ruangan, Anda melihat bayangan besar.");
            System.out.println("Apa yang akan Anda lakukan?");
            System.out.println("1. Mendekati bayangan.");
            System.out.println("2. Bersembunyi di balik meja.");
            System.out.println("Pilih tindakan Anda (ketik '1' atau '2'): ");
            String tindakan = input.nextLine();

            if (tindakan.equals("1")) {
                System.out.println("Dengan hati berdebar, Anda mendekati bayangan itu.");
                System.out.println("Ternyata itu adalah monster labu raksasa dengan taring tajam!");
                System.out.println("Monster itu mulai mengejar Anda...");
                System.out.println("Anda berlari secepat mungkin, tetapi monster itu terlalu cepat!");
                System.out.println("GAME OVER: Anda tertangkap oleh monster labu.");
            } else if (tindakan.equals("2")) {
                System.out.println("Anda bersembunyi di balik meja, menahan napas.");
                System.out.println("Monster itu tampaknya tidak menyadari keberadaan Anda dan akhirnya pergi.");
                System.out.println("Anda berhasil keluar dari rumah berhantu tanpa terluka.");
                System.out.println("Anda selamat dari malam Halloween yang menyeramkan!");
                System.out.println("===== SELAMAT! ANDA BERHASIL BERTAHAN HIDUP =====");
            } else {
                System.out.println("Pilihan tidak valid! Cobalah lagi.");
            }
        } else if (pilihan.equals("balik")) {
            System.out.println("Anda memutuskan untuk berbalik dan melarikan diri dari rumah berhantu.");
            System.out.println("Namun, jalan pulang terasa sangat panjang, dan Anda merasa seperti sedang diawasi.");
            System.out.println("Tiba-tiba, Anda mendengar langkah kaki di belakang Anda...");
            System.out.println("Apa yang akan Anda lakukan?");
            System.out.println("1. Berlari lebih cepat.");
            System.out.println("2. Bersembunyi di balik pohon.");
            System.out.println("Pilih tindakan Anda (ketik '1' atau '2'): ");
            String tindakan = input.nextLine();

            if (tindakan.equals("1")) {
                System.out.println("Anda berlari sekuat tenaga, tetapi suara langkah kaki semakin mendekat.");
                System.out.println("Tiba-tiba, sesosok bayangan besar muncul di depan Anda!");
                System.out.println("GAME OVER: Anda terjebak oleh monster Halloween.");
            } else if (tindakan.equals("2")) {
                System.out.println("Anda bersembunyi di balik pohon besar.");
                System.out.println("Langkah kaki semakin mendekat, tetapi tiba-tiba berhenti.");
                System.out.println("Setelah beberapa saat, Anda merasa aman dan kembali berjalan pulang.");
                System.out.println("Anda selamat dari malam Halloween yang menyeramkan!");
                System.out.println("===== SELAMAT! ANDA BERHASIL BERTAHAN HIDUP =====");
            } else {
                System.out.println("Pilihan tidak valid! Cobalah lagi.");
            }
        } else {
            System.out.println("Pilihan tidak valid! Cobalah lagi.");
        }

        input.close();
    }
}
