package Third;

public class Quiz8 {
    public static void main(String[] args) {
        // 1 ~ 10 까지의 숫자 중 8만 제외하고 출력해보자 !
        final int MAX = 10;
        int i = 0;

        while (i < MAX) {
            i++;

            if (i == 8) {
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}