/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasesfirebase;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class juego {
	int appid;
    String name;
    String developer;
    String publisher;
    int score_rank;
    int owners;
    int owners_variance;
    int players_forever;
    int players_forever_variance;
    int players_2weeks;
    int players_2weeks_variance;
    int average_forever;
    int average_2weeks;
    int median_forever;
    int median_2weeks;
    int ccu;
    int price;
    
    Map<String,String> tags;
	public Map<String,String> getTags(){
	       return tags;
	    }
	    public void setTags (Map<String,String> tags){
	       this.tags = tags;
	    }
	   /* public Set<String> getTagkey(){
	    	return tags.keySet();
	    }*/
    
   public int getAppid(){
       return appid;
   }
    public void setAppid (int appid){
       this.appid = appid;
    }
    
    public String getName(){
       return name;
   }
    public void setName (String name ){
       this.name = name ;
    }

   public String getDeveloper(){
       return developer;
   }   
    public void setDeveloper (String developer ){
       this.developer = developer;
    }
   
    public String getPublisher(){
       return publisher;
   }
    public void setPublisher (String publisher ){
       this.publisher = publisher;
    }
    
    public int getScore_rank(){
       return score_rank;
    }
    public void setScore_rank (int score_rank ){
       this.score_rank = score_rank;
    }
    
    public int getOwners(){
       return owners;
    }
    public void setOwners (int owners){
       this.owners = owners ;
    }
    
    public int getOwners_variance(){
       return owners_variance;
    }
    public void setOwners_variance (int owners_variance){
       this.owners_variance = owners_variance;
    }
   
    public int getPlayers_forever(){
       return players_forever;
    }
    public void setPlayers_forever (int players_forever){
       this.players_forever = players_forever;
    }
    
    public int getPlayers_forever_variance(){
       return players_forever_variance;
    }
    public void setPlayers_forever_variance (int players_forever_variance){
       this.players_forever_variance = players_forever_variance;
    }
    
    public int getPlayers_2weeks(){
       return players_2weeks;
    }
    public void setPlayers_2weeks (int players_2weeks){
       this.players_2weeks = players_2weeks;
    }
    
    public int getPlayers_2weeks_variance(){
       return players_2weeks_variance;
    }
    public void setPlayers_2weeks_variance (int players_2weeks_variance){
       this.players_2weeks_variance = players_2weeks_variance;
    }
    
    public int getAverage_forever(){
       return average_forever;
    }
    public void set (int average_forever){
       this.average_forever = average_forever;
    }
    
    public int getAverage_2weeks(){
       return average_2weeks;
    }
    public void setAverage_2weeks (int average_2weeks){
       this.average_2weeks = average_2weeks;
    }
    
    public int getMedian_forever(){
       return median_forever;
    }
    public void setMedian_forever (int median_forever){
       this.median_forever = median_forever;
    }
    
    
    public int getMedian_2weeks(){
       return median_2weeks;
   }
    public void setMedian_2weeks (int median_2weeks){
       this.median_2weeks = median_2weeks;
    }
    
    
    public int getCcu(){
       return ccu;
    } 
    public void setCcu (int ccu){
       this.ccu = ccu;
    }
  
    
    public int getPrice(){
       return price;
    }
    public void setPrice (int price){
       this.price = price;
    }

	public String toString() {
        return name + " - " + developer + " - " +price;
    }
	/*
	public tags getTags(){
	       return this.tags;
	    }
    public void setTags (tags tags){
       this.tags = tags;
    }*/
}
