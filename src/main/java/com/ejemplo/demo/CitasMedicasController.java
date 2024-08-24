package com.ejemplo.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class CitasMedicasController {

    private List<CitasMedicas> citasmedicas = new ArrayList<>();

    public CitasMedicasController(){

        //Inicializar lista

        citasmedicas.add(new CitasMedicas(1,LocalDateTime.of(2024, 8, 23 , 15, 00, 0), "Manuel Guzman","Medico general", "Agosto", "Victor Nuñez", "16.329.585-7","Fonasa"));
        citasmedicas.add(new CitasMedicas(2,LocalDateTime.of(2024, 8, 20 , 13, 15, 0), "Francisco Perez", "Gastroenterologo","Agosto", "Bastian Diaz", "20.048.632-2","Fonasa"));
        citasmedicas.add(new CitasMedicas(3,LocalDateTime.of(2024, 8, 17 , 16, 30, 0), "Paula Armijo","Ginecologo","Octubre", "Elena Gonzalez", "12.321.456-2","Fonasa"));
        citasmedicas.add(new CitasMedicas(4,LocalDateTime.of(2024, 8, 03 , 17, 50, 0), "Denisse Fernandez","Oftalmología","Septiembre", "Marianela Cabello", "14.854.922-5","Fonasa"));
        citasmedicas.add(new CitasMedicas(4,LocalDateTime.of(2024, 8, 01 , 10, 15, 0), "Lisette Arevalo","Otorrinolaringología","Septiembre", "Jesica Arismendi", "17.654.789-7","Fonasa"));
    }


    @GetMapping ("/citasmedicas")
        public List<CitasMedicas> getCitasMedicas(){
            return citasmedicas;
        }

    //consultar cita por Fecha
    
    @GetMapping("/fecha")
    public ResponseEntity<List<CitasMedicas>> getCitasByFecha(@RequestParam("fecha") String fecha) {
        LocalDateTime fechaConsulta;
        try {
            fechaConsulta = LocalDateTime.parse(fecha);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
           List<CitasMedicas> citasFiltradas = citasmedicas.stream()
                .filter(c -> c.getHorario().toLocalDate().isEqual(fechaConsulta.toLocalDate()))
                .collect(Collectors.toList());

        return citasFiltradas.isEmpty() ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(citasFiltradas, HttpStatus.OK);
    
    }    
}
