package section1.s1_1;

public class Ex19p {
    public static void main(String[] args) {

        System.out.println(max4(3,6,2,1));
        System.out.println(min3(7,4,5));
        System.out.println(min4(7,5,8,2));
    }


    // Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하라.

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;

        return max;
    }


    // Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하라.

    static int min3(int a, int b, int c) {
        int min = a;

        if(b < min)
            min = b;
        if(c < min)
            min = c;

        return min;
    }

    // Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하라.

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;

        return min;
    }

}
