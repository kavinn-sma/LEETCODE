class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length,max=0;
        int [] nse=new int[n];
        int [] pse=new int[n];
        Stack <Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=h[i];
            while(!st.isEmpty() && h[st.peek()]>=curr){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<n;i++){
            int curr=h[i];
            while(!st.isEmpty() && h[st.peek()]>=curr){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=0;
            else pse[i]=st.peek()+1;
            st.push(i);
        }
        for(int i=0;i<n;i++){
            int a=h[i]*(nse[i]-pse[i]);
            if (max<a) max=a;
        }
        return max;
    }
}