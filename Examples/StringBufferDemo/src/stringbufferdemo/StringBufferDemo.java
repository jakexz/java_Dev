/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringbufferdemo;

/**
 *
 * @author Jakexz
 */
public class StringBufferDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();// TODO code application logic here
        StringBuilder sb2 = new StringBuilder(30);
        StringBuilder sb3 = new StringBuilder("abcde");
        
        System.out.println("sb1.capacity = " + sb1.capacity());
        System.out.println("sb1.length = " + sb1.length());
        System.out.println("sb2.capacity = " + sb2.capacity());
        System.out.println("sb2.length = " + sb2.length());
        System.out.println("sb3.capacity = " + sb3.capacity());
        System.out.println("sb3.length = " + sb3.length());
    }
    
}
