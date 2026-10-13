package programmers.코딩기초트레이닝.day06;

public class 수_조작하기_1 {

    public static void main(String[] args) {

        System.out.print(solution(0, "wsdawsdassw"));
    }

    public static int solution(int n, String control) {
        int answer = n;

        for (Character c : control.toCharArray()) {

            switch (c) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;

                default:
                    break;
            }
        }

        return answer;
    }

}




