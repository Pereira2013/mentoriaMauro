package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "teachers")
@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public Teacher create(@RequestBody Teacher teacher) {

        return teacherService.create(teacher);
    }

    @GetMapping
    public List<Teacher> findAll() {

        return teacherService.findAll();
    }

    @GetMapping("{id}")
    public Teacher findById(@PathVariable(name = "id") int id) {

        return teacherService.findById(id);
    }
    @PutMapping("{id}")
    public void update(@PathVariable(name = "id") int id, @RequestBody Teacher teacher) {

        teacherService.update(teacher, id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable(name = "id") int id) {

        teacherService.delete(id);
    }
}
