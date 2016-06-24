/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JoséFabián
 */
public class Metodos_Migrante {

    NodoMigrante primero;
    Migrante migrante;
    public Metodos_Migrante(){
        
    }
    
    public void registrar(String info[]){
        NodoMigrante auxiliar=primero;
        if(primero==null){
            
            primero = new NodoMigrante(new Migrante(info[0], info[1], info[2], info[3],info[4]), null);
        }
        else{
//            NodoMigrante auxiliar = devolverUltimo().getSiguiente();
//            auxiliar =new NodoMigrante(new Migrante(info[0], info[1], info[2], info[3],info[4]), null);
            agregarAlFinal(new Migrante(info[0], info[1], info[2], info[3],info[4]));
//            while(auxiliar.getSiguiente()!=null){
//                if(auxiliar.getDato().getPrioridad().equals("Normal") && auxiliar.getSiguiente().getDato().getPrioridad().equals("7600"))
//                {
//                    Migrante temp = auxiliar.getSiguiente().getDato();
//                    auxiliar.getSiguiente().setDato(auxiliar.getDato());
//                    auxiliar.setDato(temp);
//                    System.out.println("realiza cambio");
//                }
//                auxiliar = auxiliar.getSiguiente();
//            }
//                ordenarPrioridad();
            
        }
    }
    
    public String devolverLista(){
        NodoMigrante auxiliar=primero;
        String valores="";
        
        valores+="En la cola hay una cantidad de personas de "+cantPersonas()+"\n";
        while(auxiliar!=null){
            
            valores+="El migrante "+auxiliar.getDato().getNombre()+"\nCon la cedula "+auxiliar.getDato().getCedula()+"\nCon una edad de "+
                    auxiliar.getDato().getEdad()+"\nQue posee una prioridad "+auxiliar.getDato().getPrioridad()+"\nEn la fecha "+auxiliar.getDato().getFechaSolicitud()+"\n";
//            valores+=auxiliar.getDato()+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
        
        return valores;
    }
    
    public int cantPersonas(){
          NodoMigrante auxiliar=primero;
        int numero=0;
        while(auxiliar!=null){
            numero++;
            auxiliar=auxiliar.getSiguiente();
        }
        return numero;
    }
    
    public void eliminar(){
        NodoMigrante auxiliar=primero;
        
        while(auxiliar!=null){
            auxiliar.setDato(auxiliar.getSiguiente().getDato());
            auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
           
            auxiliar= auxiliar.getSiguiente();
        }
    }
    
    public String[] buscar(String cedula){
        NodoMigrante auxiliar=primero;
        String index="";
        String informacion[]=null;
        while(auxiliar!=null){
            if(auxiliar.getDato().getCedula().equals(cedula)){
                if(auxiliar.getDato().getPrioridad().equals("Normal")){
                    index="0";
                }else if(auxiliar.getDato().getPrioridad().equals("7600")){
                    index="1";
                }
                informacion= new String[]{auxiliar.getDato().getCedula(),auxiliar.getDato().getNombre(),auxiliar.getDato().getEdad(),index,auxiliar.getDato().getFechaSolicitud()};
            }
            auxiliar=auxiliar.getSiguiente();
        }
        return informacion;
    }
    
    public void cancelar(String cedula){
        
    NodoMigrante auxiliar=primero;
//    NodoMigrante auxiliar2=primero;
        while(auxiliar!=null){
            if(auxiliar.getDato().getCedula().equals(cedula)){
                while(auxiliar!=null){
                    auxiliar.setDato(auxiliar.getSiguiente().getDato());
                    auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                    auxiliar=auxiliar.getSiguiente();
                }
            }
            if(auxiliar!=null){
                auxiliar=auxiliar.getSiguiente();
            }
         }
    }
    
    public void modificar(String[] info, String cedula){
        NodoMigrante auxiliar=primero;
        
        while(auxiliar!=null){
            if(auxiliar.getDato().getCedula().equals(cedula)){
                auxiliar.setDato(new Migrante(info[0], info[1], info[2], info[3],info[4]));
            }
            auxiliar=auxiliar.getSiguiente();
        }
    }
//    public void ordenarMayorMenor(){
//    NodoMigrante auxiliar = primero;
//    NodoMigrante auxiliar2;
//    while(auxiliar!=null){
//            auxiliar2  = auxiliar.getSiguiente();
//            while(auxiliar2!=null){
////                if(Integer.parseInt(auxiliar.getDato())  < Integer.parseInt(auxiliar2.getDato())){
////                    
////                    String temp = auxiliar.getDato();
////                    auxiliar.setDato(auxiliar2.getDato());
////                    auxiliar2.setDato(temp);
////                }
////                
//                auxiliar2 = auxiliar2.getSiguiente();
//            }
//            auxiliar= auxiliar.getSiguiente();
//        }
//    }
    public void agregarAlFinal(Migrante dato){
        NodoMigrante auxiliar=devolverUltimo();
//        System.out.println("dato al final "+ auxiliar.getDato()+ "\n nuevo dato al final "+dato);
        auxiliar.setSiguiente(new NodoMigrante(dato,null));
    }
    public void ordenarPrioridad(){
        NodoMigrante auxiliar = primero;
        NodoMigrante auxiliar2=primero.getSiguiente();
        while(auxiliar.getSiguiente()!=null){
            auxiliar2=auxiliar.getSiguiente();
            while(auxiliar2.getSiguiente()!=null){
            if(auxiliar.getDato().getPrioridad().equals("Normal") && auxiliar2.getSiguiente().getDato().getPrioridad().equals("7600"))
            {
                    Migrante temp= auxiliar.getDato();
                    auxiliar.setDato(auxiliar2.getDato());
                    auxiliar2.setDato(temp);
                    auxiliar2=null;
            }
            else{
                auxiliar2=auxiliar2.getSiguiente();
            }
            }
            auxiliar= auxiliar.getSiguiente();
       }
    }
    public NodoMigrante devolverUltimo(){
        NodoMigrante auxiliar=primero;
        while(auxiliar.getSiguiente()!=null){
            auxiliar=auxiliar.getSiguiente();
        }
        System.out.println("el ultimo fue "+auxiliar.getDato().getNombre());
         return auxiliar;
    }
}
