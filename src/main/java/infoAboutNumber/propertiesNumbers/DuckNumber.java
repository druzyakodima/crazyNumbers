package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class DuckNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        String[] arr = inputNumber.split("");
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        long arrNumber = 1;
        list.remove(0);
        for (String num : list) {
            arrNumber *= Long.parseLong(num);
        }

        return arrNumber == 0;
    }
}