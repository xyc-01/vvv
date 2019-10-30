package com.student.demo.controller;

import com.student.demo.entity.Student;
import com.student.demo.repository.UserRepository;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Stucontroller {


    @Resource
    UserRepository userRepository;
    //添加
    @PostMapping("/study")
    public Student Add(Student student) {
        return userRepository.save(student);
    }
    //删除
    @DeleteMapping(value = "/study/{sid}")
    public void Del(@PathVariable("sid") Long sid) {
        userRepository.deleteById(sid);
    }

    //private Long sid;
    //    private String name;
    //    private String gender;
    //    private Long age;
    //    private String remarks;
    //改
    @PutMapping(value = "/study/{sid}")
    public Student mod(@PathVariable("sid") Long sid,@RequestParam("name") String name,
                       @RequestParam("gender")String gender,@RequestParam("age")Long age,
                       @RequestParam("remarks")String remarks) {
        Student student=new Student();
        student.setSid(sid);
        student.setName(name);
        student.setGender(gender);
        student.setAge(age);
        student.setRemarks(remarks);
        return userRepository.save(student);
    }
    //查找
    @GetMapping("/study")
    public List<Student> delete() {
        return userRepository.findAll();
    }
    @GetMapping("/study/{sid}")
    public Student put( @PathVariable("sid")Long sid) {
        return userRepository.findById(sid).orElse(null);
    }

}
