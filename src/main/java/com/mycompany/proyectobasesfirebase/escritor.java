package com.mycompany.proyectobasesfirebase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;


public class escritor {
	
	public escritor(){
		
	}


	public void escrivir()throws Exception{
        URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        try(Writer writer = new OutputStreamWriter(new FileOutputStream("server1.json"))){
        while ((inputLine = in.readLine()) != null){
        	Gson gson = new GsonBuilder().create();
        	gson.toJson(inputLine, writer);
            System.out.println(inputLine);
        }
        in.close();
    }
}

}
