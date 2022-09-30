/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumeBalok;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class VolumeBalok {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double p,l,t;
        double volume;
        
        System.out.println("Menghitung Volume Balok");
        System.out.println("-----------------------");
        
        System.out.print("Masukan Panjang= ");
        p=input.nextDouble();
        
        System.out.print("Masukan Lebar= " );
        l=input.nextDouble();
        
        System.out.print("Masukan Tinggi= ");
        t=input.nextDouble();
        
        volume=p*l*t;
        
        System.out.println("Jadi, volume balok adalah "+volume);
        
    }       
}
