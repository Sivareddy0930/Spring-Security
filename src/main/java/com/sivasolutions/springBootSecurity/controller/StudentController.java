package com.sivasolutions.springBootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();
    public StudentController() {
        students.add(new Student(1, "John Doe", 99));
        students.add(new Student(2, "Jane Smith", 98));
    }

    @GetMapping("/students")
    public List<Student> getStudentList(){
            return students;
    }

    @PostMapping("/newStudent")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
