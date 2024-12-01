package com.vsomsekhar.springbootweb.SpringBoot.Web.dtos;

import java.time.LocalDate;

public class GamerDTO {

    private Long id;
    private String name;
    private LocalDate dob;
    private  boolean isPro;

    public GamerDTO() {
    }

    public GamerDTO(Long id, String name, LocalDate dob, boolean isPro) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.isPro = isPro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isPro() {
        return isPro;
    }

    public void setPro(boolean pro) {
        isPro = pro;
    }
}
