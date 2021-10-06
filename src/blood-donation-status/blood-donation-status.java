/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood-donation-status;

import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author caglaoksuz
 */
public class blood-donation-status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
       YSA a=new YSA(9, 0.7, 0.5, 0.000000001, 100000);  
        Scanner girdi = new Scanner(System.in);
        Scanner girdi2 = new Scanner(System.in);
     
     int sec;
     do {
            System.out.println("1- Ağı Eğit");
            System.out.println("2- Eğit ve Test Et"); 
            System.out.println("3- Tek Veri ile Test Et");
            System.out.println("4- Çıkış");
            sec = girdi.nextInt();
            switch(sec){
            case 1:
                  a.Train();
                break;
            case 2:
                double mape = a.test();
                System.out.print("Hata : ");
                  System.out.println(mape);
                break;
            case 3:
         
                    double[] inputs = new double[3];
                    if(a == null)
                    {
                        System.out.println("Önce Eğitim");
                        System.in.read();
                    }
                    else
                    {

                        System.out.println("Recency (0-74) : ");
                        inputs[0] = girdi2.nextDouble();
                        System.out.println("Frequency (1-50) : ");
                        inputs[1] = girdi2.nextDouble();
                        System.out.println("Time (2-98) : ");
                        inputs[2] = girdi2.nextDouble();
                    }
                    System.out.println("Sonuc : "+a.tekTest(inputs));
                    System.in.read();
                break;
                }
        } while (sec != 4);
  }
}