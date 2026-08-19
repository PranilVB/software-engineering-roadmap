class Solution {
    public boolean isHappy(int n) {
        int slow=squarefinder(n);
        int fast=squarefinder(squarefinder(n));
        while(slow!=fast){
            slow=squarefinder(slow);
            fast=squarefinder(fast);
            fast=squarefinder(fast);
        }
return slow==1;
    }
private int squarefinder(int num){
    int ans=0;
    while(num>0){
        int rem=num%10;
        ans+=rem*rem;
        num=num/10;
    }
    return ans;
}
}