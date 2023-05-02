package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "teachers")
@RestController
public class TeacherController {

    @PostMapping
    public Teacher create(@RequestBody Teacher teacher) {
        return null;
    }

    @GetMapping
    public List<Teacher> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Teacher findById(@PathVariable(name = "id") int id) {
        return null;
    }
    @PutMapping("/{id}")
    public Teacher update(@PathVariable(name = "id") int id, @RequestBody Teacher teacher) {
        return null;
    }
    @DeleteMapping("/{id}")
    public Teacher delete(@PathVariable(name = "id") int id) {
        return null;
    }
}
