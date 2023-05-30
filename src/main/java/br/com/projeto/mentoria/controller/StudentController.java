package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping(value = "students")
@RestController
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public  ResponseEntity<List<Student>> findAll() {
        List<Student> studentList;
        studentList = studentService.findAll();

        return ResponseEntity.ok(studentList);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> findById(@PathVariable(name = "id") int id) {
        var student = studentService.findById(id);
        return ResponseEntity.ok(student);
    }
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        var entity = studentService.create(student);
        return ResponseEntity.created(URI.create("student" + entity.getId())).body(entity);
    }
    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable(name = "id") int id, @RequestBody Student student) {
        studentService.update(student, id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "id") int id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
