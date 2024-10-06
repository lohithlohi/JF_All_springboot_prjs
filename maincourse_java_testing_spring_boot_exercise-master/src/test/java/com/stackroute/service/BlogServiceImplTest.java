package com.stackroute.service;

import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class BlogServiceImplTest {

    @Mock
    BlogRepository blogRepository;

    @InjectMocks
    BlogServiceImpl blogService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initializes mocks annotated with @Mock and injects them into @InjectMocks
    }

    @Test
    @DisplayName("Saving blog through service")
    void saveBlog() {
        Blog blobj = new Blog(1, "title", "author", "content");
        when(blogRepository.save(blobj)).thenReturn(blobj);
        var blog = blogService.saveBlog(blobj);
        assertEquals(1, blog.getBlogId());
        assertEquals("title", blog.getBlogTitle());
        assertEquals("author", blog.getAuthorName());
        assertEquals("content", blog.getBlogContent());
    }

    @Test
    @DisplayName("fetching all blogs through service")
    void getAllBlogs() {
        Blog blobj1 = new Blog(1, "title1", "author1", "content1");
        Blog blobj2 = new Blog(2, "title2", "author2", "content2");
        when(blogRepository.findAll()).thenReturn(Arrays.asList(blobj1, blobj2));
        assertEquals(2, blogService.getAllBlogs().size());
        assertEquals(1, blogService.getAllBlogs().get(0).getBlogId());
        assertEquals(2, blogService.getAllBlogs().get(1).getBlogId());
    }

    @Test
    void getBlogById() {
        Blog blobj = new Blog(1, "title1", "author1", "content1");
        when(blogRepository.findById(anyInt())).thenReturn(Optional.of(blobj));
        Blog savedblog = blogService.getBlogById(1);
        assertNotNull(savedblog);
        assertEquals(blobj.getBlogId(), savedblog.getBlogId());
    }

    @Test
    void deleteBlog() {
    }

    @Test
    void updateBlog() {
    }
}