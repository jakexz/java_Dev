/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package widgetconstructors;

/**
 *
 * @author Jakexz
 */

class Widget{
    double w;
     Widget(String s ){
         w = Double.valueOf(s);
     }
     
     Widget(StringBuffer sb){
         String s = sb.toString();
         w = Double.valueOf(s);
         
     }
     
     Widget(double d){
         w = d;
     }
}
public class WidgetConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Widget w1  = new Widget("5.5");// TODO code application logic here
        System.out.println(w1.w);
        
        String sb = "-17.86";
        Widget w2 = new Widget(sb);
        System.out.println(w2.w);
        
        Widget w3 = new Widget(2.5e-17);
        System.out.println(w3.w);
    }
    
}
