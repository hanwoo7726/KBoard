package com.lec.spring.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder    // builder patern 사용 가능
public class Post {
    private Long id;
    private String subject; // 글 제목
    private String content; // 글 내용
    private LocalDateTime regDate;
    private Long viewCnt;

    private User user;  // 글 작성자 (FK)

    // 첨부파일
    @ToString.Exclude   // ToString 제공 안함
    @Builder.Default    // builder 제공안함
    private List<Attachment> fileList = new ArrayList<>();
}
