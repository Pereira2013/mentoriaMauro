package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Teacher;

import java.util.List;

public class TeacherRepository {
    public Teacher create(Teacher teacher) {
        System.out.println("salvando" + teacher.toString());
        return null;//teacherRepository.save(teacher);
    }

    public List<Teacher> findAll() {
        System.out.println("findall");


        return null;
    }

    public Teacher findById(int id) {

        System.out.println("findById");
        return null; // teacherRepository.findById;
    }

    public void update(Teacher teacher) {
        System.out.println("update" + teacher.toString());

        //teacherRepository.save(teacher);
    }

    public void delete(int id) {
        System.out.println("delete");

        //teacherRepository.deleteById(id);
    }
}
