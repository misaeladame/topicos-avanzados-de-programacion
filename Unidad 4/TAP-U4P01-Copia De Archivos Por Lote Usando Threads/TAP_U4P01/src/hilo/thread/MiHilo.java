/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que realiza la copia de archivos
:*        
:*  Archivo     : MiHilo.java
:*  Autor       :  Jorge Arturo Galindo Uribe        18131238
:*                  José Misael Adame Sandoval     18131209 
                    Ricardo Raúl Castro Luna        18131227
:*                  
:*  Fecha       : 8 de juniode 2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Clase que realiza la copia de los archivos usando
                        clases como File, FileOutPutStream, FileInputStream,
                        y utilizando hilos para realizar la operación con el método
                        run, así como getters y setter para el destino y el archivo a copiar.
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  08/junio/2020      Arturo Galindo       Agregar Prólogo
:*------------------------------------------------------------------------------------------*/
package hilo.thread;

import app.PruebasGridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*----------------------------------------------------------------------------*/

public class MiHilo extends Thread {

    /*----------------------------------------------------------------------------*/
    
    private File archivo;
    private PruebasGridLayout frame = new PruebasGridLayout();
    private String destino = "";
    private JProgressBar progressBar = new JProgressBar();

    /*----------------------------------------------------------------------------*/
    
    public MiHilo(){
        super();
    }
    
    /*----------------------------------------------------------------------------*/
    
    public MiHilo( File archivo, String destino, JProgressBar progressBar){
        super( archivo.getName() );
        this.archivo = archivo;
        this.destino = destino;
        this.progressBar = progressBar;
    }
    
    /*----------------------------------------------------------------------------*/
    
    @Override
    public void run(){
        File origen = new File(archivo.getAbsolutePath());
        if(!(Files.exists(Paths.get(destino + File.separator +  archivo.getName())))){ 
            File copia = new File(destino + File.separator +  archivo.getName());
            FileInputStream fin = null;
            FileOutputStream fout = null;
            
            byte[] buf = new byte[1024];
            long largo = origen.length();
            
            int r = 0;
            long count = 0;
            
            try {
                
                fin = new FileInputStream( origen );
                fout = new FileOutputStream( copia );
                
                while ((r = fin.read(buf)) != -1) {
                    count += r;
                    frame.setProgreso( ( (100 * count) / largo ), progressBar );
                    fout.write(buf, 0, r);
                    
                    
                    Thread.sleep( 10 );
                }
                
                frame.setProgreso( 100 , progressBar );
                fin.close();
                fout.close();
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog( null, ex );
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog( null, ex );
            }
        }
    }

    /*----------------------------------------------------------------------------*/
    
    public File getArchivo() {
        return archivo;
    }

    /*----------------------------------------------------------------------------*/
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /*----------------------------------------------------------------------------*/
    
    public String getDestino() {
        return destino;
    }

    /*----------------------------------------------------------------------------*/
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    /*----------------------------------------------------------------------------*/
}
