package programmers.코딩기초트레이닝;


public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {

        System.out.print(solution(new String[]{"a", "b", "c"}));
    }

    /**
     * 풀이 2
     */
    // 배열의 요소를 이어붙인다.
    // delimiter로 구분
    public static String solution(String[] arr) {
        return String.join("-", arr);
//        return String.join("", arr);
    }

    /**
     * 풀이 1
     */
//    public static String solution(String[] arr) {
//        StringBuilder answer = new StringBuilder();
//        for (String str : arr) {
//            answer.append(str);
//        }
//        return answer.toString();
//    }
}
