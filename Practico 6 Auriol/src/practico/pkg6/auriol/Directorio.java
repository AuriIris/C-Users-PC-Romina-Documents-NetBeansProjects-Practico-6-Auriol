/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.auriol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
//import static java.util.Collections.list;
import java.util.Map;
//import javax.swing.JOptionPane;

/**
 *
 * @author PC-Romina
 */
public class Directorio {

    //Esto te lo saque
//    public Directorio() {
//        Practico6Auriol.getDirectorios();
//
//    }

    public void agregarCliente(long telefono, Cliente cliente) {
       
      //  System.out.println(telefono + " " + cliente);
        frmMenuPrincipal.getDirectorios().put(telefono, cliente);
        
        System.out.println("Se cargo correctamente:" + cliente.getApellido() + " " + cliente.getNombre() + " " + cliente.getDni() + " " + cliente.getCiudad() + " " + telefono);
        //JOptionPane.showMessageDialog(null,"Se cargo correctamente:"+ cliente.getApellido()+cliente.getDni()+cliente.getCiudad()+cliente.getNombre()+telefono);

    }

    public String buscarCliente(long telefono) {
        boolean a=false;
        for (Map.Entry<Long, Cliente> e : frmMenuPrincipal.getDirectorios().entrySet()) {

            Long numero = Long.parseLong(e.getKey().toString());
            if (numero == telefono) {
                    a=true;
                    return ("Se encontro: "+e.getValue().getApellido() + " " + e.getValue().getNombre() + " " + e.getValue().getDni() + " " + e.getValue().getCiudad() + " " + telefono);
            }
        }
        return null;
    }
     public String buscarTelefono(String apellido) {
         Cliente c=new Cliente();
          boolean a=false;
        for (Map.Entry<Long, Cliente> e : frmMenuPrincipal.getDirectorios().entrySet()) {
            c=e.getValue();
            Long numero = Long.parseLong(e.getKey().toString());
            if (c.getApellido().equals(apellido)) {
                a=true;
                return ("Se encontro el telefono de : "+e.getValue().getApellido() + " es: " + numero);
            }  
            else if(a==false)
            {
                return "No se encontro el elemento";
            }
        }
        return null;
    }   
     public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> cxCiudad=new ArrayList<Cliente>();
          Cliente c=new Cliente();
        for (Map.Entry<Long, Cliente> e : frmMenuPrincipal.getDirectorios().entrySet()) {
            c=e.getValue();
            Long numero = Long.parseLong(e.getKey().toString());
            if (c.getCiudad().equals(ciudad)) {
                    cxCiudad.add(c);
                    System.out.println("Se encontro: " + c);
            }
        }
        return cxCiudad;
    }
    public Cliente eliminar(long dni) {
            Cliente c1=new Cliente();
          boolean a=false;
        for (Map.Entry<Long, Cliente> e : frmMenuPrincipal.getDirectorios().entrySet()) {
            if (e.getValue().getDni()== dni ) {
                c1= e.getValue();
               
            }  
           
        }
       Map <Long,Cliente> listadatos = frmMenuPrincipal.getDirectorios();
     
        Iterator it=listadatos.values().iterator();
        while (it.hasNext()){
        
            Cliente dato=(Cliente)it.next();
            if(dato.getDni()==dni)
            {
            it.remove();
            }
        }
        return c1;
         
        }
        
  
    
}
