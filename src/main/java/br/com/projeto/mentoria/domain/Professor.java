package br.com.projeto.mentoria.domain;

import java.util.Objects;

public class Professor {
    private int id;
    private String name;
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
        Professor professor = (Professor) o;
        return getId() == professor.getId() && Objects.equals(getName(), professor.getName()) && Objects.equals(getCPF(), professor.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCPF());
    }
}
