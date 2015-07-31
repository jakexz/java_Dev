package consumption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakexz
 */
public class Coordinator {
    private final static int NUMRESOURCE = 3;
    private int alloc;
    private Resource resources[];
    
    Coordinator(){
        alloc = 0;//initialize resource usage
        
        //create resource
        resources= new Resource[NUMRESOURCE];
        for(int resourceID  = 0 ; resourceID < NUMRESOURCE ; resourceID ++){
            resources[resourceID] = new Resource(resourceID);
        }
        
        
        
    }
    
    synchronized Resource getResources(){
        //wait for an available resource
        while(alloc == NUMRESOURCE){
            try{
                wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
                System.exit(0);
            }
        }
        
        //alloc resources 
        Resource r = null;
        for(int i = 0; i < NUMRESOURCE; i++){
            if(resources[i].alloc == false){
                resources[i].alloc = true;
                r = resources[i];
                break;
            }
        }
        
        //increment allocation of resources
        ++alloc;
        
        notifyAll();
        
        return r;
    }
    
    synchronized void putResources(Resource r){
        r.alloc = false;
        
        --alloc;
        
        notifyAll();
    }
}
