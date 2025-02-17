package com.example;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String teckStack;
    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendation;

    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setLearningPathRecommendation(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }


    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String teckStack, String learningPathRecommendation) {
        this.id = id;
        this.name = name;
        this.teckStack = teckStack;
        this.learningPathRecommendation = learningPathRecommendation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeckStack() {
        return teckStack;
    }

    public void setTeckStack(String teckStack) {
        this.teckStack = teckStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(teckStack, that.teckStack) && Objects.equals(learningPathRecommendation, that.learningPathRecommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teckStack, learningPathRecommendation);
    }
}
