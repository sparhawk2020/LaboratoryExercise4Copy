package com.example.LaboratoryExercise4;

import java.util.List;

public class ClasswithMain {

    public static void main(String[] args) {


        Categoryservice obj = new Categoryservice();

        List<Category> todos = obj.retrieveTodos();

        System.out.println(todos.get(0).getCatcode());

        Category bb = obj.retrieve("SS");

        System.out.println(bb.getCatcode());
        System.out.println(bb.getCatdesc());




    }


}
