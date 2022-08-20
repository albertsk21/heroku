package com.example.herokuapp.service;


import com.example.herokuapp.dto.StudentDTO;
import com.example.herokuapp.entity.StudentEntity;
import com.example.herokuapp.repo.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentEntity> studentEntities = this.studentRepository.findAll();
        List<StudentDTO> students = new ArrayList<>();

        for (StudentEntity student : studentEntities) {
            students.add(this.modelMapper.map(studentEntities,StudentDTO.class));
        }
        return students;
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {

    }
}
