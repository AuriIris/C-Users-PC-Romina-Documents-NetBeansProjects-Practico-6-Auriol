/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.auriol;

import java.util.ArrayList;


/**
 *
 * @author PC-Romina
 */
public class Practico6Auriol {
 

    
    
    
    public static void main(String[] args) {
      Cliente cl=new Cliente(37638853,"Romina","Auriol","Abelardo 638","San Luis");
      Cliente cl1=new Cliente(26356356,"Brenda","Gaitan","Francia 638","San Juan");
      Directorio directorio=new Directorio();
      directorio.agregarCliente(Long.parseLong("2664389548"),cl);
      directorio.agregarCliente(Long.parseLong("2664123123"),cl1);
      directorio.buscarCliente(Long.parseLong("2664389548"));
      directorio.buscarTelefono("Gaitan");
      ArrayList<Cliente> cxCiudad=new ArrayList<Cliente>();
      cxCiudad= directorio.buscarClientes("San Luis");
        for (int i = 0; i <cxCiudad.size(); i++) {
            System.out.println("Se encontro en la Ciudad de San Luis" +  cxCiudad.get(i));
        }
      directorio.eliminar(Long.parseLong("2664389548"));
    }
    
}
