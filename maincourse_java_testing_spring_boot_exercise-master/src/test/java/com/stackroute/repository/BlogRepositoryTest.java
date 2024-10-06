package com.stackroute.repository;

import com.stackroute.domain.Blog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogRepositoryTest {

    @Test
    @DisplayName("Constructor testing")
    void createBlog(){
        Blog blog = new Blog(1, "the Begining", "Robby", "movie starts");
        assertEquals(1,blog.getBlogId());
        assertEquals("the Begining", blog.getBlogTitle());
        assertEquals("Robby",blog.getAuthorName());
        assertEquals("movie starts",blog.getBlogContent());
    }

    @Test
    @DisplayName("Create a Blog using the empty constructor")
    void createContactEmptyConstructor() {
        // Given
        Blog blog = new Blog();
        // Then
        assertAll("blog",
                () -> assertEquals(0, blog.getBlogId()),
                () -> assertEquals(null, blog.getBlogTitle()),
                () -> assertEquals(null, blog.getAuthorName()),
                () -> assertEquals(null, blog.getBlogContent())
        );
    }
}