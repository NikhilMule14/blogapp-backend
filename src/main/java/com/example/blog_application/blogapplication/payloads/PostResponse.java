package com.example.blog_application.blogapplication.payloads;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostResponse {
    
    private List<PostDto> content ;
    private int pageNumber ;
    private int pageSize ;
    private long totalElements ;
    private int totalPages ;
    private boolean lastPage ;
}
