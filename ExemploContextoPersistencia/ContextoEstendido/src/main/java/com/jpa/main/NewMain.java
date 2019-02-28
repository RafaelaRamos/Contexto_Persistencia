/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.main;

import com.jpa.contextoestendido.Usuario;
import com.jpa.contextoestendido.PersistirUsuario;


/**
 *
 * @author Cliente
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersistirUsuario up= new PersistirUsuario();
        Usuario u = new Usuario("usuario4@gmail.com","Usuario","senha123","0800");
        
        up.persistir(u);
        
    }
    
}
