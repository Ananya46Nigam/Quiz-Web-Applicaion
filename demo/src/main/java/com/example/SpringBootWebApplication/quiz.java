package com.example.SpringBootWebApplication;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "mcqs")
public class quiz{
  @Id  
  @Column(name="id")
  public Integer id;
  @Column(name="question")
  public String question;
  @Column(name="option_a")
  public String option_a;
  @Column(name="option_b")
  public String option_b;
  @Column(name="option_c")
  public String option_c;
  @Column(name="option_d")
  public String option_d;
  @Column(name="correct_answer")
  public String correct_answer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getquestion() {
    return question;
  }

  public void setquestion(String question) {
    this.question = question;
  }

  
  public String getoption_a() {
    return option_a;
  }

  public void setoption_a(String option_a) {
    this.option_a = option_a;
  }

  public String getoption_b() {
    return option_b;
  }

  public void setoption_b(String option_b) {
    this.option_b = option_b;
  }
  public String getoption_c() {
    return option_c;
  }
  public void setoption_c(String option_c) {
    this.option_c = option_c;
  }

  public String getoption_d() {
    return option_d;
  }

  public void setoption_d(String option_d) {
    this.option_d = option_d;
  }

  public String getcorrect_answer() {
    return correct_answer;
  }

  public void setcorrect_answer(String correct_answer) {
    this.correct_answer = correct_answer;
  }



}