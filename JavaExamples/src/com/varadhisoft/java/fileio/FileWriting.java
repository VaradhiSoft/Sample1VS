package com.varadhisoft.java.fileio;

import java.io.*;
class FileWriting{
      public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("varadhi.txt",true);
        fw.write("thank u");
        fw.close();
   }
}

