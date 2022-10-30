public class OddStringDiff{

    public String oddString(String[] words) {
        int sizee=words.size();
        int n=words[0].size();
        map<vector<int>,int> ans;
        for(int i=0;i<sizee;i++){
            vector<int>temp;
            for(int j=1;j<n;j++){
                temp.push_back(words[i][j]-words[i][j-1]);
            }
            ans[temp]++;
        }
        vetor<int>temps;
        for(auto i:ans){
            if(i.second==1){
                temps=i.first;
            }
        }
        for(int i=0;i<sizee;i++){
            vector<int>temp;
            for(int j=1;j<n;j++){
            temp.push_back(words[i][j]-words[i][j-1]);
        }
        if(temp==temps)
        return(words[i]); 
    }
    return(words[0]);  

    }

    public static void main(String[] args) {
        
    }
}