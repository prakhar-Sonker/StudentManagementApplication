package com.example.studentManagementApp.repository;

import com.example.studentManagementApp.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {


    HashMap<Integer, Student> studentDb = new HashMap<>();


    public Student getStudentById(int id) {
        if (!studentDb.containsKey(id)) {
            return null;
        }
        return studentDb.get(id);
    }

    public String addStudent(Student student) {
        if(studentDb.containsKey(student.getId())){
            return "Student already added";
        }
        studentDb.put(student.getId(), student);
        return "Student added Successfully";
    }

//    public Student getStudentByPath(int id) {
//        if(!studentDb.containsKey(id)){
//            return null;
//        }
//        return studentDb.get(id);
//    }

    public String updateStudent(int id, Student student) {
        if (!studentDb.containsKey(id)) {
            return "Student not found";
        }
        studentDb.put(id, student);
        return "Student updated successfully";
    }

    public String deleteStudentId(int id) {
        if(!studentDb.containsKey(id)){
            return "Student does not exist";
        }
        studentDb.remove(id);
        return "Student deleted successfully";
    }

    public String updateAge(int id, int age) {
        if(!studentDb.containsKey(id)){
            return "Invalid Student";
        }
        Student existingStudent = studentDb.get(id);
        existingStudent.setAge(age);
        studentDb.put(id, existingStudent);
        return "Student age updated successfully";
    }


    public List<Student> getAllStudents() {
        return new ArrayList<>(studentDb.values());

    }
}
