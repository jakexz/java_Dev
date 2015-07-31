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
public class User extends Thread{
    Coordinator coor;
    int userID;
    
    User(Coordinator coor, int userID){
        this.coor = coor;
        this.userID = userID;
    }
    
    public void run(){
        try{
            while(true){
                Resource r = coor.getResources();
                r.use(userID);
                coor.putResources(r);
                sleep(3000);
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
    }
}
