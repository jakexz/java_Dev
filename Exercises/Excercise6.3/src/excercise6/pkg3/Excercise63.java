/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excercise6.pkg3;

/**
 *
 * @author Jakexz
 */
public class Excercise63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bond obj[] = new Bond[6];// TODO code application logic here
        obj[0] = new Bond();
        obj[1] = new ConvertibleBond();
        obj[2] = new ConvertibleBond();
        obj[3] = new Bond();
        obj[4] = new ConvertibleBond();
        obj[5] = new Bond();
        
        int i = 0;
        
        while( i < 6){
        obj[i].Display();
        i++;
        }
        
    }
    
}
