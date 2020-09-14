package loopsarrays;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("---Task_7---");

        int[] randomArray = new int[(int) (Math.random() * 10) + 1];


        for (int i = 0; i < randomArray.length; ++i) {
            randomArray[i] = (int) (Math.random() * 1000);
        }

        System.out.println("---Your Random Array is---");
        for (int value : randomArray) {
            System.out.println(value);
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < randomArray.length - 1; ++i) {
                if (randomArray[i] < randomArray[i + 1]) {
                    randomArray[i] = randomArray[i] + randomArray[i + 1];
                    randomArray[i + 1] = randomArray[i] - randomArray[i + 1];
                    randomArray[i] = randomArray[i] - randomArray[i + 1];
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("---Your descending Array is---");
        for (int value : randomArray) {
            System.out.println(value);
        }

        flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < randomArray.length - 1; ++i) {
                if (randomArray[i] > randomArray[i + 1]) {
                    randomArray[i] = randomArray[i] + randomArray[i + 1];
                    randomArray[i + 1] = randomArray[i] - randomArray[i + 1];
                    randomArray[i] = randomArray[i] - randomArray[i + 1];
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("---Your ascending Array is---");
        for (int value : randomArray) {
            System.out.println(value);
        }

        System.out.println();
    }
}
