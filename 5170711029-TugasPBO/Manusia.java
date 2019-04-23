package inheritence;

import java.util.Scanner;

public class Manusia {

    String nama,usia;
    String pekerjaan;
    Scanner scan = new Scanner(System.in);

    void cowok() {
        System.out.println(" COWOK ");       
        System.out.print(" Nama:");
        nama = scan.next();
        System.out.print(" Age:");
        usia = scan.next();
    }

    void cewek() {
        System.out.println(" CEWEK ");
        System.out.print(" Nama:");
        nama = scan.next();
        System.out.print(" Age:");
        usia = scan.next();
    }

}
