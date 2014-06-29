/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dollaramount;

/**
 *
 * @author Jakexz
 */
public class DollarAmount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "The total cost is $45.67";// TODO code application logic here
        int i1 = s1.indexOf('$');
        String s2 = s1.substring(i1);
        System.out.println(s2);
    }
    
}
