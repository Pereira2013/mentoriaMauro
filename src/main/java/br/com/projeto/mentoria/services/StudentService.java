package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.exceptions.ApiException;
import br.com.projeto.mentoria.repositories.StudentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(int id) {
        var result = studentRepository.findById(id).get();
        return result;
    }

    public Student insert(Student object) {
        validate(object);
        return studentRepository.save(validateStatus(object));


    }
    private void validate(Student student) {
        List<String> erros = student.validated();
        if (!erros.isEmpty()) {
            throw new ApiException(erros, HttpStatus.BAD_REQUEST);
        }
    }
    private Student validateStatus(Student object){
        var student = studentRepository.findByCpf(object.getCpf());
        if (student == null) {
            return object;
        }
        if(student.getStatus()){
            throw new ApiException("This teacher is already exists and your status is active.",
                    HttpStatus.CONFLICT);
        } else {
            throw new ApiException("This teacher is already exists and your status is desactive.",
                    HttpStatus.BAD_REQUEST);
        }
    }

    public void update(Student object, int id) {
        object.setId(id);
        studentRepository.save(object);
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}