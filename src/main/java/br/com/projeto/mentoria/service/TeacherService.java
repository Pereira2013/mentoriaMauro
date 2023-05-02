package br.com.projeto.mentoria.service;

import br.com.projeto.mentoria.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    public void save(Teacher teacher) {
        //teacherRepository.save(teacher);
    }

    public List<Teacher> findAll() {
        return null; // teacherRepository.findAll();
    }

    public Teacher findById(int id) {
        return null; // teacherRepository.findById;
    }

    public void update(Teacher teacher) {
        //teacherRepository.save(teacher);
    }

    public void delete(int id) {
        //teacherRepository.deleteById(id);
    }

}
