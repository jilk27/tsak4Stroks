package org.example;
import java.util.ArrayList;

import java.util.ArrayList;

public class Stroki {
    private ArrayList<String> strings;

    public Stroki() {
        strings = new ArrayList<>();
    }

    public void add(String string) {
        strings.add(string);

        for (int i = 0; i < strings.size() - 1; i++) {
            for (int j = 0; j < strings.size() - i - 1; j++) {
                if (strings.get(j).length() > strings.get(j + 1).length()) {
                    String temp = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, temp);
                }
            }
        }
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null;
        }
        String maxLengthString = strings.get(0);
        for (String s : strings) {
            if (s.length() > maxLengthString.length()) {
                maxLengthString = s;
            }
        }
        return maxLengthString;
    }

    public double getAverageLength() {

        if (strings.isEmpty()) {
            return 0;
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
}

