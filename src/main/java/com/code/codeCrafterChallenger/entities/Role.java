package com.code.codeCrafterChallenger.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Role {
  @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private  String desc ;
    @Column(length = 20, unique = true)
    String nameRole ;
    @ManyToMany (fetch = FetchType.EAGER)

    private List<User> users= new ArrayList<>();
}
