package oop.enum_exception.excepion.custom;

public class Main {
    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc1234", "aaa1111!");

        user.authenticate("5abc1234", "aaa1111!");

//        System.out.println(e.getMessage());
//        System.out.println("입력하신 값: " + e.getInputAccount());
    }
}
