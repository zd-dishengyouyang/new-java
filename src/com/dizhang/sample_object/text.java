package com.dizhang.sample_object;

public class text {
    public static void main(String[] args) {
        movie[] movies=new movie[3];
        movies[0]= new movie("是多久啊的",821,"啊十大博客发吧");
        movies[1]= new movie("当年佛尔",21,"丹江口富爸爸");
        movies[2]= new movie("按覅吧",12.1,"爱上看");
        for (int i = 0; i < movies.length; i++) {
            movie m=movies[i];
            System.out.println(m);
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());
            System.out.println("============================");
            System.out.println("============================");
            System.out.println("============================");
            System.out.println("============================");
            System.out.println("============================");
        }
    }

}
