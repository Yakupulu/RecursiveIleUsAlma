import java.util.Scanner;
//Recursive metodu ile üs alma

public class Main {
    static  void power(){
        int taban,us,result=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("Tabani giriniz:");
        taban= inp.nextInt();
        System.out.print("Us giriniz:");
        us= inp.nextInt();

        for (int i=1; i<=us;i++){
            result*=taban;
        }
        System.out.println("Sonuc: "+result);
    }

    public static void main(String[] args) {

        while (true){
            power();
        }
    }
}
