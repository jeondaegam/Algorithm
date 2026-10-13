package programmers.코딩기초트레이닝.day06;

public class 수_조작하기_2 {

    public static void main(String[] args) {

        System.out.print(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }

    public static String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];

            switch (diff) {
                case 1: answer.append("w"); break;
                case -1: answer.append("s"); break;
                case 10: answer.append("d"); break;
                case -10: answer.append("a"); break;
                default: break;
            }
        }

        return answer.toString();
    }

}




