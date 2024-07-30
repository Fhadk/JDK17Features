package org.feature.swtich;

public class PatternMatching {
    public String getDayOfWeek(int day) {

        String dayOfWeek = switch (day) {

            case 1 -> "Monday";

            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            case 4 -> "Thursday";

            case 5 -> "Friday";

            default -> "Unknown";

        };

        return dayOfWeek;

    }
}
