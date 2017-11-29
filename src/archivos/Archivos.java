/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author Estudiante
 */
public class Archivos {


    public static void main(String[] args) 
    {
        File fichero=new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File");
        
        if(fichero.exists()==false)
        {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
        }
        else
        {   
            System.err.println("Existe la carpeta");
        }
          
    }
    
}
