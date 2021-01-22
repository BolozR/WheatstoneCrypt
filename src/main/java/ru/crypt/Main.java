package ru.crypt;

import ru.crypt.controller.Wheatstone;
import ru.crypt.models.Square;

import java.util.Arrays;

import static ru.crypt.util.Util.bigram;

public class Main {

    public static void main(String[] args) {
        System.out.println("UpperSquare:");
        for(String[] i : new Square().getUpperSquare()) System.out.println(Arrays.toString(i));
        System.out.println("LowerSquare:");
        for(String[] i : new Square().getLowerSquare()) System.out.println(Arrays.toString(i));
        System.out.println("Result:");
        System.out.println(Arrays.toString(
                bigram(new Wheatstone().algorithm("hello world"))));
    }
}
