package infoAboutNumber;

import infoAboutNumber.propertiesNumbers.*;
import menuAndAnswer.EnterARequest;

import java.util.ArrayList;

public final class InformationalAboutTheNumber {

    public void infoNumber(String inputNumber, ArrayList<String> stopProperties) {
        String[] numbersWithProperties = inputNumber.split(" ");

        EnterARequest enterARequest = new EnterARequest();
        SameNumber sameNumber = new SameNumber();
        if (inputNumber.contains(" ")) {
            long initial = Long.parseLong(numbersWithProperties[0]);
            long length = Long.parseLong(numbersWithProperties[1]) + Long.parseLong(numbersWithProperties[0]);
            StringBuilder properties = new StringBuilder();
            for (int i = 2; i < numbersWithProperties.length; i++) {
                if (!numbersWithProperties[i].matches("(.*)-(.*)")) {
                    properties.append(numbersWithProperties[i]).append(" ");
                }
            }

            String answerProperties = sameNumber.checkSameNumber(initial, length, properties, stopProperties);
            System.out.print(answerProperties);
            enterARequest.request();
        }

        printInfo(inputNumber);
    }

    private void printInfo(String inputNumber) {

        BuzzNumber buzzNumber = new BuzzNumber();
        DuckNumber duckNumber = new DuckNumber();
        PalindromicNumber palindromicNumber = new PalindromicNumber();
        GapfulNumber gapfulNumber = new GapfulNumber();
        SpyNumber spyNumber = new SpyNumber();
        Even even = new Even();
        Odd odd = new Odd();
        SunnyNumber sunnyNumber = new SunnyNumber();
        SquareNumber squareNumber = new SquareNumber();
        JumpingNumber jumpingNumber = new JumpingNumber();
        HappyNumber happyNumber = new HappyNumber();
        SadNumbers sadNumbers = new SadNumbers();


        System.out.println("\nProperties of " + inputNumber + "\n" +
                "        buzz: " + buzzNumber.checkNumbers(inputNumber) + "\n" +
                "        duck: " + duckNumber.checkNumbers(inputNumber) + "\n" +
                " palindromic: " + palindromicNumber.checkNumbers(inputNumber) + "\n" +
                "      gapful: " + gapfulNumber.checkNumbers(inputNumber) + "\n" +
                "         spy: " + spyNumber.checkNumbers(inputNumber) + "\n" +
                "      square: " + squareNumber.checkNumbers(inputNumber) + "\n" +
                "       sunny: " + sunnyNumber.checkNumbers(inputNumber) + "\n" +
                "     jumping: " + jumpingNumber.checkNumbers(inputNumber) + "\n" +
                "       happy: " + happyNumber.checkNumbers(inputNumber) + "\n" +
                "         sad: " + sadNumbers.checkNumbers(inputNumber) + "\n" +
                "        even: " + even.checkNumbers(inputNumber) + "\n" +
                "         odd: " + odd.checkNumbers(inputNumber));
    }

}
