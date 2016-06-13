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
import java.time.LocalDateTime;
import java.util.HashMap;
        
public class ProvApi {

    private static Map<String, String> NAMESPACES;
    protected String[] args;
    private String originator;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CPL.attachODBC("DSN=CPL");
        ProvApi.NAMESPACES = new HashMap();
    }
    
    public void addNamespace(String key, String value){
        
            NAMESPACES.put(key, value);
            
    }

    public void removeNamespace(String key){
        
            NAMESPACES.remove(key);
    }

   public CPLObject entity(String identifier){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "entity", null);
        
        return obj1;
    }
   
    public CPLObject entity(String identifier, HashMap attributes){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "entity", null);
        
        attributes.forEach( (k,v) -> obj1.addProperty(k.toString(), v.toString()));
        
        return obj1;
    }   
    
    public CPLObject activity(String identifier){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "activity", null);
        
        return obj1;
    }
    
    public CPLObject activity(String identifier, HashMap attributes){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "activity", null);
        
        attributes.forEach( (k,v) -> obj1.addProperty(k.toString(), v.toString()));

        return obj1;
    }
    
    public CPLObject activity(String identifier, LocalDateTime start, LocalDateTime end){
        
        CPLObject obj1 = CPLObject.create(this.originator, "activity", null);
        
        if(start != null){
            obj1.addProperty("startTime", start);
        }
        if(end != null){
            obj1.addProperty("endTime", end);
        }
        
        return obj1;
    }
    
    public CPLObject activity(String identifier, LocalDateTime start, LocalDateTime end, HashMap attributes){
        
        CPLObject obj1 = CPLObject.create(this.originator, "activity", null);
        
        if(start != null){
            obj1.addProperty("startTime", start);
        }
        if(end != null){
            obj1.addProperty("endTime", end);
        }
        attributes.forEach( (k,v) -> obj1.addProperty(k.toString(), v.toString()));
        
        return obj1;
    }
    
   public CPLObject agent(String identifier){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "agent", null);
        
        return obj1;
    }
   
    public CPLObject agent(String identifier, HashMap attributes){
        
        CPLObject obj1 = CPLObject.create(this.originator, identifier, "agent", null);
        
        attributes.forEach( (k,v) -> obj1.addProperty(k.toString(), v.toString()));
        
        return obj1;
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
