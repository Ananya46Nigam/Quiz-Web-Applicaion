package com.example.SpringBootWebApplication;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class quizserviceImpl implements QuizService{
    @Autowired

    public QuizRepository quizRepository;

    @Override
    public List<quiz> getAllQuestions(){

        return (List<quiz>) quizRepository.findAll();

    }
    @Override
    public void saveQuestion(quiz Quiz){
        this.quizRepository.save(Quiz);
    }

    @Override
    public quiz getQuestionById(int id){
        Optional<quiz> optional=quizRepository.findById(id);
        quiz Quiz=null;
        if(optional.isPresent()){
            Quiz=optional.get();
        }
        else{
            throw new RuntimeException("Question Not Found for Question Number : " + id);
        }

        return Quiz;

    }

    @Override
    public void deleteQuestionById(int id){
        this.quizRepository.deleteById(id);
    }

    
}


