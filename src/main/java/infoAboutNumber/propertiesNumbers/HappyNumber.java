package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

import java.util.ArrayList;

public final class HappyNumber implements NumbersProperties {

    private ArrayList<Long> squareList;

    public boolean checkNumbers(String inputNumber) {

        String[] numbers = inputNumber.split("");
        squareList = new ArrayList<>();
        long sumSquareNumbers = 0;
        createSquareList(numbers, squareList);
        sumSquareNumbers = sumSquare(squareList, sumSquareNumbers);
        checkEnd(sumSquareNumbers);

        while (sumSquareNumbers != 1) {
            String[] sumSquareString = String.valueOf(sumSquareNumbers).split("");
            createSquareList(sumSquareString, squareList);

            sumSquareNumbers = 0;

            sumSquareNumbers = sumSquare(squareList, sumSquareNumbers);
            if (checkEnd(sumSquareNumbers)) return false;
        }

        return true;
    }

    private boolean checkEnd(long sumSquareNumbers) {
        if (sumSquareNumbers == 37) {
            return true;
        }
        squareList.clear();

        return false;
    }

    private Long sumSquare(ArrayList<Long> squareList, long sumSquareNumbers) {
        for (Long aLong : squareList) {
            sumSquareNumbers += aLong;
        }

        return sumSquareNumbers;
    }

    private void createSquareList(String[] numbers, ArrayList<Long> squareList) {
        for (String number : numbers) {
            long squareNumbers = (long) Math.pow(Long.parseLong(number), 2);
            squareList.add(squareNumbers);
        }
    }
}
