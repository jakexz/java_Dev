/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumption;

/**
 *
 * @author Jakexz
 */
public class Consumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coordinator  coor = new Coordinator();// TODO code application logic here
        
        for(int userID = 0; userID< 19 ; userID++){
            new User(coor, userID).start();
        }
    }
    
}
