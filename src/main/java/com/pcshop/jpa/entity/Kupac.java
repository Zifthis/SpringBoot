package com.pcshop.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

//LAMBO - getters/setters i constructor
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Kupac {

    @Id
    @GeneratedValue
    private int id;
    private String ime;
    private String prezime;
    @OneToMany(targetEntity = Racunalo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "kp_fk", referencedColumnName = "id")
    private List<Racunalo> racunaloList;




}
