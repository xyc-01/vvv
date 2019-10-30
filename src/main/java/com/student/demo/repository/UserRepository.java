package com.student.demo.repository;

import com.student.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student,Long> {
    Student findUserBysid(Long sid);
}
