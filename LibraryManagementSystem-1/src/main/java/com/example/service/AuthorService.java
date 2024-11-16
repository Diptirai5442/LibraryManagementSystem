package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Author;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.AuthorRepository;

import java.util.List;

@Service
@Transactional
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Author not found"));
    }

    public Author createAuthor(Author author) {
        if (authorRepository.existsByEmail(author.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return authorRepository.save(author);
    }

    public Author updateAuthor(Long id, Author authorDetails) {
        Author author = getAuthorById(id);
        author.setFirstName(authorDetails.getFirstName());
        author.setLastName(authorDetails.getLastName());
        author.setEmail(authorDetails.getEmail());
        author.setBirthDate(authorDetails.getBirthDate());
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
