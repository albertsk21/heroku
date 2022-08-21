package com.example.herokuapp.web;

import com.example.herokuapp.dto.StudentDTO;
import com.example.herokuapp.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        return ResponseEntity.ok(this.studentService.getAll());
    }

}
