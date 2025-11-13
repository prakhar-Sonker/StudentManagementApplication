package com.example.studentManagementApp.service;

import com.example.studentManagementApp.repository.StudentRepository;
import com.example.studentManagementApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

//    public Student getStudentByPath(int id) {
//        return studentRepository.getStudentByPath(id);
//    }

    public String updateStudent(int id, Student student) {
        return studentRepository.updateStudent(id, student);
    }

    public String deleteStudentId(int id) {
        return studentRepository.deleteStudentId(id);
    }

    public String updateAge(int id, int age) {
        return studentRepository.updateAge(id, age);
    }


    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
