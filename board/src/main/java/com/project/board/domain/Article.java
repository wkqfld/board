package com.project.board.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
