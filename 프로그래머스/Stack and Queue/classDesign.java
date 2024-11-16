import java.util.*;

public class sq_classDesign {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.next();//필수
        char[] arr = st.toCharArray();//필수 배열
        String st2 = sc.next();//수업진도
        Queue<Character> q = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();

        //필수과목을 Queue에 넣고
        //수업진도 순회하면서 수업진도와 일치하는 필수과목 있으면 poll하고
        //Queue비어있으면 YES 안비어있으면 NO
        for(char x : arr){
            q.offer(x);
        }

        for(char x :st2.toCharArray()){
            //순서대로 확인해야하니까 contains가 아니라 peek으로 확인
            if(!q.isEmpty()&& q.peek()==x){
                q.poll();
            }
        }
        if(q.isEmpty()){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
