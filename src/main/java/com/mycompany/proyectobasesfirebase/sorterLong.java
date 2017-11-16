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
public class sorterLong {
    public Long [][] sort(Long[][] asd) {
       // System.out.println (asd[0][0]+ "Parametro llegada");
        Long[][] sorted = asd.clone();
       // System.out.println (sorted[0][0]+ "Sorted llegada");

        for (int i = 0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                //System.out.println(sorted[i][0] + " Sorted 1");
                //System.out.println(sorted[j][0] + " Sorted j");

                if ( (sorted[i][0] < sorted[j][0]) && (i != j) ) {
                    
                    Long[] temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
                
            }
        }
        return sorted;
    }
}
