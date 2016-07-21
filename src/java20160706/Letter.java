package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
    public class Letter implements IHomeLetter {

    @Override
    public void title(String str1) {
        System.out.println(str1);
    }

    @Override
    public void sallHello(String str2) {
        System.out.println("  "+str2);
    }

    @Override
    public void body(String str3) {
        System.out.println("\n  "+str3);
    }

    @Override
    public void over(String str4) {
        System.out.println("\n  "+str4);
    }

    @Override
    public void name(String str5) {
        System.out.println("                          "+str5);
    }

    @Override
    public void date(String str6) {
        System.out.println("                  "+str6);
    }
}
