package com.example.SpringBootWebApplication;
// import java.util.*;

import java.util.List;

// import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ModelCreateObject;

public interface QuizService {

    List<quiz> getAllQuestions();
    void saveQuestion(quiz Quiz);
    quiz getQuestionById(int id);
    void deleteQuestionById(int id);
    

}
