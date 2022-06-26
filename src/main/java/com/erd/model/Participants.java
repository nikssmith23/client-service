package com.erd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "participant")
public class Participants {
    @Id
    private Integer participantId;
    private String first_name;
    private String last_name;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "client_client_id")
    @JsonIgnore
    private Client client;
    @ManyToMany
    private List<Course> courseList;


}