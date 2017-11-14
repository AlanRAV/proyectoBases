package com.mycompany.proyectobasesfirebase;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
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
 String url = "https://proyectobases-56c48.firebaseio.com/";
    Firebase firebasedb = new Firebase(url);
    
    public DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    public DatabaseReference mChildRef = mRootRef.child("juegos");
    public DatabaseReference aj = mRootRef;
     
    
 
    
	public static void main(String[] args) throws Exception, IOException, NullPointerException {
	/*	escritor lapis= new escritor();
		lapis.escrivir();
		System.out.println("escrivio");
	*/	
        try(Reader reader = new InputStreamReader(lector.class.getResourceAsStream("juego.json"), "UTF-8")){
            Gson gson = new GsonBuilder().create();
            appid p = gson.fromJson(reader, appid.class);
            //System.out.println(p.getjuegos().get("570").getTags());
           //System.out.println(p.getjuegos().keySet());

            System.out.println(p.getjuegos().get("570").getTags().keySet());
            /*
            System.out.println(p.getjuegos().get("570").getDeveloper());
            System.out.println(p.getjuegos().get("570").getCcu());*/



        }
        
        
    }
}
