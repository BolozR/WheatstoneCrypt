package ru.crypt.controller;

import ru.crypt.models.Point;
import ru.crypt.models.Square;

import static ru.crypt.util.Util.bigram;
import static ru.crypt.util.Util.searchCharInSquare;

public class Wheatstone {

    String[] bigrams;
    String result = "";
    Square square = new Square();

    public String algorithm(String textToCrypt){
        bigrams = bigram(textToCrypt.toUpperCase().replace(" ", ""));

        for(String bi : bigrams){
            Point upperPoint = searchCharInSquare(bi.substring(0, 1), square.getUpperSquare());
            Point lowerPoint = searchCharInSquare(bi.substring(1, 2), square.getLowerSquare());

            boolean isSameCol = lowerPoint.getColumn() == upperPoint.getColumn();

            result = result
                    .concat(square.getUpperSquare()
                            [(isSameCol ? lowerPoint : upperPoint).getRow()]
                            [(isSameCol ? upperPoint : lowerPoint).getColumn()])
                    .concat(square.getLowerSquare()
                            [(isSameCol ? upperPoint : lowerPoint).getRow()]
                            [(isSameCol ? lowerPoint : upperPoint).getColumn()]);
        }
        return result.toUpperCase();
    }
}
