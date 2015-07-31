/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PushPop;

/**
 *
 * @author Jakexz
 */

import java.util.*;
public class PushPop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create stack
        Stack stack = new Stack();// TODO code application logic here
        
        //Push elements onto stack
        for(int i = 0; i < args.length; i++){
            stack.push(i);
        }
        
        while(!stack.empty()){
            Object obj = stack.pop();
            System.out.println(obj);
        }
    }
    
}


