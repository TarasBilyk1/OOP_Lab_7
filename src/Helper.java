import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Helper {
    // Метод для вибору випадкового елемента з масиву машинок
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        int randomIndex = random.nextInt(cars.size());
        return cars.get(randomIndex);
    }
    Scanner scan = new Scanner(System.in);
    private int Ex_Number;

    public int getEx_Number() {
        return Ex_Number;
    }

    public void setEx_Number(int ex_Number) {
        if (ex_Number > 2)
            System.out.println("Такого звадання не існує ! ");
        else
            this.Ex_Number = ex_Number;
    }
    public void st() {
        int Error;
        do {
            try {
                setEx_Number(scan.nextInt());
                Error = 0;
            } catch (Exception exception) {
                System.out.println("Ви не ввели цифру !");
                Error = 1;
                scan.next();
            }
        } while (Error == 1);
    }
    public void help ()
    {
        System.out.println("                | Вас вітає телефонна книга ! | ");
        System.out.println("| Якщо хочите переглянути телефонну книгу то натискайте   (1) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите добавити нового користувача то натисніть    (2) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите видалити користувача з списку то натисніть  (3) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Для пошкуку користувача натисніть                       (4) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите переглянути список користувачів натисніть   (5) | ");
        System.out.println(" ");
    }

    public void helperPl ()
    {
        System.out.println(" ");
        System.out.println("              | Виберіть наступне завдання ! | ");

        System.out.println("| Якщо хочите переглянути телефонну книгу то натискайте   (1) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите добавити нового користувача то натисніть    (2) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Для пошкуку користувача натисніть                       (3) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите видалити користувача з списку то натисніть  (4) | ");
        //--------------------------------------------------------------------------------------
        System.out.println("| Якщо хочите переглянути список користувачів натисніть   (5) | ");
        System.out.println(" ");
    }


    private int Ex_NumberPlus;

    public int getEx_NumberPlus() {
        return Ex_NumberPlus;
    }

    public void setEx_NumberPlus(int ex_NumberPlus) {

        int Error;
        do {
            if (ex_NumberPlus > 5) {
                System.out.println(" | Такого звадання не існує ! | ");
                Error = 1;
                ex_NumberPlus = Integer.parseInt(scan.next());
            }
            else {
                this.Ex_NumberPlus = ex_NumberPlus;
                Error = 0;
            }
        } while (Error == 1);
    }
    public void stPlus() {
        int Error;
        do {
            try {
                setEx_NumberPlus(scan.nextInt());
                Error = 0;
            } catch (Exception exception) {
                System.out.println("Ви не ввели цифру !");
                Error = 1;
                scan.next();
            }
        } while (Error == 1);
    }
}