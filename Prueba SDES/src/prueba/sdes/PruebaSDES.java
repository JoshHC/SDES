/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.sdes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author josue
 */
public class PruebaSDES {

    /**
     * @param args the command line arguments
     */
      
    
    public static void main(String[] args) {
    String [][] S0 = {{"01","00","11","10"},{"11","10","01","00"},{"00","10","01","11"}, {"11","01","11","10"}};
    String [][] S1 = {{"00","01","10","11"},{"10","00","01","11"},{"11","00","01","00"}, {"10","01","00","11"}};
        
        System.out.println(S0[1][2]);
    }
    
    public char[] Lectura(File Archivo) throws FileNotFoundException, IOException
    {
         if(Archivo.exists()==true)
        {
            String Texto = "";
            FileReader LecturaArchivo;
            LecturaArchivo = new FileReader(Archivo);
            BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
            String Linea="";
            String SiguienteLinea="";
            Linea = LeerArchivo.readLine();
                while(Linea != null)
                {
                    SiguienteLinea = LeerArchivo.readLine();
                    Texto += Linea;

                    if (SiguienteLinea != null)
                        Texto += "λ";

                    Linea = SiguienteLinea;
                }
                LecturaArchivo.close();
                LeerArchivo.close();

                return Texto.toCharArray();
        }
        else
        {
         return "-1".toCharArray();
        }
    }
    
    
    public void Proceso() throws IOException
    {
        //Se Selecciona un Archivo, con el fin de probar por el momento sera este /Desktop/Prueba.txt
        File Archivo = new File("C:\\Users\\josue\\Desktop");
        HashMap<Integer,Character> AlmacendeLetras = new HashMap<Integer,Character>();
        
        //Se deben Generar las llaves para luego entrar a SDES
        //GenerarLlaves("Enviar el Arreglo de Int que se usara para generar la llave aqui");
        
        char[] Texto = Lectura(Archivo);
        for(char item: Texto)
        {
            int Auxiliar = Integer.parseInt(String.valueOf(item));
            if(AlmacendeLetras.containsKey(Auxiliar))
            {
                //El Mensaje Codificado puede ser un StringBuilder y solo ir concatenando el resultado de cada iteracion del ciclo, y de ultimo convertirlo a byte todo.
                //Se debe de buscar la letra, sino se encuentra entonces se debe hacer el proceso de codificado
            }else
            {
                //Hay que crear una funcion que complete los bytes por si la letra que se selecciona no cumple el byte completo (Los 8 Bits)
                //Se codifica la letra y se agrega al Diccionario
                //int CaracteraCodificar = ;
             
            }
        }
        
    }
    
   
    public void GenerarLlaves(int [] Entrada)
    {
        int[] K1 = P10(Entrada);
    }
    
    
    public int[] P10(int [] Entrada)
    {
        Constantes Datos = new Constantes();
        int [] ArregloAuxiliar = new int[Entrada.length];
                
        
        for(int i = 0; i<= Datos.P10.length; i++)
        {
            ArregloAuxiliar[i] = Entrada[Datos.P10[i]];
        }
        
        return ArregloAuxiliar;
    }
    
    public int[] P8(int [] Entrada)
    {
       Constantes Datos = new Constantes();
        int [] ArregloAuxiliar = new int[Datos.P8.length];
                
        
        for(int i = 0; i<=Datos.P8.length; i++)
        {
            ArregloAuxiliar[i] = Entrada[Datos.P8[i]];
        }
        
        return ArregloAuxiliar; 
    }
    
     public void LS1()
    {
    }
    
    public void LS2()
    {
    }
    
    public int [] P4(int [] Entrada)
    {
       Constantes Datos = new Constantes();
        int [] ArregloAuxiliar = new int[Entrada.length];
                
        
        for(int i = 0; i<=Datos.P4.length; i++)
        {
            ArregloAuxiliar[i] = Entrada[Datos.P4[i]];
        }
        
        return ArregloAuxiliar;     
    }
    
    public int[] EP(int [] Entrada)
    {
       Constantes Datos = new Constantes();
        int [] ArregloAuxiliar = new int[Datos.EP.length];
                
        
        for(int i = 0; i<3; i++)
        {
            ArregloAuxiliar[i] = Entrada[Datos.EP[i]];
        }
        
        for(int i = 3; i<=7; i++)
        {
            ArregloAuxiliar[i] = Entrada[Datos.EP[i]];
        }
        
        return ArregloAuxiliar;      
    }
    
    public int[] IPInverso(int [] Entrada)
    {
        Constantes Datos = new Constantes();
        int [] ArregloAuxiliar = new int[Entrada.length];
                
        
        for(int i = 0; i<= Datos.P10.length; i++)
        {
            ArregloAuxiliar[i] = Datos.P10[Entrada[i]];
        }
        
        return ArregloAuxiliar;   
    }
    
    public void S0Box()
    {
        
    }
    
    public void S1Box()
    {
        
    }
    
}
