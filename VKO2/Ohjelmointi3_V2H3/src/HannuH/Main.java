package HannuH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opiskelijamaara = 0, i;
        boolean koetus = false;
        Scanner scn = new Scanner(System.in);

        while(koetus == false){
        try{
            System.out.print("Kuinka monen opiskelijan tiedot haluat antaa? :");
            opiskelijamaara = scn.nextInt();
            scn.nextLine();
            koetus = true;
        }catch(InputMismatchException e){
            System.out.println("Anna kokonaisluku.");
            scn.nextLine();
            koetus = false;
        }
        }



       Opiskelija[] opiskelijat = new Opiskelija[opiskelijamaara];

        for(i = 0; i < opiskelijat.length; i++)
        {
            opiskelijat[i] = new Opiskelija();
            opiskelijat[i].kysyTiedot();
        }

        for(i = 0; i<opiskelijamaara; i++)
        {
            System.out.println(opiskelijat[i].toString());
            System.out.println();
            System.out.println();
        }

    }
}


