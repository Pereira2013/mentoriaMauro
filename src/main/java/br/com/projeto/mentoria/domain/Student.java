package br.com.projeto.mentoria.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity(name = "db_students")
@Table(name = "db_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "CPF", nullable = false, unique = true, length = 15)
    private String CPF;
    @Column(name = "birthday", nullable = false)
    private Instant birthday;
    @Column(name = "email", nullable = false, unique = true, length = 30)
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

    public Instant getBirthday() {
        return birthday;
    }

    public void setAge(Instant birthday) {
        this.birthday = birthday;
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
        Student student = (Student) o;
        return getId() == student.getId() && status == student.status && Objects.equals(getName(), student.getName()) && Objects.equals(getCPF(), student.getCPF()) && Objects.equals(getBirthday(), student.getBirthday()) && Objects.equals(getEmail(), student.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCPF(), getBirthday(), getEmail());
    }
}
