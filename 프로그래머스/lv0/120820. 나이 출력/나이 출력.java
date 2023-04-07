import java.time.YearMonth;

class Solution {
    public int solution(int age) {
        int currentyear = YearMonth.now().getYear();
        int answer = 0;
        if(0 < age && age <= 120){
            answer = currentyear - age;
        }
        return answer;
    }
}