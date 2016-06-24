/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos_Migrante;
import Vista.FRM_Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JoséFabián
 */
public class Controlador_FRM_Ventana implements ActionListener{
    
    FRM_Ventana ventana;
    Metodos_Migrante metodos;
    public Controlador_FRM_Ventana(FRM_Ventana ventana){
        this.ventana=ventana;
        metodos = new Metodos_Migrante();
    }

    public void actionPerformed(ActionEvent e) {
    
        if(e.getActionCommand().equals("Registrar cita")){
            System.out.println("registro");
            
            metodos.registrar(ventana.regresarInfoPantalla());
            ventana.clear();
        }
        
        if(e.getActionCommand().equals("Buscar")){
            System.out.println("BUSCA");
            
            if(metodos.buscar(ventana.regresarInfoPantalla()[0])!=null)
            {    
                ventana.setearInfo(metodos.buscar(ventana.regresarInfoPantalla()[0]));
                ventana.desActivarCedula();
                ventana.activarModificarCancelar();
            }else{
                ventana.clear();
                ventana.mostrarInfoEnPantalla("La cedula no fue encontrada");
            }
        }
        
        if(e.getActionCommand().equals("Cancelar cita")){
            System.out.println("cancela");
            
            metodos.cancelar(ventana.regresarInfoPantalla()[0]);
            ventana.clear();
            ventana.activarCedula();
            ventana.desActivarModificarCancelar();
        }
        
        if(e.getActionCommand().equals("Modificar información cita")){
            System.out.println("modifica");
            metodos.modificar(ventana.regresarInfoPantalla(), ventana.regresarInfoPantalla()[0]);
            ventana.clear();
            ventana.activarCedula();
            ventana.desActivarModificarCancelar();
        }
        
        if(e.getActionCommand().equals("Atender cliente siguiente")){
            System.out.println("ATIENDE");
            
            metodos.eliminar();
        }
        
        if(e.getActionCommand().equals("<")){
            System.out.println("menor mayor");
        }
        
        if(e.getActionCommand().equals(">")){
            System.out.println("mayor menor");
        }
        
        if(e.getActionCommand().equals("Mostrar reportes")){
            System.out.println("reportes");
            ventana.mostrarInfoEnPantalla(metodos.devolverLista());
        }
    }
}
