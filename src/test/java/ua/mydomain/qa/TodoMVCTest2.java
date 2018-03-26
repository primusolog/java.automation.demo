package ua.mydomain.qa;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

//test class for autotesting of web-UI application
//test is based on java+junit+selenide

/*
Your goal is to (i.e. user will do the following steps):
  1 create task1
  2 create task2
  3 create task3
  4 create task4
  5 delete task2
  6 mark task4 as completed
  7 clear completed
  8 mark all as completed
  9 clear completed
 */

public class TodoMVCTest2 {

    //int count = 0;  //variable for naming of screenshots

    @Test
    //test method (version with direct assign of list-indexes)
    public void testCreateTask2() {
        //open web-page with browser
        open("http://todomvc4tasj.herokuapp.com/");
        //screenshot( (count++) +".png" );

        //add 4 tasks(strings, units) in the to-do list
        $("#new-todo").setValue("task1").pressEnter();
        //screenshot( (count++) +".png" );
        $("#new-todo").setValue("task2").pressEnter();
        //screenshot( (count++) +".png" );
        $("#new-todo").setValue("task3").pressEnter();
        //screenshot( (count++) +".png" );
        $("#new-todo").setValue("task4").pressEnter();
        //screenshot( (count++) +".png" );

        //delete task 2
        $$("#todo-list li").get(1).setSelected(true); //second element of list ("task2") has an index "1"
        //screenshot( (count++) +".png" );
        $$(".destroy").get(1).click();                //delete selected element
        //screenshot( (count++) +".png" );

        //mark task4 as completed
        $$("#todo-list li").get(2).setSelected(true); //after previous operation list (collection) of tasks consist of 3 elements
        //screenshot( (count++) +".png" );                       //element "task4" has an index "2"
        $$(".toggle").get(2).click();                 //mark selected element
        //screenshot( (count++) +".png" );

        //clear completed element
        $$("#clear-completed").get(0).click();
       //screenshot( (count++) +".png" );

        //mark all elements as completed
        $$("#toggle-all").get(0).click();
        //screenshot( (count++) +".png" );

        //clear all completed elements
        $$("#clear-completed").get(0).click();
        //screenshot( (count++) +".png" );

    }//testCreateTask2 method


}//TodoMVCTest2 class
