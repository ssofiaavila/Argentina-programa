/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miaplicacion.primerproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sofia
 */
@RestController
public class HolaController {
    @GetMapping("/hola/{nombre}")

    public String decirHola(@PathVariable String nombre){
        return "Hello world "+ nombre;
    }
    
    /**
     *
     * @param cli
     */
    @PostMapping ("/hola")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos del cliente: "+ cli.getNombre() + " Apellido:  "+ cli.getApellido());
    }
}
