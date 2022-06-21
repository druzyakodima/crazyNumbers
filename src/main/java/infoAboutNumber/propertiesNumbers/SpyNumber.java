package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class SpyNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {

        String[] numbers = inputNumber.split("");
        long composition = 1;
        long sum = 0;
        for (String number : numbers) {
            composition *= Integer.parseInt(number);
            sum += Integer.parseInt(number);
        }

        return composition == sum;
    }
}