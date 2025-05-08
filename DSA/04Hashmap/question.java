import java.util.*;

public class question {

public static void solve(String s){
      HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        //  System.out.print(c+" ");
            hm.put(c,hm.getOrDefault(c,0)+1);
    
        }


        for(char ch:hm.keySet()){
            if(hm.get(ch)<2){
                System.out.print(ch);
            }
        }

}

    public static void main(String[] args) {
        String s="program";
	    solve(s);
    }
    
}
      