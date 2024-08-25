
package com.ejemplo.demo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
@RestController

public class ProductosMascotasController {
    
    private List<ProductosMascotas> productosMascotas = new ArrayList<>();

    public ProductosMascotasController(){

        //Inicializar y llenar lista con los datos

        productosMascotas.add(new ProductosMascotas("1", "5 Sacos De Comida para perro Dog Chow Adulto 20 kilos", "Juan Pérez", "pasaje 17 sur 3922", LocalDateTime.of(2024, 8, 20, 10, 0), "Entregado"));
        productosMascotas.add(new ProductosMascotas("2", "Juguete para gato", "Ana López", "pasaje valle del el elqui 1974", LocalDateTime.of(2024, 8, 21, 11, 30), "En tránsito"));
        productosMascotas.add(new ProductosMascotas("3", "10 Sacos De Comida Para Gato Whiskas 10 Kilos", "Raul Currimilla", "valle la luna 3002", LocalDateTime.of(2024, 8, 17, 11, 30), "Para Enviar"));
        productosMascotas.add(new ProductosMascotas("4", "Cama de Mascota Para Perro Grande", "Gabriel Silva", "Gil de Castro 03922", LocalDateTime.of(2024, 8, 22, 11, 30), "Salio del Centro de Distribucion"));
        productosMascotas.add(new ProductosMascotas("5", "20 Sachet De Pedigree Sabor Carne ", "Camila Soto", "Calle Mexico 5412", LocalDateTime.of(2024, 8, 21, 13, 30), "Recibido por el Transportista"));
    }



    @GetMapping ("/productomascotas")
        public List<ProductosMascotas> getProductosMascotas(){
            return productosMascotas;
        }

  
}

