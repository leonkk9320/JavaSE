package JavaSE.Nov03.Demo02DateClass;
/*
java.util.Date:表示时间和日期类
类Date表示特定的瞬间，精确到毫秒
毫秒：千分之一秒 1000毫秒 = 1秒
特定的瞬间： 一个时间点，一霎那时间
2088-08-08 09：55：33：333 瞬间
2088-08-08 09：55：33：334 瞬间
...
毫秒值的作用：可以对时间和日期进行计算
2099-01-03 到 2088-01-01中有多少天
日期转换为毫秒，进行计算，计算完毕，毫秒转换为日期

日期->毫秒：
    当前日期：2088-01-01
    时间原点（0毫秒）： 1970年1月1日 00：00：00（英国格林威治）
    就是计算当前日期到时间原点之间一共经历了多少毫秒（1604382393671）
    注意：
        中国是东八区，会把时间增加8个小时
        1970年1月1日 08：00：00
    毫秒到日期
        1天 = 24*60*60 = 86400秒 = 86400 000 毫秒
*/

public class DateClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//当前系统时间到0毫秒之间经历了多少毫秒
    }
}
