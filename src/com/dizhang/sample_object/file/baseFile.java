package com.dizhang.sample_object.file;

import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baseFile {
    public static void main(String[] args) throws IOException {
        long starTtime = System.currentTimeMillis();
        try(
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\迁移学习\\DeepLearningExamples-master.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\迁移学习\\copy.zip"));
        ){
            byte[] buffer = new byte[1024*32];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制时间" + (endTime-starTtime)/1000.0 + "s");
    }
}
