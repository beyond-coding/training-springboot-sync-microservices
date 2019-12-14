package com.beyondcoding.springproperties.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("library")
public class LibraryService {

    // Needs setter and getter to inject values
    private Map<String, Integer> books;

    public Map<String, Integer> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Integer> books) {
        this.books = books;
    }
}
