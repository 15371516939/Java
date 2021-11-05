import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
/**
 * @ @Description:swith中使用break和continue
 * 注意！！！：continue和break选其一执行
 * @author：duyunjian
 * @date：2021/10/1
 */

public class BreakAndContinue {
    public static void main(String[] args){
        List<String> fruit = new ArrayList<>(Arrays.asList("apple","banana","orange","pear"));
          for( int i=0;i < fruit.size();i++) {
         switch (fruit.get(i)){
             case "orange":
        //continue;
            break;

    }
    log.info("we have {}",fruit.get(i));
    }
        }}