package java20160628;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/29.
 */
public class MemberManger {
    // 定义一个数组 存放会员信息列表
    Member[] members = new Member[5];

    int i = 0;

    /**
     * 定义添加会员的方法
     *
     * @param m
     */
    public void addMember(Member m) {
        members[i++] = m;
    }

    /**
     * 显示会员的方法
     */
    public void showMembers() {
        System.out.println("***会员列表***");
        System.out.println("会员编号\t会员积分");
        for (Member member : members) {
            System.out.println(member.no + "\t" + member.integral);
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManger mm = new MemberManger();

        for (int i = 0; i < mm.members.length; i++) {
            Member m = new Member();
            System.out.print("请输入第" + (i + 1) + "个会员的编号：");
            m.no = sc.nextInt();
            System.out.print("请输入第" + (i + 1) + "个会员的积分：");
            m.integral = sc.nextInt();
            mm.addMember(m);
        }
        mm.showMembers();
    }
}
