import java.util.Scanner;

public class homework_4_Runner {
    public static void main(String[] args) {
        double input1;
        double input2;
        int choose;
        double hasil, hasilgabung1, hasilgabung2, hasilgabung3, hasilgabung4;
        String answer = null;

        classInputGetterSetter kelas = new classInputGetterSetter();
        classHasil result = new classHasil();
        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;

        do {
            System.out.println("============================");
            System.out.println("Welcome to calculator System");
            System.out.println("============================");

            try {
            System.out.print("Angka pertama : ");
            input1 = scanner.nextInt();
            kelas.setData1(input1);
            System.out.print("Angka kedua : ");
            input2 = scanner.nextInt();
            kelas.setData2(input2);
                do {
                    System.out.print("\n1. Tambah ( + )\n");
                    System.out.print("2. kurang ( - )\n");
                    System.out.print("3. Kali ( x )\n");
                    System.out.print("4. Bagi ( / )\n");
                    System.out.print("5. semua simbol\n");
                    System.out.print("\nPilih angka untuk pilih operasi (1-5) : ");
                    choose = scanner.nextInt();
                    kelas.setData3(choose);
                }while(choose < 1 || choose > 5);
            }catch (Exception e){
                System.out.println("\nTidak bisa input karakter selain angka");
                break;
            }

            switch (kelas.getData3()) {
                case 1:
                    hasil = kelas.getData1() + kelas.getData2();
                    result.setHasilOperasi(hasil);
                    System.out.printf("hasil %s + %s = %f\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilOperasi());
                    break;
                case 2:
                    hasil = kelas.getData1() - kelas.getData2();
                    result.setHasilOperasi(hasil);
                    System.out.printf("hasil %s - %s = %f\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilOperasi());
                    break;
                case 3:
                    hasil = kelas.getData1() * kelas.getData2();
                    result.setHasilOperasi(hasil);
                    System.out.printf("hasil %s x %s = %f\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilOperasi());
                    break;
                case 4:
                    hasil = kelas.getData1() / kelas.getData2();
                    result.setHasilOperasi(hasil);
                    System.out.printf("hasil %s / %s = %f\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilOperasi());
                    break;
                case 5:
                    hasilgabung1 = kelas.getData1() + kelas.getData2();
                    hasilgabung2 = kelas.getData1() - kelas.getData2();
                    hasilgabung3 = kelas.getData1() * kelas.getData2();
                    hasilgabung4 = kelas.getData1() / kelas.getData2();
                    result.setHasilgabung1((int) hasilgabung1);
                    result.setHasilgabung2((int) hasilgabung2);
                    result.setHasilgabung3((int) hasilgabung3);
                    result.setHasilgabung4((float) hasilgabung4);
                    System.out.printf("hasil %s + %s = %d\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilgabung1());
                    System.out.printf("hasil %s - %s = %d\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilgabung2());
                    System.out.printf("hasil %s x %s = %d\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilgabung3());
                    System.out.printf("hasil %s / %s = %f\n", kelas.getData1(), kelas.getData2(),
                            result.getHasilgabung4());
                    break;
                default:
                    System.out.println("gaada simbol tersebut\n");
                    break;
            }

            do {
                System.out.print("\nCoba lagi [Y/N]? ");
                answer = scanner.next();
                if (answer.equalsIgnoreCase("N")) {
                    System.out.print("\nTerima kasih sudah mencoba");
                    kondisi = false;
                    break;
                } else if (answer.equalsIgnoreCase("Y")) {
                    kondisi = true;
                }else {
                    System.out.println("\n  hanya bisa isi Y atau N!");
                }
            }while(!"Y".equalsIgnoreCase(answer)||!"N".equalsIgnoreCase(answer));
        }while(kondisi);
    }
}
