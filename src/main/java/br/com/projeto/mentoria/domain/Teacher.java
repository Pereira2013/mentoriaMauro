package br.com.projeto.mentoria.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "db_teachers")
@Table(name = "db_teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "CPF", nullable = false, length = 15)
    private String CPF;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "status", nullable = false)
    private boolean status;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } //newId?

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() && getAge() == teacher.getAge() && Objects.equals(getName(), teacher.getName()) && Objects.equals(getCPF(), teacher.getCPF()) && Objects.equals(getEmail(), teacher.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCPF(), getAge(), getEmail());
    }
}
