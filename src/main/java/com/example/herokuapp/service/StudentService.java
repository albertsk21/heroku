package com.example.herokuapp.service;

import com.example.herokuapp.dto.StudentDTO;

import java.util.List;

public interface StudentService {


    List<StudentDTO> getAll();
    void saveStudent(StudentDTO studentDTO);
}
