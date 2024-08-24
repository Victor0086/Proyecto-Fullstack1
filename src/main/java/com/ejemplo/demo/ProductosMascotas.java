package com.ejemplo.demo;

import java.time.LocalDateTime;

public class ProductosMascotas {


    private  String idEnvio;
    private  String producto;
    private  String destinatario;
    private  String direccionDestino;
    private  LocalDateTime fechaEnvio;
    private  String ubicacionActual;



    public ProductosMascotas(String idEnvio, String producto, String destinatario, String direccionDestino, LocalDateTime fechaEnvio, String ubicacionActual) {
        this.idEnvio = idEnvio;
        this.producto = producto;
        this.destinatario = destinatario;
        this.direccionDestino = direccionDestino;
        this.fechaEnvio = fechaEnvio;
        this.ubicacionActual = ubicacionActual;
    }


    public String getIdEnvio() {
        return idEnvio;
    }

    public String getProducto() {
        return producto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

}
