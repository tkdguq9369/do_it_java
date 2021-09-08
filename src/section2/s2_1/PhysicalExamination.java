package section2.s2_1;

import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21;

    public static class PhyscData {
        String name; //이름
        int height; //키
        double vision; // 시력

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("A", 162, 0.3),
                new PhyscData("B", 173, 0.7),
                new PhyscData("C", 175, 2.0),
                new PhyscData("D", 171, 1.5),
                new PhyscData("E", 168, 0.4),
                new PhyscData("F", 174, 1.2),
                new PhyscData("G", 169, 0.8)
        };
        int[] vdist = new int[VMAX]; // 시력분포


        System.out.println(" 신체검사 리스트 ");
        System.out.println("이름     키         시력");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);
        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
        }
    }

    //키 평균
    public static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum / dat.length;
    }

    //시력 분포
    public static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }
}
