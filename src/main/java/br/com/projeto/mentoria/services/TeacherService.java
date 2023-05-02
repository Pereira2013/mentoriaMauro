package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    public Teacher create(Teacher teacher) {
        return new TeacherRepository().create(teacher);
    }

    public List<Teacher> findAll() {

        return new TeacherRepository().findAll();
    }

    public Teacher findById(int id) {

        return new TeacherRepository().findById(id);
    }

    public void update(Teacher teacher, int id) {
        new TeacherRepository().update(teacher);
    }

    public void delete(int id) {
        new TeacherRepository().delete(id);
    }

}
