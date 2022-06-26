package com.erd.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Teacher {
    @Id
    private Integer teacherId;
    private String first_name;
    private String last_name;
    private Date dob;
    private String phone;
    private String language1;
    private String language2;
    private Integer taxId;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    List<Course> courseList;




}
