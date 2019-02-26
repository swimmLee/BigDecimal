package bigletters;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author lheberer
 */
public class BigLetters {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wi = "5726398.";
        String ca = "38041430.";
        String tx = "26059203.";
        String cost = "3.23";
        
        
        BigDecimal bi1 = new BigDecimal(wi);
        BigDecimal bi2 = new BigDecimal(ca);
        BigDecimal bi3 = new BigDecimal(tx);
        BigDecimal copy = new BigDecimal(cost);
        
        BigDecimal wiCa = bi1.multiply(bi2);
        System.out.println("the number of letters for wi o each ca:\n\t" + wiCa);
        //System.out.println("Number of digits: ");
        
        BigDecimal wiCaTx = wiCa.multiply(bi3);
        System.out.println("the number of copies for texans:\n\t" + wiCaTx);
        
        BigDecimal money = wiCaTx.multiply(copy);
        System.out.println("Cost of copies for all Texans:\n\t" + money);
    }
    
}
