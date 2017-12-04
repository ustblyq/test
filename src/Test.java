import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yiqiang.liu on 2017/11/17.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(get(23));
    }

    public static String get(int x){
        StringBuffer channelBuffer = new StringBuffer();
        int temp = 1;
        int power = 0;
        while(temp <= x){
            if((x & temp) == temp){
                channelBuffer.append(1);
            }else{
                channelBuffer.append(0);
            }
            temp = temp << 1;
            power++;
        }
        return channelBuffer.reverse().toString();
    }
    
}
