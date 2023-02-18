#include <bits/stdc++.h>
using namespace std;
vector<string> ans;
int maax;
void helper(string s1,string s2,string temp){
    if((s1.length()==0) || (s2.length()==0)){
        int k=temp.size();
        maax=max(k,maax);
        ans.push_back(temp);
        return;        
    }
    if(s1[0]==s2[0]){
        helper(s1.substr(1),s2.substr(1),temp+s1[0]);
    }
    else{
        helper(s1.substr(1),s2,temp);
        helper(s1,s2.substr(1),temp);
    }
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    ans.clear();
	    string s1,s2;
	    cin>>s1>>s2;
	    maax=0;
	    helper(s1,s2,"");
	    sort(ans.begin(),ans.end());
	    for(int i=0;i<ans.size();i++){	        
	        if(i!=0 && ans[i]!=ans[i-1] && ans[i].length()==maax)
	        cout<<ans[i]<<endl;
	        else if(i==0 && ans[i].length()==maax)
	        cout<<ans[i]<<endl;
	    }	    
	}
	return 0;
}