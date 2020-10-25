package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, String> rules = new HashMap<>();
        for (int i = 0; i < N; i++) {
            rules.put(scanner.next(), scanner.next());
        }
        String word = scanner.next();
        System.out.println(regex(rules, word));
        System.out.println(irregex(rules, word));
    }

    private static String regex(Map<String, String> rules, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rules.size(); i++) {
            sb.append(rules.keySet().toArray()[i]);
            if (i != rules.size() - 1) {
                sb.append("|");
            }
        }
        Matcher m = Pattern.compile(sb.toString()).matcher(word);
        return m.replaceAll(x -> rules.get(x.group()));
    }

    private static StringBuilder irregex(Map<String, String> rules, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int t = 0;
            for (String rule: rules.keySet()) {
                if (i + rule.length() < word.length()) {
                    String key = word.substring(i, i + rule.length());
                    if (rule.equals(key)) {
                        sb.append(rules.get(rule));
                        t = 1;
                        i += rule.length() - 1;
                        break;
                    }
                }
            }
            if (t==0) {
                sb.append(word.charAt(i));
            }
        }
        return sb;
    }
}