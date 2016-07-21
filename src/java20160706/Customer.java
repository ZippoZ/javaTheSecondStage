package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 * 租客类
 */
public class Customer {
    float sum = 0;//定义一个总价

    /***
     *  定义一个方法来计算这个总租金
     * @param motoVehile 父类的数组
     * @return 总租金
     */
    public void rent(MotoVehile[] motoVehile){
        for (MotoVehile moto: motoVehile) {
            if (moto instanceof Car){
                Car car =(Car) moto;
                sum += car.Sun();
            }else {
                Bus bus = (Bus) moto;
                sum += bus.Sun();
            }
            moto.print();
        }
        System.out.println(sum);
    }
}
