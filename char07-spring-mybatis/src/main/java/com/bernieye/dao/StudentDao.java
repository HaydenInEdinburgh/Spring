package com.bernieye.dao;

import com.bernieye.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudent();
}
