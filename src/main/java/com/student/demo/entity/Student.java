package com.student.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="Student",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"sid"})
})
@Setter
public class Student {
    @Id
    private Long sid;
    private String name;
    private String gender;
    private Long age;
    private String remarks;


}
