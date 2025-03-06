package com.quiz.quiz_service.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuizDto {
    private String category;
    private Integer numQuestions;
    private String title;
}
