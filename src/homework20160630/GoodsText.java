package homework20160630;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/30.
 */
public class GoodsText {
    Goods[] goodses = new Goods[5];
    int i = 0;
    /***
     *
     * @param goods 接收商品信息
     */
    void  goodses(Goods goods) {
        goodses[i++] = goods;
    }
    void show(String str,String psd){
        if ("tom".equals(str)&&"123".equals(psd)){
            System.out.println("登入成功！！！！");
            System.out.println("\n*************欢迎进入商品批发成*************");
            for (int j=0;j<goodses.length;j++){
                System.out.println(goodses[j].num+"\t"+goodses[j].good+"\t"+goodses[j].price);
            }
            System.out.println("********************************************");
        }
    }
   void change(int i,int n){
        switch (i){
            case 1:
                System.out.println("你需要付款："+n*goodses[0].price);
                break;
            case 2:
                System.out.println("你需要付款："+n*goodses[1].price);
                break;
            case 3:
                System.out.println("你需要付款："+n*goodses[2].price);
                break;
            case 4:
                System.out.println("你需要付款："+n*goodses[3].price);
                break;
            case 5:
                System.out.println("你需要付款："+n*goodses[4].price);
                break;
            default:
                System.err.println("输入有误！！！！");
        }
   }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
    }

}
