import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Car> carsList = new ArrayList<>();
        ArrayList<Driver> driverList = new ArrayList<>();
        Map<String, String> phoneBook = new HashMap<>();

        Helper codes = new Helper();
        Helper help = new  Helper();

        System.out.print("| Якщо хочите виклекати таксі то натисніть (1) якщо хочете відкрити телефонну книгу то натисніть (2) |");
        do {
            codes.st();
            int Ex_Num = codes.getEx_Number();
            //-------------------------- Завдання 1 -------------------------------
            if (Ex_Num == 1) {

                driverList.add(new Driver("Василь", 30, 7));
                driverList.add(new Driver("Петро", 28, 4));
                driverList.add(new Driver("Василь", 35, 8));
                driverList.add(new Driver("Степан", 32, 5));
                driverList.add(new Driver("Андрій", 27, 6));
                driverList.add(new Driver("Роман", 38, 4));
                driverList.add(new Driver("Григорій", 26, 3));
                driverList.add(new Driver("Тарас", 28, 7));
                driverList.add(new Driver("Мистислав", 26, 8));
                driverList.add(new Driver("Святослав", 31, 10));

                carsList.add(new Car("Toyota", 150, driverList.get(0), 200, 2018));
                carsList.add(new Car("BMW", 200, driverList.get(1), 250, 2011));
                carsList.add(new Car("KTM", 400, driverList.get(2), 400, 2012));
                carsList.add(new Car("Toyota", 350, driverList.get(3), 300, 2016));
                carsList.add(new Car("Toyota", 250, driverList.get(4), 250, 2019));
                carsList.add(new Car("Subaru", 500, driverList.get(5), 450, 2010));
                carsList.add(new Car("Mercedes", 600, driverList.get(6), 500, 2019));
                carsList.add(new Car("BMW", 350, driverList.get(7), 300, 2017));
                carsList.add(new Car("Mazda", 250, driverList.get(8), 250, 2021));
                carsList.add(new Car("Mercedes", 420, driverList.get(9), 400, 2016));

                for (int i = 0; i < carsList.size() / 2; i++) {
                    Car car = carsList.get(i);
                    car.increaseEnginePower(0.10);
                    for (int j = 0; i < driverList.size() / 2; i++)
                        car.changeDriver(driverList.get(j));
                }

                for (int i = 0; i < carsList.size(); i += 2) {
                    Car car = carsList.get(i);
                    car.increaseEnginePower(0.10);
                    car.increasePrice(0.05);
                }

                for (int j = 0; j < driverList.size() / 2; j++) {
                    Car car = carsList.get(j);
                    Driver driver = car.getDriver();
                    if (driver.drivingExperience() < 5 && driver.age() > 25) {
                        driver = new Driver(driver.name(), driver.age(), driver.drivingExperience() + 1);
                        car.changeDriver(driver);
                    }
                }
                int Error;

                do {
                    try {
                        System.out.println("| Якщо хочите виклекати таксі то натисніть (1) якщо ні то натисніть (0) |");
                        int Vukluk = scan.nextInt();
                        if (Vukluk == 1) {
                            int Error1;

                            do {
                                try {
                                    do {
                                        Car randomCar = Helper.getRandomCar(carsList);
                                        System.out.println("| Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().name() + " |");
                                        System.out.println("| Якщо цей автомобіль вам не підходить то натисніть (1) а якщо підходить натисніть (0) |");
                                        int Taxi = scan.nextInt();
                                        if (Taxi == 0) {
                                            break;
                                        }
                                    } while (true);
                                    System.out.println("| Чудово водій вирушив до вас ! |");
                                    System.out.println("| Дякуємо за використання нашого сервісу Таксі ! |");
                                    Error1 = 0;

                                } catch (Exception exception) {
                                    System.out.println("Ви не ввели цифру !");
                                    Error1 = 1;
                                    scan.next();
                                }
                            } while (Error1 == 1);
                        } else {
                            System.out.println("| Дякуємо за використання нашого сервісу Таксі ! |");
                        }
                        Error = 0;

                    } catch (Exception exception) {
                        System.out.println("Ви не ввели цифру !");
                        Error = 1;
                        scan.next();
                    }
                } while (Error == 1);
            }
            //-------------------------- Завдання 2 -------------------------------
            else if  (Ex_Num == 2){

                phoneBook.put("Кульбабків ", "123456789");
                phoneBook.put("Безноскович ", "987654321");
                phoneBook.put("Сидоров", "456789123");
                phoneBook.put("Луговий ", "321654987");
                phoneBook.put("Зеленський ", "654123789");
                phoneBook.put("Харитоненко ", "789456123");
                phoneBook.put("Бондаренко", "456123789");
                phoneBook.put("Кісильов ", "789123456");
                phoneBook.put("Мельник", "123789456");
                phoneBook.put("Шевченко", "789654123");

                help.help();
                do {
                    codes.stPlus();
                    int Ex_NumPlus = codes.getEx_NumberPlus();

                    switch (Ex_NumPlus) {
                        case 1: {
                            System.out.println(" | Телефонна книга: | ");

                            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }
                            break;
                        }
                        case 2: {

                            System.out.println(" | Введіть Своє призвіще і номер телефону | ");
                            phoneBook.put(scan.next(), scan.next());
                            help.helperPl();
                            break;
                        }
                        case 3: {

                            System.out.println(" | Введіть призвіще того кого ви хочите знайти | ");
                            String NameSearch = scan.next();
                            if (phoneBook.containsKey(NameSearch))
                                System.out.println(" | Номер телефону для " + NameSearch + ": " + phoneBook.get(NameSearch) + "| ");
                            else
                                System.out.println(" | У книзі відсутній абонент з прізвищем " + NameSearch + "| ");
                            help.helperPl();
                            break;
                        }
                        case 4: {

                            System.out.println(" | Введіть призвіще того кого хочите видалити | ");

                            String NameDelete = scan.next();
                            phoneBook.remove(NameDelete);
                            help.helperPl();
                            break;
                        }
                        case 5: {

                            System.out.println(" | Кількість записів у книзі: " + phoneBook.size() + "| ");
                            help.helperPl();                   break;
                        }
                        default: {
                            break;
                        }
                    }
                    if (Ex_NumPlus == 0){break;}
                }while (true);
                scan.close();

            }
            if (Ex_Num == 0 )
                break;
            System.out.println("| Якщо хочите виклекати таксі то натисніть (1) якщо хочете відкрити телефонну книгу то натисніть (2) |");
            System.out.println("| Та якщо ви хочите завершити робото то натисніть 0 |");
        }while (true);
        scan.close();
    }
}
