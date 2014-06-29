/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringtoint;

/**
 *
 * @author Jakexz
 */
public class StringToInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "125";// TODO code application logic here
        Integer obj = Integer.valueOf(s);
        int i = obj;
        i += 10;
        System.out.println(i);
    }
    
}
