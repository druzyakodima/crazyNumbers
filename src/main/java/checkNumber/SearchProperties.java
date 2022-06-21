package checkNumber;

import menuAndAnswer.EnterARequest;

import java.util.ArrayList;
import java.util.Locale;

public final class SearchProperties {

    private String[] priorities;
    private ArrayList<String> falsePriority;

    public void searchProperty(String inputNumber) {

        EnterARequest enterARequest = new EnterARequest();
        boolean isWrong = true;
        priorities = inputNumber.split(" ");
        falsePriority = new ArrayList<>();

        for (String property : priorities) {
            switch (property.replace("-", "").toUpperCase(Locale.ROOT)) {
                case "BUZZ":
                case "HAPPY":
                case "JUMPING":
                case "SUNNY":
                case "SQUARE":
                case "SPY":
                case "GAPFUL":
                case "PALINDROMIC":
                case "DUCK":
                case "SAD":
                case "EVEN":
                case "ODD":
                    break;
                default:
                    falsePriority.add(property);
                    printWrong(falsePriority.toString());
                    isWrong = false;

            }
        }
        if (!isWrong) {
            System.out.println(printWrong((falsePriority.toString())));
            enterARequest.request();
        }
    }

    private String printWrong(String inputNumber) {
        String isNumber;
        if (priorities.length == 2 && falsePriority.size() == 2) {
            isNumber = "The properties " + inputNumber.toUpperCase(Locale.ROOT) + " are wrong.\n" +
                    "Available properties:\n[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD] \n";
        } else {
            isNumber = "The property " + inputNumber.toUpperCase(Locale.ROOT) + " is wrong.\n" +
                    "Available properties:\n[EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD] \n";
        }

        return isNumber;
    }
}
