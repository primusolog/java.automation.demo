package ua.mydomain.qa;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

//test class for autotesting of web-UI application
//test is based on java+junit+selenide
//source - webinar by Yakov Kramarenko , https://www.youtube.com/watch?v=5c3z_iddWX0&feature=youtu.be
public class TodoMVCTest {

    @Test
    //test method
    public void testCreateTask() {
        //open web-page with browser
        open("http://todomvc4tasj.herokuapp.com/");
        //add 2 tasks(strings, units) in the to-do list
        $("#new-todo").setValue("do something").pressEnter();
        $("#new-todo").setValue("do something else").pressEnter();
        //verify quantity of added elements (tasks)
        $$("#todo-list li").shouldHave(size(2 ));
        //verify content and sequence of added elements;
        $$("#todo-list li").shouldHave(exactTexts("do something", "do something else"));
    } //end of method

} //end of class
