class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int tab = 2*a*b;
        if (ab>=tab){
            answer = ab;
        }else{
            answer = tab;
        }
        return answer;
    }
}