class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == Boolean.TRUE){
            answer = a+b;
        }else if(flag == Boolean.FALSE){
            answer = a-b;
        }
        return answer;
    }
}