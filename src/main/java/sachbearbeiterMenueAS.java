

import java.util.Scanner;

public class sachbearbeiterMenueAS {

    int selectedIndex = 0;
    Scanner scanner = new Scanner(System.in);
    sachbearbeiterMenueK sbmk = new sachbearbeiterMenueK();
    sachbearbeiterChangeAAS sbCAAS = new sachbearbeiterChangeAAS();


    loginK lK = new loginK();
    loginAAS lKAAS = new loginAAS();

    public void menue(){


        System.out.println("***************** Hauptmenue *****************");
        System.out.println("");
        System.out.println("Bitte waehlen Sie aus:");

        System.out.println("1 - Sachbearbeiter aendern");
        System.out.println("2 - Logout");
        System.out.println("");
        System.out.print("Auswahl: ");
        selectedIndex = scanner.nextInt();

        if(selectedIndex == 1){
            sbCAAS.change();
        }
        if(selectedIndex == 2){
            selectedIndex = -1;
            lK.loginID = 9999;
            lKAAS.login();
        }


    }

}
