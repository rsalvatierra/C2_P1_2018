/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2.proyecto1_2018v1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ROBIN SALVATIERRA
 */
public class C2Proyecto1_2018v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new navegador().setVisible(true);
        
         String ruta = "src\\c2\\gramaticas\\flex_chtml.jflex";
        String param [] = new String[7];
        param[0]= "-destdir";
        param[1]="src\\c2\\gramaticas\\";
        param[2]="-parser";
        param[3]="Parser_chtml";
        param[4]="-symbols";
        param[5]="Simbolos_chtml";
        param[6]="src\\c2\\gramaticas\\cup_chtml.cup";
        
           File file = new File(ruta);
        jflex.Main.generate(file);
        
        try{
        
            java_cup.Main.main(param);
        //    java_cup.Main.main(param2);
            
        }catch(Exception e){
        
            System.out.print(e.toString());
        }
    

 

              
    }
    
}
