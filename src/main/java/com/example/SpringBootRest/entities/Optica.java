package com.example.SpringBootRest.entities;

import jakarta.persistence.*;
import lombok.*;

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

//@OneToMany(mappedBy = "rubrooptica",cascade=CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
//private List<Article> articulos= new ArrayList<>();
//private List <User> user=new ArrayList<>();


}
