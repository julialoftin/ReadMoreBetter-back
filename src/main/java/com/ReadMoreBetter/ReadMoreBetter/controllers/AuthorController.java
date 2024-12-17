package com.ReadMoreBetter.ReadMoreBetter.controllers;

import com.ReadMoreBetter.ReadMoreBetter.DTOs.AuthorDTO;
import com.ReadMoreBetter.ReadMoreBetter.data.AuthorRepository;
import com.ReadMoreBetter.ReadMoreBetter.models.Author;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    private Author convertAuthorDTOtoEntity(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setName(authorDTO.getName());
        author.setBirthday(authorDTO.getBirthday());
        return author;
    }

    @PostMapping("add")
    public ResponseEntity<Author> addAuthor(@RequestBody @Valid AuthorDTO authorDTO, Errors errors, HttpSession httpSession) {

        try {
            if (errors.hasErrors()) {
                return ResponseEntity.badRequest().build();
            }

            Author author = convertAuthorDTOtoEntity(authorDTO);
            Optional<Author> optionalAuthor = authorRepository.findById(author.getId());
            if (optionalAuthor.isEmpty()) {
                authorRepository.save(author);
            }

        }

    }

}
