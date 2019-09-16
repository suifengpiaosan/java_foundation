import java.io.*;

import java.util.*;

public class Test_17_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入文件名");
        String file_name = input.next();
        System.out.println(file_name);

//        try {
//            FileInputStream File_input = new FileInputStream(file_name);
//            int value;
//            while((value = File_input.read()) != -1)
//                System.out.println(value+"");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        long startTime = System.currentTimeMillis();
        countFile(new File(file_name));
        long endTime = System.currentTimeMillis();
        System.out.println("\n运行时间" + (endTime - startTime) + "毫秒");


    }

    public static void countFile(File file){
        BufferedReader bfr = null;   						//定义字符读取(缓冲)流
        try{
            bfr = new BufferedReader(new FileReader(file));	//给该流赋值
            String value = null; 							//定义一个临时接收文件中的字符串变量
            String newValue = "";    						//接收文件中所有字符串的变量
            while((value = bfr.readLine()) != null){    	//开始读取文件中的字符
                newValue = newValue + value.toLowerCase();    			//存入newValue变量中,全部转换成小写方便合并统计
            }
            int i = newValue.length();
            char[] ch = newValue.toCharArray();				//把newValue变成字符数组
            TreeMap<Character,Integer> map = new TreeMap<Character,Integer>(); //定义一个TreeMap，默认从小到大顺序，键对应字符，值对应字符出现的次数
            for(int x = 0;x < ch.length; x++){   			//遍历ch，将ch中所有的字符存入一个Map集合中(TreeSet)，键对应字符，值对应字符出现的次数
                char c = ch[x];
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }
                else{
                    int count = map.get(c);
                    map.put(c, count + 1);
                }
            }
            //下面的是取出TreeMap(map)中的键和值
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            Iterator<Map.Entry<Character, Integer>> iter = set.iterator();
            while(iter.hasNext()){
                Map.Entry<Character, Integer> maps = iter.next();
                char k = maps.getKey();
                int v = maps.getValue();
                System.out.println("字母: "+  k   + " 出现了("  + v +  "次)  ");
            }
        }
        catch(IOException e){

        }
        finally{
            try{
                if(bfr!=null)
                    bfr.close();
            }
            catch(IOException e){

            }
        }
    }
}
