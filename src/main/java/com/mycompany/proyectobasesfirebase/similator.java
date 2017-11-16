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
public class similator {
	Object[] ids;
	String juego;
	appid p;
	int[][]topsimilar;
	Object[] listatags;

	public similator(appid pid, int[][]top, Object[] lista, Object[] id, String juego) {
		
	}
	public int[][] comparar(){
	for (int i = 0; i < ids.length; i++) {

		if(ids[i].toString().equals(juego)){
			topsimilar[i][0]=0;
			//break;
			//System.out.println(p.getjuegos().get(ids[i].toString()));
		}else{
		Object[] EvaluateTags=p.getjuegos().get(ids[i].toString()).getTags().keySet().toArray();

		
		int similar=0;				
		for(int j=0; j<EvaluateTags.length; j++){
			for(int k=0; k<listatags.length;k++){
				if(EvaluateTags[j].toString().equals(listatags[k].toString())){
					similar++;
					break;
				}
			}					
		}
		topsimilar[i][0]=similar;
		
		topsimilar[i][1]=i;				
		}
	}
	return topsimilar;

	}
	
}