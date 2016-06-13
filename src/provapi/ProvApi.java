/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapi;

/**
 *
 * @author jacksonokuhn
 */
import java.util.Map;
import CPL;
        
public class ProvApi {

    private static Map<String, String> NAMESPACES;
    
    protected String[] args;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CPL.attachODBC("DSN=CPL");
    }
    
    public addNamespace(String key, String value){
        
            NAMESPACES.put(key, value);
    }

    public removeNamespace(String key){
        
            NAMESPACES.remove(key);
    }
    
    public entity(){
        
    }
    
    public activity(){
    
    }
    
    public agent(){
    
    }
    
    public attributeValuePair(){
        
    }
    
    public wasGeneratedBy(){
    
    }
    
    public used(){
    
    }
    
    public wasInformedBy(){
    
    }
    
    public wasStartedBy(){
    
    }
            
    public wasEndedBy(){
        
    }
    
    public wasInvalidatedBy(){
        
    }
    
    public wasDerivedFrom(){
    }
    
    public wasAttributedTo(){
        
    }
    
    public wasAssociatedWith(){
        
    }
    
    public actedOnBehalfOf(){
        
    }
    
    public wasInfluencedBy(){
        
    }
    
    public alternateOf(){
        
    }
    
    public specializationOf(){
        
    }
    
    public hadMember(){
        
    }   
}
