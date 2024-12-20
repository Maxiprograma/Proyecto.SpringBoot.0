package com.example.SpringBootRest.entities;

import jakarta.persistence.*;
import lombok.*;
//@Data
@Getter
@Setter
@Table
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name="name")
private   String name;
@Column(name="lastname")
private String lastName;
@Column(name="phone")
private int phone;
@ManyToOne
   @JoinColumn(name="id_suppplier",nullable = false)
   private Optica optica;

}
