package service;

import java.util.Scanner;

public class HaveFan {
    private String zvezda;
    private String tochka;

    public String snake() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину одной части змейки по горизонтали:");
        int horizontalLength = sc.nextInt();
        System.out.println("Введите длину одной вертикальной части по вертикали:");
        int verticalLength = sc.nextInt();

        int horizontalCount = 0;
        int count = 0;
        while ((horizontalCount + horizontalLength) <= 80){
            horizontalCount = horizontalCount + horizontalLength;
            count ++;

        }
        System.out.println("количество горизонтальных частей , чтоб легче проверить" );
        System.out.println(count);
        int countDetour = count;
        if ((count % 2) != 0) {
            countDetour = countDetour - 1;
        }

        StringBuilder stringBuilder = new StringBuilder();


        for (int x = 0; x == 0; x++) {
            int horizontalLengthSpace1 = horizontalLength - 1;
            while (horizontalLengthSpace1 != 0) {
                stringBuilder.append(" ");
                horizontalLengthSpace1 = horizontalLengthSpace1 - 1;
            }

            if ((countDetour % 2) == 0) {
                int countCounter = countDetour;

                while (countCounter != 0) {
                    countCounter = countCounter - 2;

                    int horizontalLengthCount = horizontalLength;
                    while (horizontalLengthCount != 0) {
                        stringBuilder.append("*");
                        horizontalLengthCount = horizontalLengthCount - 1;
                    }

                    int horizontalLengthSpace2 = horizontalLength - 2;
                    while (horizontalLengthSpace2 != 0) {
                        stringBuilder.append(" ");
                        horizontalLengthSpace2 = horizontalLengthSpace2 - 1;
                    }
                }
                stringBuilder.append("\n");
            }
        }


        int verticalLength1 = verticalLength;

        for (int x = 1; x <= verticalLength1; x++) {
            stringBuilder.append(" ");
            int countCounterVertical = countDetour;

            while (countCounterVertical != 0) {
                countCounterVertical = countCounterVertical - 1;

                int horizontalLengthSpace2 = horizontalLength - 2;
                while (horizontalLengthSpace2 != 0) {
                    stringBuilder.append(" ");
                    horizontalLengthSpace2 = horizontalLengthSpace2 - 1;
                }
                stringBuilder.append("*");

            }
            stringBuilder.append("\n");
        }


        for (int x = 0; x == 0; x++) {
            if ((countDetour % 2) == 0) {
                int countCounter1 = countDetour;
                while (countCounter1 != 0) {
                    countCounter1 = countCounter1 - 2;
                    int horizontalLength2 = horizontalLength;
                    while (horizontalLength2 != 0) {
                        stringBuilder.append("*");
                        horizontalLength2 = horizontalLength2 - 1;
                    }

                    int horizontalLengthSpace2 = horizontalLength - 2;
                    while (horizontalLengthSpace2 != 0) {
                        stringBuilder.append(" ");
                        horizontalLengthSpace2 = horizontalLengthSpace2 - 1;
                    }
                }
            }
        }

        if ((count % 2) != 0) {
            int horizontalLength2 = horizontalLength;
            while (horizontalLength2 != 0) {
                stringBuilder.append("*");
                horizontalLength2 = horizontalLength2 - 1;
            }
        }
        return stringBuilder.toString();
    }


}


//    public String vivod() {
//        int size = 21;
//        int stars = 1;
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int x = 0; x < size/2; x++) {
//            for (int i = 0; i < (size - stars) / 2; i++) {
//                stringBuilder.append(".");
//            }
//            for (int i = 0; i < stars; i ++) {
//                stringBuilder.append("*");
//            }
//            for (int i = 0; i < (size - stars) / 2; i++) {
//                stringBuilder.append(".");
//
//            }
//            stars += 2;
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }

