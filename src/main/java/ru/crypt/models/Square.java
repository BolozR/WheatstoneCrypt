package ru.crypt.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

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
}
