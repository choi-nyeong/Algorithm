class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (!code.substring(i, i+1).equals("1")) {
                    if (i % 2 == 0) {
                        answer += code.charAt(i); // answer에 현재 문자를 추가
                    }
                } else {
                    mode = 1; // 모드 전환
                }
            } else if (mode == 1) {
                if (!code.substring(i, i+1).equals("1")) {
                    if (i % 2 == 1) {
                        answer += code.charAt(i); // answer에 현재 문자를 추가
                    }
                } else {
                    mode = 0; // 모드 전환
                }    
            }
        }
        
        return (answer== null || answer.isEmpty()) ? "EMPTY" : answer;
    }
}