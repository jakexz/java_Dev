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
public class Resource {
    int resourceID;
    boolean alloc;
    
    Resource(int resourceID){
        this.alloc = false;
        this.resourceID = resourceID;
    }
    
    void use(int userID){
        try{
            System.out.println("User " + userID + " wants to use resource "+ resourceID);
            Thread.sleep((int)(5000 + 5000*Math.random()));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
 
}
