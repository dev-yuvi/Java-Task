public class task7 {
    public static void main(String[] args) {
        int input1 = 6341;
        int input2 = 7536;
        int input3 = 4213;

        int[] digits1 = getDigits(input1);
        int[] digits2 = getDigits(input2);
        int[] digits3 = getDigits(input3);

        int[] result = new int[4];

        result[0] = getSmallestDigit(digits1[0], digits2[0], digits3[0]);
        result[1] = getLargestDigit(digits1[1], digits2[1], digits3[1]);
        result[2] = getSmallestDigit(digits1[2], digits2[2], digits3[2]);
        result[3] = getLargestDigit(digits1[3], digits2[3], digits3[3]);

        int output = result[0] * 1000 + result[1] * 100 + result[2] * 10 + result[3];
        System.out.println("Output: " + output);
    }

    public static int[] getDigits(int num) {
        int[] digits = new int[4];
        digits[0] = num / 1000;
        digits[1] = (num / 100) % 10;
        digits[2] = (num / 10) % 10;
        digits[3] = num % 10;
        return digits;
    }

    public static int getSmallestDigit(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int getLargestDigit(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}