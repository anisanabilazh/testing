import java.util.Scanner;



public class AfterStarGame {
/** Mengurangi pengulangan dengan membuat method print() supaya tidak terlalu banyak menggunakan perintah print pada kelas ini menggunakan switch case untuk memilik tindakan yaitu  masuk atau balik*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("===== SELAMAT DATANG DI PETUALANGAN HALLOWEEN =====");
        print("Malam Halloween yang gelap gulita...");

        print("Apa yang akan Anda lakukan? (ketik 'masuk' atau 'balik'): ");
        String pilihan = input.nextLine().toLowerCase();
        switch (pilihan) {
            case "masuk":
                enterHauntedHouse(input);
                break;
            case "balik":
                turnBack(input);
                break;
            default:
                invalidChoice();
                break;
        }

        input.close();
    }

    private static void print(String text) {
        System.out.println(text);
    }
/** pada private static ini  membuat metode invalidChoice() untuk menangani pilihan yang tidak valid. yang telah di pindahkan dari if else*/
    private static void invalidChoice() {
        print("Pilihan tidak valid! Cobalah lagi.");
    }
/** Memisahkan logika untuk pilihan ke dalam metode enterHauntedHouse() dan turnBack() agar program lebih jelas untuk di baca*/
    private static void enterHauntedHouse(Scanner input) {
        print("Anda membuka pintu rumah berhantu...");
        print("Apa yang akan Anda lakukan?");
        print("1. Mendekati bayangan.");
        print("2. Bersembunyi di balik meja.");
        print("Pilih tindakan Anda (ketik '1' atau '2'): ");
        String tindakan = input.nextLine();

        switch (tindakan) {
            case "1":
                approachShadow();
                break;
            case "2":
                hideUnderTable();
                break;
            default:
                invalidChoice();
                break;
        }
    }
/** memisahkan turnBack dari metode lainnya*/
    private static void turnBack(Scanner input) {
        print("Anda memutuskan untuk berbalik...");
        print("Apa yang akan Anda lakukan?");
        print("1. Berlari lebih cepat.");
        print("2. Bersembunyi di balik pohon.");
        print("Pilih tindakan Anda (ketik '1' atau '2'): ");
        String tindakan = input.nextLine();

        switch (tindakan) {
            case "1":
                runFaster();
                break;
            case "2":
                hideBehindTree();
                break;
            default:
                invalidChoice();
                break;
        }
    }
/** Memecah tindakan ke dalam metode spesifik (approachShadow(), hideUnderTable(), dll.). dan mendeskrisikan dari method tersebut*/
    private static void approachShadow() {
        print("Dengan hati berdebar, Anda mendekati bayangan itu...");
    }

    private static void hideUnderTable() {
        print("Anda bersembunyi di balik meja...");
    }

    private static void runFaster() {
        print("Anda berlari sekuat tenaga...");
    }

    private static void hideBehindTree() {
        print("Anda bersembunyi di balik pohon...");
    }
}

