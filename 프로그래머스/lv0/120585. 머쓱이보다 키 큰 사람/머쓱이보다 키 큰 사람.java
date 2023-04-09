class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int arrheight: array){
            if(height < arrheight){
                answer++;
            }
        } 
        return answer;
    }
}