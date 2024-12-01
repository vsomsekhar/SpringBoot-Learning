package com.vsomsekhar.springbootweb.SpringBoot.Web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.AUTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GamerEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private LocalDate dob;
    private  boolean isPro;

}
