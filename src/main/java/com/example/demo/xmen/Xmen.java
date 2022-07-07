package com.example.demo.xmen;

import javax.persistence.*;

@Entity
@Table
public class Xmen {
    @Id
    @SequenceGenerator(
            name = "xmen_sequence",
            sequenceName = "xmen_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "xmen_sequence"
    )

    private Long id;
    private String name;
    private String alias;
    private String powers;
    private String img;

    public Xmen() {
    }

    public Xmen(Long id, String name, String alias, String powers, String img) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.powers = powers;
        this.img = img;
    }

    public Xmen(String name, String alias, String powers, String img) {
        this.name = name;
        this.alias = alias;
        this.powers = powers;
        this.img = img;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Xmen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", powers='" + powers + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
