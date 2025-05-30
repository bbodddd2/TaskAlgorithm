package org.example;



public class  Karatsuba{
    public static void main(String[] args) {
        String firstNum = "1110";
        String secondNum = "110";

        String result = karatsuba(firstNum, secondNum);
        System.out.println(convertToDecimal(result));
    }

    public static String karatsuba(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());

        num1 = padWithZeros(num1, maxLength);
        num2 = padWithZeros(num2, maxLength);

        if (maxLength == 1) {
            return singleMultiply(num1, num2);
        }

        int halfLength = maxLength / 2;

        String high1 = num1.substring(0, halfLength);
        String low1 = num1.substring(halfLength);
        String high2 = num2.substring(0, halfLength);
        String low2 = num2.substring(halfLength);

        String part1 = karatsuba(high1, high2);
        String part2 = karatsuba(low1, low2);
        String part3 = karatsuba(addBinary(high1, low1), addBinary(high2, low2));

        String intermediate = subtractBinary(subtractBinary(part3, part1), part2);

        String termA = part1 + generateZeros(2 * halfLength);
        String termB = intermediate + generateZeros(halfLength);
        String partialSum = addBinary(termA, termB);
        return addBinary(partialSum, part2);
    }

    public static String padWithZeros(String input, int targetLength) {
        while (input.length() < targetLength) {
            input = "0" + input;
        }
        return input;
    }

    public static String singleMultiply(String digit1, String digit2) {
        return (digit1.charAt(0) == '1' && digit2.charAt(0) == '1') ? "1" : "0";
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int i = binary1.length() - 1, j = binary2.length() - 1;

        int overflow = 0;

        while (i >= 0 || j >= 0 || overflow > 0) {
            int total = overflow;
            if (i >= 0) total += binary1.charAt(i--) - '0';
            if (j >= 0) total += binary2.charAt(j--) - '0';
            result.append(total % 2);
            overflow = total / 2;
        }

        return result.reverse().toString();
    }

    public static String subtractBinary(String minuend, String subtrahend) {
        minuend = padWithZeros(minuend, Math.max(minuend.length(), subtrahend.length()));
        subtrahend = padWithZeros(subtrahend, Math.max(minuend.length(), subtrahend.length()));

        StringBuilder difference = new StringBuilder();
        int carry = 0;

        for (int i = minuend.length() - 1; i >= 0; --i) {
            int current = (minuend.charAt(i) - '0') - (subtrahend.charAt(i) - '0') - carry;
            if (current < 0) {
                current += 2;
                carry = 1;
            } else {
                carry = 0;
            }
            difference.append(current);
        }
        return difference.reverse().toString().replaceFirst("^0+(?!$)", "");
    }

    public static String generateZeros(int count) {
        return new String(new char[count]).replace('\0', '0');
    }

    public static int convertToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
}
