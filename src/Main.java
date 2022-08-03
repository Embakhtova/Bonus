public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int add = 1550;
        if (add > 1000) {
            int bonus = add / 100;
            int all = balance + add + bonus;
            System.out.println("Бонусы начисляются в размере:" + bonus);
            System.out.println("Итоговый счет:" + all);
        } else {
            int nobonus = balance + add;
            System.out.println("Бонусы не начисляются");
            System.out.println("Итоговый счет:" + nobonus);
        }
    }
}
