package main.com.GeorgianLessons.GeoLab_Lesson01.Programming5;

public class HelloGCD {

    public static void main(String[] args) {
        System.out.println(gcd(100000000, 341251240));
        System.out.println(isZero(0));
    }

    public static int gcd(int x, int y) {
        int result = 1;
        int min = Math.min(x, y);
        result = min;
        while (x % result != 0 || y % result != 0) {
            result--;
        }
        return result;
    }

    public <T> boolean example(T item1) {

        return item1 instanceof String;
    }

    public static <T extends Number> boolean isZero(T data) {
        return data.equals(0);
    }
}
