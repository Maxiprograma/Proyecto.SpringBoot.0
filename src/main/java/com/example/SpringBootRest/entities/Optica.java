package com.example.SpringBootRest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="rubros")

public class Optica {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;

@Column(name="nombre")
private String name;

@OneToMany(mappedBy = "rubrooptica",cascade=CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
@JsonIgnore
private List<Article> articulos= new ArrayList<>();
private List <User> user=new ArrayList<>();


}
