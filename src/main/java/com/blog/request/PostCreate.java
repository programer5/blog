package com.blog.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class PostCreate {

    @NotBlank(message = "타이틀을 입력해주세요.")
    private String title;

    @NotBlank(message = "컨텐츠를 입력해주세요.")
    private String content;

    @Builder
    public PostCreate(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public PostCreate change(String title, String content) {
        return PostCreate.builder()
                .title(title)
                .content(content)
                .build();
    }
}
