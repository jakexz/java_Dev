/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise10_6;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();// TODO code application logic here
        
        //create all people
        Person p1 = new Person("Lucy", "5634","2344", "sue@hotmail.com");
        Person p2 = new Person("Clarie", "5634","2344", "sue@hotmail.com");
        Person p3 = new Person("John", "5634","2344", "sue@hotmail.com");
        Person p4 = new Person("Kim", "5634","2344", "sue@hotmail.com");
        Person p5 = new Person("Viviane", "5634","2344", "sue@hotmail.com");
        Person p6 = new Person("Barbara", "5634","2344", "sue@hotmail.com");
        Person p7 = new Person("Kelly", "5634","2344", "sue@hotmail.com");
        //populat the hashtable
        hash.put("3944392", p1);
        hash.put("4654948", p2);
        hash.put("4516465", p3);
        hash.put("4789365", p4);
        hash.put("0213294", p5);
        hash.put("0446464", p6);
        hash.put("0264167", p7);
        
        //Display the elements of the hashtable 
        Enumeration e = hash.keys();
        while(e.hasMoreElements()){
            Object k = e.nextElement();
            Object v = hash.get(k);
            System.out.println("key = " + k + ";value = " + v);
        }
    }
    
}

class Person{
    private String name,telephone, fax, email;
    Person(String name, String telephone, String fax, String email){
        this.name = name; this.telephone = telephone; this.fax = fax; this.email = email;
    }
    
    public String toString(){
        return name + ";" + telephone + ";"+ fax + ";" + email;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}