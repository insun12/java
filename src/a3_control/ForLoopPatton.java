package a3_control;

public class ForLoopPatton {
    public static void main(String[] args) {
        // 1. sum : 반복문에서 합계를 저장하는 역할변수 사용
        // 1부터 10까지의 숫자를 더하는 코드
        int sum = 0;
        System.out.println("sum = " + sum);
        for (int i=1; i<10; i++) {
            System.out.println("i = " + i); // i = ?
            sum = sum + i; // 0 + 1 = 1
            System.out.println("sum = " + sum); // sum = ?
        }
        System.out.println("총합은 = " + sum);

        // 2. count : 반복문에서 특정조건에 맞는 경우의 횟수를 세는 변수 사용
        // 짝수의 갯수를 세는 코드
        int count = 0;
        for (int i=0; i<10; i++) {
            System.out.println("i =" + i); // i = ?
            if (i % 2 == 0) { // 짝수확인조건
                count = count + 1;
                // count ++;
                System.out.println("count = " + count); //count = ?
            }
        }

        // 3. index : 반복문에서 특정 값을 찾는 변수 사용
        // 문자열에서 특정 문자의 위치를 찾는 코드
        String name = "steve"; // 'v'의 위치를 찾자
        int index = 0;
        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
            if (name.charAt(i) == 'v') {
                index = i;
                break;
            }
        }
        System.out.println("v의 위치는 = " +index);
    }
}
