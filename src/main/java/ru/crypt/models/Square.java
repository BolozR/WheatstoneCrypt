package ru.crypt.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;

@Getter
@NoArgsConstructor
@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
public class Square {
    String[][] upperSquare =
                    {{"E",	"X", "A", "M", "P"},
                    {"L", "B", "C", "D", "F"},
                    {"G", "H", "I", "J", "K"},
                    {"N", "O", "R", "S", "T"},
                    {"U", "V","W","Y","Z"}};

    String[][] lowerSquare=
                    {{"K", "E", "Y", "W", "O"},
                    {"R", "D", "A", "B", "C"},
                    {"F", "G", "H", "I", "J"},
                    {"L", "M", "N", "P", "S"},
                    {"T", "U", "V", "X", "Z"}};

    public void printSquares(){
        System.out.println("UpperSquare:");
        for(String[] i : upperSquare){
            System.out.println(Arrays.toString(i));
        }

        System.out.println("LowerSquare:");
        for(String[] i : lowerSquare) {
            System.out.println(Arrays.toString(i));
        }
    }
}
