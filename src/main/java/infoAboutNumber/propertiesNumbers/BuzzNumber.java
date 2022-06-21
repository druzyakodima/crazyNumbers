package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class BuzzNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {

        String[] arr = inputNumber.split("");
        boolean isBuzzNumber;
        if (arr.length > 1) {
            long shiftNumber = Long.parseLong(arr[arr.length - 1]) * 2;
            List<String> list = Arrays.stream(arr).collect(Collectors.toList());
            list.remove(arr.length - 1);
            long number = Long.parseLong(String.join("", list));
            if ((number - shiftNumber) % 7 == 0) {
                isBuzzNumber = true;
            } else isBuzzNumber = inputNumber.endsWith("7");
        } else isBuzzNumber = inputNumber.equals("7");

        return isBuzzNumber;
    }
}

