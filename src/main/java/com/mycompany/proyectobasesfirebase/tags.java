/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasesfirebase;

/**
 *
 * @author Alan
 */
import java.util.Map;

public class tags {
    private Map<String,String> tags;
    public tags(){
    	
    }
    public tags(Map<String,String> ListTags){
    	this.tags = ListTags;
    }
	public Map<String,String> getTags(){
	       return tags;
	    }
	    public void setTags (Map<String,String> tags){
	       this.tags = tags;
	    }
}