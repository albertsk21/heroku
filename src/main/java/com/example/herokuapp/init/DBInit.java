package com.example.herokuapp.init;


import com.example.herokuapp.entity.StudentEntity;
import com.example.herokuapp.repo.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {


    private StudentRepository studentRepository;

    public DBInit(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(studentRepository.count() == 0){
            this.studentRepository.save(new StudentEntity("Pesho",22));
            this.studentRepository.save(new StudentEntity("Vadim",23));
        }
    }
}
