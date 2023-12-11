

public class homework_3 {
    public static void main(String[] args) {
        System.out.println("Ini adalah awal program");
        for(int i=0;i<=9;i++){
            for (int j=0;j<=9;j++){
                System.out.print("* ");
                if(i==j||(i+j)==9){
                    break;
                }
            }
            System.out.println("\n");
        }
        System.out.println("Ini adalah Akhir program");
    }
}
