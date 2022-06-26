package com.erd.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Client {
    @Id
    private Integer clientId;
    private String clientName;
    private String address;
    private String industry;
    @OneToMany(mappedBy = "client")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Participants> ParticipantList = new ArrayList<>();

    @OneToMany(mappedBy = "client")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Course> courseList = new ArrayList<>();


}
