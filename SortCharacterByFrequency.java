
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.PriorityQueue;
class Pair{
    int count;
    char c;
    Pair(char c,int count){
        this.count=count;
        this.c=c;
    }
}
public class SortCharacterByFrequency {
    static public String frequencySort(String s) {
        

        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b) -> b.count-a.count);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }else{
                map.put(c,1);
            }
        }
        
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            Pair p=new Pair(m.getKey(),m.getValue());
            q.add(p);
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            Pair p=q.poll();
            int cnt=p.count;
            char chr=p.c;
            
            while(cnt>0){
                sb.append(chr);
                cnt--;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="cccaaa";
        System.out.println(frequencySort(s));
    }
}
