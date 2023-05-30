package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping(value = "teachers")
@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public ResponseEntity<List<Teacher>> findAll() {
        var teacher= teacherService.findAll();
        return ResponseEntity.ok(teacher);
    }
    @GetMapping("{id}")
    public ResponseEntity<Teacher> findById(@PathVariable(name = "id") int id) {
        var teacher = teacherService.findById(id);
        return ResponseEntity.ok(teacher);
    }
    @PostMapping
    public ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
        var entity = teacherService.create(teacher);
        return ResponseEntity.created(URI.create("teachers" + entity.getId())).body(entity);
    }
    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable(name = "id") int id, @RequestBody Teacher teacher) {
        teacherService.update(teacher, id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "id") int id) {
        teacherService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
