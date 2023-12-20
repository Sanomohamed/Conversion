package conversion;

import java.util.*;
public class Conversion {
   
    public static void main(String[] args) {
      
        System.out.println("System to convert centimeter and feet in inch");
        
        Scanner sc = new Scanner(System.in);
        
        double inchc,inchf,cm,ft;
        
        System.out.println("\nPlease enter the value in Centimeter");
        
        cm = sc.nextDouble();
        
        System.out.println("\nplease enter the value in feet");
        
        ft = sc.nextDouble();
        
        inchc = cm*0.393;
        inchf=ft*12;
        
        System.out.printf("\nThe value in centimeter is "+cm+"Cm\nIn inch is %.2f",inchc);
        System.out.printf("\nThe value in Feet is "+ft+"Feet\nIn inch is %.2f",inchf);
        
        
    }
    
}
