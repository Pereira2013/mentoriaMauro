package br.com.projeto.mentoria.domain;

import jakarta.persistence.*;

import java.util.Objects;
@Entity(name = "db_teachers")
@Table(name = "db_teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "CPF")
    private String CPF;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher professor = (Teacher) o;
        return getId() == professor.getId() && Objects.equals(getName(), professor.getName()) && Objects.equals(getCPF(), professor.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCPF());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
