package com.code.codeCrafterChallenger.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table
@Data @NoArgsConstructor @AllArgsConstructor

public class User {
    @Id
    private  String idUser ;
    @Column(unique = true , length = 20)
    private  String nomUser ;
    private  String password ;
    private  String email;
    @OneToOne ( mappedBy = "USERS" , fetch = FetchType.EAGER)
    private List<Role> roles= new ArrayList<>();


}
