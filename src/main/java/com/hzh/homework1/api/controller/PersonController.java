package com.hzh.homework1.api.controller;

import com.hzh.homework1.api.dto.PersonDTO;
import com.hzh.homework1.domain.entity.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/{id}")
    public Integer get(@PathVariable("id") Integer id){
        return id*100;
    }

    @PostMapping
    public String post(@RequestBody Person person){
        return person.getName()+", "+person.getSex()+"性, "+person.getAge()+"周岁";
    }

    @PutMapping
    public PersonDTO put(@RequestBody Person person){
        PersonDTO personDTO = new PersonDTO();
        BeanUtils.copyProperties(person, personDTO);
        personDTO.setMark("已成年");
        return personDTO;
    }

    @DeleteMapping
    public String delete(@RequestBody Person person){
        return person.getName()+"信息已删除";
    }

}
