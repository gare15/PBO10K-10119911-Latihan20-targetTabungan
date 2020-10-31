/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author tegar
 */
public class targTabungan {

    /**
     * @param args the command line arguments
     */
        static int saldoAkhir;
    static void hitung(int a, int b){
         saldoAkhir = (a + (a*b/100));
    }
    
    public static void main(String[] args) {
          DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        int saldo = 3500000;
        int bunga = 8;
        int target = 6000000;
        
        for (int i = 1; i <= i; i++){
            hitung(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(saldoAkhir));
         saldo = saldoAkhir;
         if(saldoAkhir >= target)
             break;
        }
    }
    
}
