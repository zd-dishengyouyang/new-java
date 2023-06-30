package com.dizhang.sample_object.single;

import java.util.*;

public class arrayNoSame {
    public int equalPairs(int[][] grid) {
        
        List<List<Integer>> L=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l.add(grid[i][j]);
            }
            L.add(l);
        }
        int k=0,count=0;
        List<List<Integer>> L2=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l2.add(grid[j][i]);
            }
            //L2.add(l);
            k=0;
            while(k<L.size()){
                if(l2.equals(L.get(k))) count++;
                k++;
            }
            //l2.clear();
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] in = {{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}};
        arrayNoSame a = new arrayNoSame();
        int m;
        m = a.equalPairs(in);
        System.out.println(m);
    }
}
