/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Estudiante
 */
public class Archivos {


    public static void main(String[] args) throws IOException 
    {
        File fichero=new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File");
        
        if(fichero.exists()==false)
        {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
           String Temp = "TEMP";
            int i;
           for(i=0;i<100;i++)
             { 
                /* File fichero=new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File"+);
                 fichero.mkdir();//Creacion de carpeta con el nombre de la raiz*/
                 fichero = File.createTempFile(Temp, ".docx" , new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File") );
             }   
           
        }
        else
        {   
            System.err.println("Existe la carpeta");
        }
          
    
        }
    
}
