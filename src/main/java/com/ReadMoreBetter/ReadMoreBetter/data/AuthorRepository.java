package com.ReadMoreBetter.ReadMoreBetter.data;

import com.ReadMoreBetter.ReadMoreBetter.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
