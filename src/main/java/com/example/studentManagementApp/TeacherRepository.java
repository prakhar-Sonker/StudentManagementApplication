package com.example.studentManagementApp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TeacherRepository {

    HashMap<Integer, Teacher> teacherDb = new HashMap<>();

    public String addTeacher(Teacher teacher) {
        if(teacherDb.containsKey(teacher.getId())){
            return "Teacher already exists";
        }
        teacherDb.put(teacher.getId(), teacher);
        return "Teacher added Successfully";
    }

    public Teacher getTeacher(int id) {
        if(!teacherDb.containsKey(id)){
            return null;
        }
        return teacherDb.get(id);
    }

    public Teacher updateTeacher(int id, Teacher teacher) {
        if(!teacherDb.containsKey(id)){
            return null;
        }
        teacherDb.put(id, teacher);
        return teacher;

    }

    public String deleteTeacher(int id) {
        if(!teacherDb.containsKey(id)){
            return "Invalid record";
        }
        teacherDb.remove(id);
        return "Teacher deleted Successfully";
    }
}
