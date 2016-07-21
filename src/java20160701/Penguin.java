package java20160701;

import java.util.logging.Logger;

/**
 * Created by Zippo on 2016/7/1.
 * 对企鹅类进行封装
 */
public class Penguin {
   Logger logger =Logger.getLogger(String.valueOf(this.getClass()));
    /**
     * name ���������
     * love ����ĵ����ܶ�
     * health ����Ľ���ֵ
     */
    private String name;
    private int love;
    private int health;

    /***
     * ��ȡ��������
     * @return ��������
     */
    public String getName() {
        return name;
    }

    /***
     * ���������ֽ��и�ֵ
     * @param name �����û��������������
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * ��ȡ�������ܶ�
     * @return �������ܶ�
     */
    public int getLove() {
        return love;
    }

    /***
     * ���������ܶȸ�ֵ
     * @param love �û�������������ܶ�
     */
    public void setLove(int love) {
        if (love>=0 && love<= 100){
            this.love = love;
        }else {
            this.love = 40;
            System.err.println(" ���ܶ��������󣡣���Ĭ��Ϊ40");
        }
    }

    /***
     * ��ȡ���Ľ���ֵ
     * @return  ���Ľ���ֵ
     */
    public int getHealth() {
        return health;
    }

    /***
     * �����Ľ���ֵ���и�ֵ
     * @param health �Ż��û���������Ľ���ֵ
     */
    public void setHealth(int health) {
        if (health>=0 && health<= 100){
            this.health = health;
        }else {
            this.health = 40;
            System.err.println("����ֵ�������󣡣���Ĭ��Ϊ40");
        }
    }
    public String toString() {
        return  "�����԰ף�\n�ҵ����ּ�" + name + "�ҵĽ���ֵΪ" + health + "�Һ����˵����ܶ�Ϊ" + love;
    }

}
