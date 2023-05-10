package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.repositories.GenericTeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private final GenericTeacherRepository genericTeacherRepository;

    public TeacherService(GenericTeacherRepository genericTeacherRepository) {
        this.genericTeacherRepository = genericTeacherRepository;
    }

    public Teacher create(Teacher teacher) {

        return genericTeacherRepository.save(teacher);
    }

    public List<Teacher> findAll() {

        return genericTeacherRepository.findAll();
    }

    public Teacher findById(int id) {
        var result = genericTeacherRepository.findById(id);
        return result.get();
    }

    public void update(Teacher teacher, int id) {
        teacher.setId(id);
        genericTeacherRepository.save(teacher);
    }

    public void delete(int id) {
        genericTeacherRepository.deleteById(id);
    }

}
