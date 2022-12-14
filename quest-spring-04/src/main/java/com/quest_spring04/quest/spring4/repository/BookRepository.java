package com.quest_spring04.quest.spring4.repository;

import com.quest_spring04.quest.spring4.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public List<Book> findByTitleContainOrDescriptionContaining(String text, String texAgain);
}
