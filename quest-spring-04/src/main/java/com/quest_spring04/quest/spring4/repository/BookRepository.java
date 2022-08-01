package com.quest_spring04.quest.spring4.repository;

import com.quest_spring04.quest.spring4.entity.Book;
import java.util.List;

public class BookRepository {
    public List<Book> findByTitleContainOrContentContaining(String text, String texAgain) {
        return null;
    }
}
