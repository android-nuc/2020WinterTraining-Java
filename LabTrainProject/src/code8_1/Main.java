package code8_1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain");
        String[] filenames = file.list();
        File[] files = file.listFiles();

        File new_file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\1\\2\\4\\3");
        new_file.mkdirs();

//        for (String name : filenames) {
//            System.out.println(name);
//        }
//        for (File f : files) {
//            if ("123.txt".equals(f.getName())) {
//                f.delete();
//                continue;
//            }
//            System.out.println(f.getName());
//        }


    }
}
