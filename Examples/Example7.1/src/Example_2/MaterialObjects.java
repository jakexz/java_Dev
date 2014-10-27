/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_2;

/**
 *
 * @author Jakexz
 */
public class MaterialObjects {
    public static void main(String args[]){
        Ball ball = new Ball(Material.wood);
        Coin coin = new Coin(Material.gold);
        Ring ring = new Ring(Material.silver);
        
        System.out.println(ball);
        System.out.println(coin);
        System.out.println(ring);
    }
}
