/*
给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
*/
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lefthigh[]= new int[n];
        int righthigh[]= new int[n];
        for(int i = 1;i<height.length-1;i++){
            lefthigh[i] = lefthigh[i-1]<height[i-1]?height[i-1]:lefthigh[i-1];
        }
        for(int i = height.length-2;i>0;i--)
            righthigh[i] = righthigh[i+1]<height[i+1]?height[i+1]:righthigh[i+1];
        int water = 0;
        for(int i = 1;i<height.length-1;i++){
            int le = lefthigh[i]<righthigh[i]?lefthigh[i]-height[i]:righthigh[i]-height[i];
            water += le<0?0:le;
        }
        return water;
    }
}
