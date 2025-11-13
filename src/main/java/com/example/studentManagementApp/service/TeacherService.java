package com.example.studentManagementApp.service;

import com.example.studentManagementApp.repository.TeacherRepository;
import com.example.studentManagementApp.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;


    public String addTeacher(Teacher teacher){
        return teacherRepository.addTeacher(teacher);
    }

    public Teacher getTeacher(int id) {
        return teacherRepository.getTeacher(id);
    }

    public Teacher updateTeacher(int id, Teacher teacher) {
        return teacherRepository.updateTeacher(id, teacher);
    }

    public String deleteTeacher(int id) {
        return teacherRepository.deleteTeacher(id);
    }

    public List<Teacher> getList() {
        return teacherRepository.getList();
    }
}
