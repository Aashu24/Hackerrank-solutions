#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,i,j,s;
    cin>>n;
    for(i=0;i<n;i++)
        {
        for(s=(n-i-1);s>0;s--)
            cout<<" ";
        for(j=0;j<=i;j++)
            cout<<"#";
        cout<<"\n";
    }
    return 0;
}
