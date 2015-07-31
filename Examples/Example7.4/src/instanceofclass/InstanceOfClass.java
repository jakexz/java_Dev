/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceofclass;

/**
 *
 * @author Jakexz
 */
public class InstanceOfClass {
    public final static int NUMFISH = 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish fishes[] = new Fish[NUMFISH];// TODO code application logic here
        
        fishes[0] = new Trout();
        fishes[1] = new Flounder();
        fishes[2] = new Tuna();
        fishes[3] = new Trout();
        
        for(int i = 0; i < NUMFISH; i++){
            Fish fish = fishes[i];
            if(fish instanceof SaltWaterFish) {
                fish.display();
            }
        }
    }
    
}
