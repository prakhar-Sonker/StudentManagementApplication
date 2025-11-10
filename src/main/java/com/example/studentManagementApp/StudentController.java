package com.example.studentManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    HashMap<Integer,Student> studentDb = new HashMap<>();


    @GetMapping("/welcome")
    public String getWelcome(){
        return "WELCOME";
    }

    @GetMapping("/student")
    public Student getStudentById(@RequestParam("id") int id){
        if(!studentDb.containsKey(id)){
            return null;
        }
        return studentDb.get(id);
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        if(studentDb.containsKey(student.getId())){
            return "Student already added";
        }
        studentDb.put(student.getId(), student);
        return "Student added Successfully";
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        if(!studentDb.containsKey(id)){
            return null;
        }
        return studentDb.get(id);
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        if (!studentDb.containsKey(id)) {
            return "Student not found";
        }
        studentDb.put(id, student);
        return "Student updated successfully";
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentId(@PathVariable int id){
        if(!studentDb.containsKey(id)){
            return "Student does not exist";
        }
        studentDb.remove(id);
        return "Student deleted successfully";
    }

//    update age
    @PutMapping("/student/id/{id}/age/{age}")
    public  String updateAge(@PathVariable("id") int id,
                             @PathVariable("age") int age){
        if(!studentDb.containsKey(id)){
            return "Invalid Student";
        }
        Student existingStudent = studentDb.get(id);
        existingStudent.setAge(age);
        studentDb.put(id, existingStudent);
        return "Student age updated successfully";
    }



}
