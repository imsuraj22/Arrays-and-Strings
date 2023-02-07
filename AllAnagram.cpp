#include<iostream>
#include<bits/stdc++.h>
using namespace std;

    vector<int> findAnagrams(string s, string p) {
        vector<int> s1(26,0);
        vector<int> s2(26,0);
        vector<int> res;

        for(int i=0;i<s.size();i++){
            s2[s[i]-'a']+=1;
        }
        for(int i=0;i<p.size();i++){
            s1[p[i]-'a']+=1;
        }
        int left=0,right=0;
        while(right<s.size()){
             if(s1==s2)
                res.push_back(right);
            right+=1;
            if(right!=s.size())
                s2[s2[right]-'a'] +=1;
            s2[s2[left]-'a'] -=1;
            left +=1;
        }
        return res;

    }
int main()
{
    return 0;
}