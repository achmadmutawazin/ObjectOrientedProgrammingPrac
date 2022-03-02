/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import java.util.Scanner;
import conversion.Conversions;
/**
 *
 * @author achmadmutawazin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double celcius;
        System.out.println("+------------------------------------+");
        System.out.println("|WATER TEMPERATURE CONVERSION PROGRAM|");
        System.out.println("+------------------------------------+");
        Scanner input = new Scanner (System.in);
        System.out.println("Data Entry");
        System.out.println("----------");
        System.out.print("Temperature In Celcius : ");
        celcius = input.nextDouble();
        do {
        System.out.println();
        System.out.println("Option\n----\n1. View Conversion Data\n2. Edit Conversion Data\n3. Exit");
        System.out.print("Choices : ");
        int menu = input.nextInt();
        switch(menu){
            case 1:
                Conversions convert = new Conversions (celcius);
                convert.convertz();break;
            case 2:
                  System.out.print("Temperature In Celcius : "); celcius = input.nextDouble();
                  break;
            case 3: System.exit(0);
            default : System.out.println("operation dose not exist. Please enter the options correctly!");
        }
        }while(true);}    
}
