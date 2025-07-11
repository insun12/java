package a6_array;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
        // 2차원 행렬 배열. 매트릭스, 2D Array
        // 2차운 배열의 선언
        int [][] array = new int [3][4];

        // 2차원 배열의 값 대입
        int [][] array3 = new int[2][3]; // 2*3=6개의 data가 있는 배열
        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[0][2] = 3;
        array3[1][0] = 4;
        array3[1][1] = 5;
        array3[1][2] = 6;
        // 리터럴 생성 (new를 사용하지 않고 생성)
        int [][] array4 = {{1,2,3},{4,5,6}};

        // 2차원 배열의 출력 (deepToString)
        System.out.println(Arrays.deepToString(array3));
        System.out.println(Arrays.toString(array3));
    }
}
