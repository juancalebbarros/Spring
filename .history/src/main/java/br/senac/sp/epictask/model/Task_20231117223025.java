package br.senac.sp.epictask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//ORM - JPA
//boilerplate

@Entity
@Data
public class Task {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @NotBlank
    String title;

    // not null
    // "" not empty
    // "   " not blank

    @Size(min = 10)
    String description;

    @Min(1)
    Integer score;


}
