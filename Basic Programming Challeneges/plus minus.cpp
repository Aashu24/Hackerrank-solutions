#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int i,n;
    float pos,neg,zero;
    cin>>n;
    int arr[n];
    for(i=0;i<n;i++)
    {    cin>>arr[i];
        if(arr[i]>0)
            pos++;
        else if(arr[i]<0)
            neg++;
        else if(arr[i]==0)
            zero++;
            }
    pos=(float)pos/n;
    neg=(float)neg/n;
    zero=(float)zero/n;
    printf("%.6f\n",pos);
    printf("%.6f\n",neg);
    printf("%.6f\n",zero);
    return 0;
}
