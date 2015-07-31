/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8_5_4;

/**
 *
 * @author Jakexz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String array[] = new String[5];// TODO code application logic here
        array[0] = "4.6";
        array[1] = "0.1";
        array[2] = "2.49";
        array[3] = "300...";
        array[4] = "73.45";
        try{
            average(array);
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("NullPointerException");
        }catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("NumberFormatException");
        }
    }
    
    public static void average(String array[]) throws NullPointerException,NumberFormatException{
        double d, sum = 0;
        for(int i = 0; i < array.length; i++){
            d = Double.valueOf(array[i]);
            sum += d;
        }
        System.out.println(sum = sum/array.length);
    }
}
