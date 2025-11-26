package com.appium.utils;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EidGenerator {

    public static final String[] EID_PREFIX = new String[]{"7841988", "7841989", "7841993", "7841987", "7841990", "7841991", "7841992"};

    static String stringRev(String str) {
        if (str == null)
            return "";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }

        return revStr;
    }

    @SuppressWarnings("deprecation")
    static String completed_number(String prefix, int length) {

        String eidNumber = prefix;

        while (eidNumber.length() < (length - 1)) {
            eidNumber += new Double(Math.floor(Math.random() * 10)).intValue();
        }

        String reversedEidNumberString = stringRev(eidNumber);

        List<Integer> reversedEidNumberList = new Vector<>();
        for (int i = 0; i < reversedEidNumberString.length(); i++) {
            reversedEidNumberList.add(Integer.valueOf(String.valueOf(reversedEidNumberString.charAt(i))));
        }

        int sum = 0;
        int pos = 0;

        Integer[] reversedEidNumber = reversedEidNumberList.toArray(new Integer[reversedEidNumberList.size()]);
        while (pos < length - 1) {

            int odd = reversedEidNumber[pos] * 2;
            if (odd > 9) {
                odd -= 9;
            }

            sum += odd;

            if (pos != (length - 2)) {
                sum += reversedEidNumber[pos + 1];
            }
            pos += 2;
        }

        int checkDigit = new Double(((Math.floor(sum / 10) + 1) * 10 - sum) % 10).intValue();
        eidNumber += checkDigit;

        return eidNumber;

    }

    public static String[] eid_number(String[] prefixList, int length, int howMany) {

        Stack<String> result = new Stack<>();
        for (int i = 0; i < howMany; i++) {
            int randomArrayIndex = (int) Math.floor(Math.random() * prefixList.length);
            String eidNumber = prefixList[randomArrayIndex];
            result.push(completed_number(eidNumber, length));
        }

        return result.toArray(new String[result.size()]);
    }

    //To generate valid EID numbers that follow Luhn algorithm
    public String[] generateEidNumbers(String prefix, int count) {
        String[] eidPrefix = {prefix};
        return eid_number(eidPrefix, 15, count);
    }

}
