package com.bernieye.service;

import com.bernieye.domain.Student;
import java.util.List;
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
