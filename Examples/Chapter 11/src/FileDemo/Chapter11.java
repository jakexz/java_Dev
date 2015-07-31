/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileDemo;

import java.io.File;

/**
 *
 * @author Jakexz
 */
public class Chapter11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Display constants
            System.out.println("pathSeparatorChar = " + File.pathSeparatorChar);
            System.out.println("separatorChar = " + File.separatorChar);
            
            //Test some methods
            File file = new File(args[0]);
            System.out.println("getName() = " + file.getName());
            System.out.println("getParent() = " + file.getParent() );
            System.out.println("getAbsolutePath() = " + file.getAbsolutePath());
            System.out.println("getCanonicalPath() = " + file.getCanonicalPath());
            System.out.println("getPath() = " + file.getPath());
            System.out.println("canRead() = " + file.canRead());
            System.out.println("canWrite() = " + file.canWrite());
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
