package ru.crypt;

import ru.crypt.controller.Wheatstone;
import ru.crypt.models.Square;

import java.util.Arrays;

import static ru.crypt.util.Util.bigram;

public class Main {

    public static void main(String[] args) {
        String wordForAlg = "hello world"; // "help me obi wan kenobi"

        new Square().printSquares();

        String encrypt = new Wheatstone().algorithm(wordForAlg);

        System.out.println("Results: ");
        System.out.println("Encrypted: ".concat(
                Arrays.toString(
                        bigram(encrypt))));

        System.out.println("Decrypted: ".concat(
                Arrays.toString(
                        bigram(new Wheatstone().algorithm(encrypt)))));
    }
}
