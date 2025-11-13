package com.example.studentManagementApp.controller;

import com.example.studentManagementApp.model.Student;
import com.example.studentManagementApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {


    @Autowired
    StudentService studentService;


    @GetMapping("/welcome")
    public String getWelcome(){
        return "WELCOME";
    }

    @GetMapping("/student")
    public Student getStudentById(@RequestParam("id") int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentByPath(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentId(@PathVariable int id){
        return studentService.deleteStudentId(id);
    }

//    update age
    @PutMapping("/student/id/{id}/age/{age}")
    public  String updateAge(@PathVariable("id") int id,
                             @PathVariable("age") int age){
        return studentService.updateAge(id, age);
    }

    @PutMapping("/student")
    public String updateAgeByRequestParam(@RequestParam("id") int id,
                                          @RequestParam("age") int age){
        return studentService.updateAge(id, age);
    }

//    get the list of all students
    @GetMapping("/student/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }



}
