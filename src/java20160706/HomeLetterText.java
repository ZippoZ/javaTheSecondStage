package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
public class HomeLetterText {
    public static void main(String[] args) {
        Letter letter = new Letter();
        String str1 = "尊敬的爸爸、妈妈：";
        String str2 = "你们好吗？";
        String str3 = "我在这里挺好的。\n  我会努力学的。已经学到了java oop啦！\n  您二老保重身体！";
        String str4 = "此致\n敬礼";
        String str5 = "周杰";
        String str6 = "2010年6月1日";
        letter.title(str1);
        letter.sallHello(str2);
        letter.body(str3);
        letter.over(str4);
        letter.name(str5);
        letter.date(str6);
    }
}
