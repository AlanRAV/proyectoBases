package com.mycompany.proyectobasesfirebase;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
import com.firebase.client.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.EventListener;

import org.json.simple.JSONObject;


public class lector {
    public lector(){
    
    // DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    // DatabaseReference mChildRef = mRootRef.child("juegos");
    // DatabaseReference aj = mRootRef;
   
    }
	public static void main(String[] args) throws Exception, IOException, NullPointerException {
             /* Firebase myFirebaseRef = new Firebase("https://proyectomovilesversion2.firebaseio.com/"); //<---- How to find this
         
                          System.out.println("Trolo"); //To change body of generated methods, choose Tools | Templates.
            myFirebaseRef.setValue("DADKnsaf");

              
    myFirebaseRef.child("juegos").child("10").child("name").addValueEventListener(new ValueEventListener() {
         @Override
         public void onDataChange(com.firebase.client.DataSnapshot ds) {
            System.out.println("Holo"); //To change body of generated methods, choose Tools | Templates.
            String nombre = ds.getKey();
             System.out.println(nombre); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void onCancelled(FirebaseError fe) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
         
    });
        }*/
		escritor lapis= new escritor();
		lapis.escrivir();
		//System.out.println("escrivio");
		
       /* try(Reader reader = new InputStreamReader(lector.class.getResourceAsStream("100forever.json"), "UTF-8")){
            Gson gson = new GsonBuilder().create();
            appid p = gson.fromJson(reader, appid.class);
            //System.out.println(p.getjuegos().get("570").getTags());
           //System.out.println(p.getjuegos().keySet());

            System.out.println(p.getjuegos().get("570").getTags().keySet());
            
            System.out.println(p.getjuegos().get("570").getDeveloper());
            System.out.println(p.getjuegos().get("570").getCcu());
*/
        NewJFrame V = new NewJFrame();      // creamos una ventana
        
        V.setVisible(true);     

        
        
        
    }
}
