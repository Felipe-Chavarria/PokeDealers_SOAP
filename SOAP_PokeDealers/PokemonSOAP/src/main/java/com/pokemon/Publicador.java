package com.pokemon;

import javax.xml.ws.Endpoint;

public class Publicador {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/cartas", new ServicioSOAP());
        System.out.println("Servicio publicado en http://localhost:8080/cartas");
    }
}