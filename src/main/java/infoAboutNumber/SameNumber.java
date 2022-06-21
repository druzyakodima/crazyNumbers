package infoAboutNumber;

import infoAboutNumber.propertiesNumbers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class SameNumber {

    public String checkSameNumber(long initialization, long length, StringBuilder properties, ArrayList<String> stopProperties) {

        return checkNumbersAndPrintInfoAboutNumbers(initialization, length, properties, stopProperties);
    }


    private String checkNumbersAndPrintInfoAboutNumbers(long initialization, long length, StringBuilder properties, ArrayList<String> stopProperties) {

        StringBuilder isNumbers = new StringBuilder();
        long needNumbers = length - initialization;
        foundNumbers(initialization, length, properties, isNumbers, needNumbers, stopProperties);
        return isNumbers.toString();
    }

    private void foundNumbers(long initialization, long length, StringBuilder properties, StringBuilder isNumbers, long needNumbers, ArrayList<String> stopProperties) {

        BuzzNumber buzzNumber = new BuzzNumber();
        DuckNumber duckNumber = new DuckNumber();
        PalindromicNumber palindromicNumber = new PalindromicNumber();
        GapfulNumber gapfulNumber = new GapfulNumber();
        SpyNumber spyNumber = new SpyNumber();
        SquareNumber squareNumber = new SquareNumber();
        SunnyNumber sunnyNumber = new SunnyNumber();
        JumpingNumber jumpingNumber = new JumpingNumber();
        HappyNumber happyNumber = new HappyNumber();
        SadNumbers sadNumbers = new SadNumbers();
        Even even = new Even();
        Odd odd = new Odd();

        ArrayList<NumbersProperties> numbersProperties = new ArrayList<>(List.of(buzzNumber, duckNumber, palindromicNumber, gapfulNumber, spyNumber, squareNumber, sunnyNumber, jumpingNumber, happyNumber, sadNumbers, even, odd));
        ArrayList<String> stringsProperties = new ArrayList<>(List.of(" buzz,", " duck,", " palindromic,", " gapful,", " spy,", " square,", " sunny,", " jumping,", " happy,", " sad,", " even \n", " odd \n"));
        int countNumbers = 0;
        while (needNumbers > countNumbers) {
            for (long i = initialization; i < length; i++) {

                if (!stopProperties.isEmpty()) {
                    if (!foundNumbersWithMinus(numbersProperties, stringsProperties, stopProperties, i))
                        continue;
                    if (properties.length() > 0) {
                        if (foundNumbersWithoutMinus(numbersProperties, stringsProperties, properties, i)) {
                            continue;
                        }
                    }
                }

                if (!properties.toString().matches("(.*)-(.*)")) {
                    if (foundNumbersWithoutMinus(numbersProperties, stringsProperties, properties, i)) {
                        continue;
                    }
                }



                if (countNumbers < needNumbers) {
                    isNumbers.append(i).append(" is ");
                    int index = 0;
                    for (NumbersProperties numbersProperty : numbersProperties) {
                        if (numbersProperty.checkNumbers(String.valueOf(i))) {
                            isNumbers.append(stringsProperties.get(index));
                        }
                        index++;
                    }
                    countNumbers++;
                }
            }
            initialization += needNumbers;
            length += needNumbers;
        }
    }


    private boolean foundNumbersWithMinus(ArrayList<NumbersProperties> numbersProperties, ArrayList<String> stringsProperties, ArrayList<String> stopProperties, long i) {

        int index = 0;
        for (String properties : stringsProperties) {
            boolean isStopNumber = stopProperties.toString().toUpperCase(Locale.ROOT).trim().matches("(.*)" + properties.toUpperCase(Locale.ROOT).replace(",", "").trim() + "(.*)");
            boolean isProperties = numbersProperties.get(index).checkNumbers(String.valueOf(i));

            if (isStopNumber && isProperties) return false;
            index++;
        }
        return true;
    }

    private boolean foundNumbersWithoutMinus(ArrayList<NumbersProperties> numbersProperties, ArrayList<String> stringsProperties, StringBuilder properties, long i) {

        int index = 0;
        for (String propertiesList : stringsProperties) {
            boolean isStopNumber = properties.toString().toUpperCase(Locale.ROOT).trim().matches("(.*)" + propertiesList.toUpperCase(Locale.ROOT).replace(",", "").trim() + "(.*)");
            boolean isProperties = numbersProperties.get(index).checkNumbers(String.valueOf(i));

            if (isStopNumber && !isProperties) return true;
            index++;
        }
        return false;
    }

}
