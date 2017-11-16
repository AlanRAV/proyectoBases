/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasesfirebase;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.GenericTypeIndicator;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alan
 */

 
public class NewJFrame extends javax.swing.JFrame {
    int n = 115;
    appid p;
    Long [][] arregloTiempo = new Long [n][2];
    int [] playtimeForever = new int [n]; 
    String [] arrayIds = new String [n];
    private static Object[] ids;
    Query queryRef ;
    
    String juego="221380";
    Firebase myFirebaseRef = new Firebase("https://proyectobases-56c48.firebaseio.com/"); //<---- How to find this
    
    
    Firebase myFirebaseMisJuegos = new Firebase("https://proyectobasesjuegosjugado.firebaseio.com/"); 
    Firebase ResponseRef = new Firebase("https://proyectobasesjuegosjugado.firebaseio.com/response"); 



    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() throws UnsupportedEncodingException, IOException {
         this.setTitle("Recomendador");                   // colocamos titulo a la ventana
        this.setSize(1000, 1000);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(NewJFrame.EXIT_ON_CLOSE);         
        System.out.println("Trolo"); //To change body of generated methods, choose Tools | Templates.
           

          
	
  
        
        initComponents();
    }
    
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 1000));

        jPanel1.setBackground(new java.awt.Color(155, 199, 254));
        jPanel1.setForeground(new java.awt.Color(100, 0, 0));

        jLabel1.setBackground(new java.awt.Color(5, 8, 8));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 50, 50));
        jLabel1.setText("RECOMENDADOR");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alan\\Desktop\\Steam.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(51, 51, 51))
        );

        jPanel2.setBackground(new java.awt.Color(240, 253, 223));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jButton1.setText("Pedir Recomendación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setText("ARAV_KILLER");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setText("Cuenta");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alan\\Desktop\\Pilgrim.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Firebase delFirebaseRef = myFirebaseRef;

      

                ResponseRef.child("games").addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //rutina.setText(dataSnapshot.getKey());
                        int i = 0;
                        //System.out.println ("number of childs"+dataSnapshot.getChildrenCount());

                        for (DataSnapshot child : dataSnapshot.getChildren()) {

                            //textViewsName.get(i).setText(child.getKey());
                            //textViewsVal.get(i).setText(child.getValue().toString());
                            //System.out.println ("User key"+ child.getKey());
                            
                            Long tiempo =  (Long) child.child("playtime_forever").getValue();
                            Long id =  (Long) child.child("appid").getValue();
                        


                            arregloTiempo[i][0] = tiempo;
                            arregloTiempo[i][1] = id;
                            
                            //System.out.println ("Tiempo jugado"+ tiempo);
                            //System.out.println ("Id"+ id);
                            
                            //System.out.println ("User ref" +child.getRef().toString());
                            //System.out.println ("User val" +child.getValue().toString());
                            //sorterLong sorLong=new sorterLong();
		            //arregloTiempo=sorLong.sort(arregloTiempo);

                            // System.out.println(arregloTiempo[i][0] + "Arreglo en 0");
                            // System.out.println(arregloTiempo[i][1] + "Arreglo en 1");
                             i++;
                            
                        }
                        
                          sorterLong sorLong=new sorterLong();
		        arregloTiempo=sorLong.sort(arregloTiempo);
                        for (int l =1; l<=5; l++){
                        System.out.println(arregloTiempo[l][0] + "PUTAAAAAAAAAAAAAAAAAa");
                        }
                        
                    }
                    @Override
                    public void onCancelled(FirebaseError fe) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
                      
                //}

            myFirebaseRef.addValueEventListener(new ValueEventListener() {

                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    System.out.println("Holo"); //To change body of generated methods, choose Tools | Templates.
                    //String nombre = ds.getValue().toString();
                    //Object o =   ds.getValue();
                    p =   dataSnapshot.getValue(appid.class);
                    
        	
		String juego="221380";
		
		//try(Reader reader = new InputStreamReader(lector.class.getResourceAsStream("100forever.json"), "UTF-8")){
		//	Gson gson = new GsonBuilder().create();
		//	appid p = gson.fromJson(reader, appid.class);
			
			
			
			Object[] listatags= new tags(p.getjuegos().get(juego).getTags()).getTags().keySet().toArray();

			
			ids=p.getjuegos().keySet().toArray();
			//las posiciones[i][0] es para el numero de tags que coinciden
			//las posiciones[i][1] es la posicion del arreglo de juegos
			int[][]topsimilar= new int[p.getjuegos().keySet().size()][4];	
			
			
			topsimilar=comparar(juego,topsimilar,listatags,p);

			//System.out.println("maxnumber"+maxNum+"juego: "+p.getjuegos().get(ids[maxposition].toString()));
			
			for (int i = 0; i < 5; i++) {
				System.out.println("top "+(i+1)+" juego: "+p.getjuegos().get(ids[topsimilar[i][1]].toString())+" coincidencia "+topsimilar[i][0]+" coincidencia2- "+topsimilar[i][2]);
				
			}

                    //for (int i =0; i<=n; i++){
                        //arrayIds [i]=
                       // int i=0;
                        //for(DataSnapshot child: dataSnapshot.getChildren()){
                           // System.out.println ("AQUI ESTA TU PUTA BASE DE DATOS");

                            //System.out.println ("Appid"+ child.getKey());
                            //arrayIds[i] = child.getKey();
                            //System.out.println ("User ref" +child.getRef().toString());
                            //System.out.println ("User val" +child.getValue().toString());
                            //System.out.println(arrayIds[i]+"");
                            //i++;
                        //}
                            
                        //}
                    //appid p;

                    //Object[] listatags= new tags
                    //p = (appid) o;

                    //System.out.println(o.getjuegos().get("570").getDeveloper());

                    /*Object[] listatags= new tags(p.getjuegos().get(juego).getTags()).getTags().keySet().toArray();

                    ids=p.getjuegos().keySet().toArray();
                    //las posiciones[i][0] es para el numero de tags que coinciden
                    //las posiciones[i][1] es la posicion del arreglo de juegos
                    int[][]topsimilar= new int[p.getjuegos().keySet().size()][2];

                    topsimilar=comparar(juego,topsimilar,listatags,p);

                    //System.out.println("maxnumber"+maxNum+"juego: "+p.getjuegos().get(ids[maxposition].toString()));
                    for (int i = 0; i < ids.length; i++) {
                        System.out.println("top "+(i+1)+" juego: "+p.getjuegos().get(ids[topsimilar[i][1]].toString())+" coincidencia "+topsimilar[i][0]);

                    }
                    //System.out.println(o); //To change body of generated methods, choose Tools | Templates.
                    */
                }

                @Override
                public void onCancelled(FirebaseError fe) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

    }//GEN-LAST:event_jButton1ActionPerformed
          );
            
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
        
        
        
        
*/
        




		
	
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
    

	public static int[][] comparar(String juego, int[][]topsimilar, Object[] listatags, appid p){
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
		sorter sor=new sorter();
		topsimilar=sor.sort(topsimilar);
		
		int TagRank=50;
		int pRank=25;
		for(int i=0;i<topsimilar.length;i ++){
			if(i<5){
				topsimilar[i][0]=TagRank;
				TagRank=TagRank-10;
			}else{topsimilar[i][0]=0;}
			//pasar el tag a la hisquierda
			
			topsimilar[i][2]=topsimilar[i][0];
			
			topsimilar[i][0]=p.getjuegos().get(ids[topsimilar[i][1]]).getScore_rank();
			
			if(topsimilar[i][0]>80){topsimilar[i][0]=25;}else if(topsimilar[i][0]>70){
				topsimilar[i][0]=20;
			}else if(topsimilar[i][0]>60){
				topsimilar[i][0]=15;
			}else if(topsimilar[i][0]>50){
				topsimilar[i][0]=10;
			}
			else if(topsimilar[i][0]>=40){
				topsimilar[i][0]=5;
			}else{
					topsimilar[i][0]=0;
				
			}
			
		}

		
		topsimilar=sor.sort(topsimilar);		
		
		for(int i=0;i<topsimilar.length;i ++){
		topsimilar[i][3]=topsimilar[i][0];
		//System.out.println("topsimilar[i][3] "+topsimilar[i][3]);

		topsimilar[i][0]=p.getjuegos().get(ids[topsimilar[i][1]]).getPlayers_forever();
	
		}
		topsimilar=sor.sort(topsimilar);
		for(int i=0;i<topsimilar.length;i ++){
		if(i<5){
			topsimilar[i][0]=pRank;
			//System.out.println("entro al siclo "+p.getjuegos().get(ids[topsimilar[i][1]]).getName());
			
			pRank=pRank-5;
		}else{
			topsimilar[i][0]=0;
			}
		topsimilar[i][0]=topsimilar[i][0]+topsimilar[i][2]+topsimilar[i][3];

		}
		
		topsimilar=sor.sort(topsimilar);
		return topsimilar;

		}
	


   
}
