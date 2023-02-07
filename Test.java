import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import javax.swing.text.rtf.RTFEditorKit;

import org.w3c.dom.css.CSSImportRule;

import javafx.scene.shape.CubicCurve;

public class Test {

  // public int[] vowelStrings(String[] words, int[][] queries) {
  //       int res[]=new int[queries.length];

  //       for(int i=0;i<queries.length;i++){
  //         int start=queries[i][0];
  //         int end=queries[i][1];
  //         res[0]=solution(words,start,end);
  //       }

  //       return res;
  // }
  // int solution(String[] words,int start, int end){
  //   int count=0;
  //     for(int i=start;i<=end;i++){
  //       String curr=words[i];
  //       if(vowels(curr.charAt(0)) && vowels(curr.charAt(curr.length()-1))){
  //         count++;
  //       }
  //     }
  //     return count;
      
  // }
  // boolean vowels(char c){
  //   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
  //     return true;
  //   }
  //   return false;
  // }
  
  public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[]=new int[words.length];
        int res[]=new int[ans.length];
        int manRes[]=new int[queries.length];

        for(int i=0;i<words.length;i++){
          if(vowels(words[i].charAt(0)) && vowels(words[i].charAt(words[i].length()-1))){
            ans[i]=1;
          }
          else{
            ans[i]=0;
          }
        }
        int sum=0;
        for(int i=0;i<ans.length;i++){
          if(i!=0){
            if(ans[i]!=0)
              {
                res[i]=ans[i]+sum;
                sum+=res[i];
              }
              else
                res[i]=0;
                
          }else{
            res[i]=ans[i];
            sum+=res[i];
          }
        }
        for(int i=0;i<queries.length;i++){
          int s=queries[i][0];
          int e=queries[i][1];
          int count=0;
          if(s==0){
            s=res[s];
          e=res[e];
          
          manRes[i]=Math.max(s, e);
          }else if(s==e){
            s=res[s];
          e=res[e];
          
          manRes[i]=Math.max(s, e);
          }
          else{
            s=res[s];
          e=res[e];
          
          manRes[i]=Math.max(s, e)-s;
          }
        } 
        return manRes;
  }
  boolean vowels(char c){
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        return true;
      }
      return false;
    }
  public static void main(String[] args) {
    System.out.println(categorizeBox(2909, 3968, 3272, 727));
}
} 
