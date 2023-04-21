package com.example.SpringBootWebApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class quizcontroller {
    @Autowired
    public QuizService quizservice;

    //display list of questions

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listQuestions",quizservice.getAllQuestions());
        return "index";
    }
    @GetMapping("/shownewQuestionForm")
    public String shownewQuestionForm(Model model){

        quiz Quiz=new quiz();
        model.addAttribute("Quiz",Quiz);
        return "new_question";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("Quiz") quiz Quiz){
        quizservice.saveQuestion(Quiz);
        return "redirect:/";

    }


    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable("id")int id,Model model){
    //get question from service
        quiz Quiz=quizservice.getQuestionById(id);
    //set question as a model attr to pre-populate the form
        model.addAttribute("Quiz", Quiz);
        return "update_question";

    }

    @GetMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable (value = "id") int id){
        //call delete question methid

        this.quizservice.deleteQuestionById(id);
        return "redirect:/";
    }

}



    

