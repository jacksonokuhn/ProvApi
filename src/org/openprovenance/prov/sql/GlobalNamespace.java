/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openprovenance.prov.sql;

/**
 *
 * @author jacksonokuhn
 */
public class GlobalNamespace 
    extends Namespace
{
    private static GlobalNamespace gn;
    
    private GlobalNamespace () {};
    
    public static GlobalNamespace getInstance(){
        
        if(gn==null){
            gn = new GlobalNamespace();
            gn.addKnownNamespaces();
        }
        
        return gn;
    }
}
