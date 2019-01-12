package org.lxg.frame.doorls.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: xuegangliu
 * @date: 5/29/2018 6:43 PM
 * @DES:
 * @version: v1.0
 */
public class CommUtils {
    public static void printNowData(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Now date is "+df.format(new Date()));
    }
}
