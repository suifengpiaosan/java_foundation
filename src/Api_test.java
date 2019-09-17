import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.server.ExportException;

public class Api_test {

    public static void main(String[] args) {
        String httpurl = "http://127.0.0.1:8000/users/1/";
        String params = "&format=json";
        String result = httpRequestUtils(httpurl,params);
        System.out.println("result:" + result);
    }

    public static String httpRequestUtils(String url, String params){
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try{
            URL reqUrl = new URL(url);
            URLConnection conn = reqUrl.openConnection();
            conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);;
            out = new PrintWriter(conn.getOutputStream());
            out.print(params);
            out.flush();

            in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            String line;
            while((line = in.readLine())!= null){
                result.append(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (out!=null){
                    out.close();
                }
                if (in !=null){
                    in.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}
