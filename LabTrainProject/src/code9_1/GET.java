package code9_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GET {
    //    "http://10.0.117.43/translation.txt"
    public void send(String url, String param, String path) throws IOException {
        URL realURL = new URL(url + "?" + param);
        URLConnection connection = realURL.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        connection.setRequestProperty("Accept", "*/*");
        connection.setRequestProperty("connection", "Keep-Alive");
        connection.connect();   // 建立连接

//        Map<String, List<String>> head = connection.getHeaderFields();
//        for (String str: head.keySet()) {
//            System.out.println(str);
//        }
        InputStream inputStream = connection.getInputStream();

        OutputStream outputStream = new FileOutputStream(path);
        int size = inputStream.available();
        for (int i = 0; i < size; i++) {

            int temp = inputStream.read();
            outputStream.write(temp);
//            System.out.print((char) temp);
        }
        outputStream.flush();
        inputStream.close();
        outputStream.close();


    }

}
