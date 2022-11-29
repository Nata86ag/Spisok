
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> purchases = new ArrayList<>();

        while (flag) {
            System.out.println("Выберите операцию:");
            String operation = scanner.next();

            switch (operation) {
                case ("1"):{
                    System.out.println("Какую покупку хотите добавить?");
                    purchases.add(scanner.next());
                    System.out.println("Итого в списке покупок: " + purchases.size());
                    break;
                }
                case ("2"):{
                    showPurchases(purchases);
                    break;
                }
                case ("3"):{
                    showPurchases(purchases);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String delValue = scanner.next();
                    if (isNumber(delValue)) {
                        int index = Integer.parseInt(delValue);
                        purchases.remove(--index);
                    }
                    purchases.remove(delValue);

                    break;
                }

                default:{
                    flag = false;
                }
            }
        }
    }
    private static boolean isNumber (String value){
        return Pattern.compile("^\\d+$").matcher(value).find();
    }
    private static void showPurchases(ArrayList<String> purchases) {
        int count = 1;
        System.out.println("Список покупок:");
        for (String purchase:purchases) {
            System.out.println((count++) + ". " + purchase);
        }
    }
}