package com.example.Cuentas.controllers;
import com.example.Cuentas.clientes.ResultadoClienteRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OperacionController {
    @Autowired
    private RestTemplate clienteRest;
    @Autowired
    private ResultadoClienteRest clienteFeign;

    @GetMapping("/sumar")
    public String sumar (@RequestParam float a, @RequestParam float b)
    {
        String resultado= Float.toString(a+b);
        return clienteRest.getForObject("https://resultaditos.onrender.com/"+resultado, String.class);
    }
    @GetMapping("/restar")
    public String resta (@RequestParam Float a, @RequestParam Float b)
    {
        return clienteFeign.mostrarResultado(a-b);
    }
}