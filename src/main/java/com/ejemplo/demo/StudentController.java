package com.ejemplo.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>();

    public StudentController(){
        //Inicializar lista
        students.add(new Student(2, "Estudiante 1"));
        students.add(new Student(1, "Estudiante 2"));
    }
    
    @GetMapping("/students")
    public List<Student> getStudents(){
            return students;
    }

}
