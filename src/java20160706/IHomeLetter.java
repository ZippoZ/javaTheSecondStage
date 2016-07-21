package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
public interface IHomeLetter {
    /***
     * 书信的标题
     * @param str1 书信的标题
     */
    void title(String str1);

    /**
     * 书信的问候语
     * @param str2 书信的问候语
     */
    void sallHello(String str2);

    /**
     * 书信的内容
     * @param str3 书信的内容
     */
    void body(String str3);

    /***
     * 书信的结尾
     * @param str4 书信的结尾
     */
    void over(String str4);

    /***
     * 写信人的姓名
     * @param str5 写信人的姓名
     */
    void name(String str5);

    /***
     * 写信的日期
     * @param str6 写信的日期
     */
    void date(String str6);
}
