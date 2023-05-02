package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "teachers")
@RestController
public class TeacherController {

    @PostMapping
    public Teacher create(@RequestBody Teacher teacher) {

        return new TeacherService().create(teacher);
    }

    @GetMapping
    public List<Teacher> findAll() {

        return new TeacherService().findAll();
    }

    @GetMapping("{id}")
    public Teacher findById(@PathVariable(name = "id") int id) {

        return new TeacherService().findById(id);
    }
    @PutMapping("{id}")
    public void update(@PathVariable(name = "id") int id, @RequestBody Teacher teacher) {

        new TeacherService().update(teacher, id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable(name = "id") int id) {

        new TeacherService().delete(id);
    }
}
