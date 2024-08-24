package com.ejemplo.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.time.LocalDateTime;
import javax.xml.crypto.Data;


public class CitasMedicas {

    
    private LocalDateTime horario;
    private int    idCitas;
    private String doctor;
    private String especialidad;
    private String mesCita;
    private String paciente;    
    private String rutPaciente;
    private String prevision;
    


    public CitasMedicas (int idCitas,LocalDateTime horario, String doctor,String especialidad ,String mesCita, String paciente, String rutPaciente,String prevision) {

        this.idCitas     = idCitas;
        this.horario     = horario;
        this.doctor      = doctor;
        this.especialidad= especialidad;
        this.mesCita     = mesCita;
        this.paciente    = paciente;
        this.rutPaciente = rutPaciente;
        this.prevision   = prevision;

    
    }

    public int getIdCitas(){
        return idCitas;
    }
    public LocalDateTime getHorario (){
        return horario;
    }
    public String getDoctor (){
        return doctor;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public String getMescita(){
        return mesCita;
    }
    public String getPaciente (){
        return paciente;
    }
    public String getRutPaciente (){
        return rutPaciente;
    }
    public String getPrevision (){
        return prevision;
    }

}



