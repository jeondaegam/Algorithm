package programmers.코딩기초트레이닝.day06;

import java.util.Arrays;

public class 마지막_두_원소 {

    public static void main(String[] args) {

        System.out.print(solution(new int[]{5, 7, 8, 3}));
    }

    public static int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        answer[answer.length - 1] =
                last > before ? last - before : last * 2;

        return answer;
    }

}




