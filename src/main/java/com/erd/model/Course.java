package com.erd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    private Integer courseId;

    private String courseName;
    private String language;
    private Date startDate;
    private Integer numberOfWeeks;
    private String inSchool;
    private String level;

    @ManyToOne
    @JoinColumn(name = "client_client_id")
    @JsonIgnore
    private Client client;
    @ManyToMany
    private List<Participants> participantsList;
    @ManyToOne
    @JoinColumn(name = "client_teacher_id")
    @JsonIgnore
    private Teacher teacher;


}