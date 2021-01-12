 
package com.mycompany.doggenetics;
import java.util.*;

public class DogGenetics {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String input = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+input+"'s prestigious background right here.");
        System.out.println(input+" is:");
        
        Random rng = new Random();
        double d1=rng.nextDouble();
        double d2=rng.nextDouble();
        double d3=rng.nextDouble();
        double d4=rng.nextDouble();
        double d5=rng.nextDouble();
        double sum=d1+d2+d3+d4+d5;
        int p1=(int)Math.round(d1/sum*100);
        int p2=(int)Math.round(d2/sum*100);
        int p3=(int)Math.round(d3/sum*100);
        int p4=(int)Math.round(d4/sum*100);
        int p5=100-p1-p2-p3-p4;
        System.out.println(p1+"% St. Bernard");
        System.out.println(p2+"% Chihuahua");
        System.out.println(p3+"% Dramatic RedNosed Asian Pug");
        System.out.println(p4+"% Common Cur");
        System.out.println(p5+"% King Doberman");
     
    }
}
