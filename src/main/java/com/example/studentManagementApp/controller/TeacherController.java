package com.example.studentManagementApp.controller;

import com.example.studentManagementApp.exceptions.TeacherExitsException;
import com.example.studentManagementApp.model.Teacher;
import com.example.studentManagementApp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

//    add teacher
    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher){
        try{
            return teacherService.addTeacher(teacher);
        }
        catch (TeacherExitsException e){
            return e.getMessage();
        }
    }

//    get teacher by id
    @GetMapping("")
    public Teacher getTeacher(@RequestParam("id") int id){
        return teacherService.getTeacher(id);
    }
//    option-2
    @GetMapping("/{id}")
    public Teacher getTeacherByPathVariable(@PathVariable("id") int id){
        return teacherService.getTeacher(id);
    }

//    update teacher
    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable int id, @RequestBody Teacher teacher){
        return teacherService.updateTeacher(id, teacher);
    }

//    renove teacher record
    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable int id){
        return teacherService.deleteTeacher(id);
    }

//    get all records
    @GetMapping("/all")
    public List<Teacher> getList(){
        return teacherService.getList();

    }
}
