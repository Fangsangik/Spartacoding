package com.sparta.week01_hwk.controller;

import com.sparta.week01_hwk.Service.PersonService;
import com.sparta.week01_hwk.models.Person;
import com.sparta.week01_hwk.models.PersonRepository;
import com.sparta.week01_hwk.models.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class PersonController {

    public final PersonRepository personRepository;
    public final PersonService personService;


    @GetMapping("/api/persons")
    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person();
        return personRepository.save(person);
    }

    @DeleteMapping
    public Long deleteperson (@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/persons")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id,requestDto);
    }

}




