class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a)+Integer.toString(b);
        String ba = Integer.toString(b)+Integer.toString(a);
        int iab = Integer.parseInt(ab);
        int iba = Integer.parseInt(ba);
        if (iab > iba){
            answer = iab;
        }else {
            answer = iba;
        }
        
        return answer;
    }
}