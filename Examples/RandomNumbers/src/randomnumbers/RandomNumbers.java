/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;

/**
 *
 * @author Jakexz
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;// TODO code application logic here
        while(i <10 )
        {
            double d = Math.random();
            if(d < 0.2 || d > 0.8)
                continue;
            System.out.println(d);
            ++i;
        }
    }
    
}
