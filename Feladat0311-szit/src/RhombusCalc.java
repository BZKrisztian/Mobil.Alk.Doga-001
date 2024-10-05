/*
* File: RhombusCalc.java
* Author: Batki Zoltan Krisztian
* Copyright: 2024, Batki Zoltan Krisztian
* Group: Szoft II-1-N
* Date: 2024-10-05
* Github: https://github.com/BZKrisztian
* Licenc: None
*/
import java.util.Scanner;

public class RhombusCalc{
    public static void main(String[] args){

        System.out.println("Eme program feladata: rombusz teruletenek kiszamolasa");
        System.out.println("Batki Zoltan Krisztian, Szoft II-1-N");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az 'e' atlo hosszat: ");
        double diagonal1 = scanner.nextDouble();
        System.out.println("Adja meg az 'f' atlo hosszat: ");
        double diagonal2 = scanner.nextDouble();

        double area = (diagonal1 * diagonal2)/2;

        System.out.printf("A rombusz terulete: " + area);

        scanner.close();
    }

}