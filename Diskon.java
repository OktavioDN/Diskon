/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;
import java.util.Scanner;

public class Diskon {


    public static void main(String args[]) {
        Scanner masuk=new Scanner(System.in);
        float total_beli,diskon,bayar;
        
        System.out.print("Masukan Total Beli=");
        total_beli=masuk.nextFloat();
        
        if (total_beli>1000000)
        {
            System.out.println("Potongan 20%");
            diskon=total_beli*0.2f;
            bayar=total_beli-diskon;
        }  
        else if (total_beli>500000)
        {
            System.out.println("Potongan 15%");
            diskon=total_beli*0.15f;
            bayar=total_beli-diskon;
        }
        else if (total_beli>100000)
        {
            System.out.println("Potongan 10%");
            diskon=total_beli*0.1f;
            bayar=total_beli-diskon;
        }
        else
        {
            System.out.println("Tidak Ada Diskon=");
            diskon=total_beli*0f;
            bayar=total_beli-diskon;
        }
        
        
            System.out.println("Harga Diskon="+diskon);
            System.out.println("Bayar="+bayar);
           
        
    }
    
}
