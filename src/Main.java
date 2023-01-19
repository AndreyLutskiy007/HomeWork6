public class Main {
    public static void main(String[] args) {
        //Задача №1-4
        System.out.println("Задача №1-4");
        {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация " + i);
        }
            {
                for (int i = 10; i >= 0; i--) {
                    System.out.println("Интерация " + i);
                }
                {
                    for (int i = 0; i <= 17; i += 2){
                        System.out.println("Интерация " + i);
                }
                    {
                        for (int i = 10; i >= -10; i--) {
                            System.out.println("Итерация" +i);
                        }
                        //Задачи № 5-7
                        System.out.println("Задачи с 5-7");
                     for (int i = 2020; i < 2070; i+=4){
                         System.out.println("Високосный год " + i);
                    }
                     for (int i = 1904; i <= 2096; i+=4){
                         System.out.println(i + " год является високосным");
                     }

                     for (int i = 7; i <= 98; i += 7) {
                         System.out.println("Итерация " + i);
                        }
                     for (int i = 1; i <= 512; i*=2) {
                         System.out.println("Итерация " +i);
                     }
                        //Задачи № 7-8
                        System.out.println("Задачи с 8-10");
                     int salary = 65535;
                     int total = 0;
                     for (int i = 1; i <= 12; i++) {
                         total = total + total/100;
                         total = total + salary;
                         System.out.println("Месяц " +i + " Итого: " + total);
                    }
                     int deposit = 29000;
                     int totalDep = 0;
                     for (int i = 1; i <= 12; i++){
                         totalDep = totalDep + totalDep/100;
                         totalDep = totalDep + deposit;
                         System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDep + " рублей");
                     }
                     int number = 2;
                     int totalNum = 1;
                     for (int i = 1; i <= 10; i++) {
                         totalNum = i * number;
                         System.out.println(i + "*" + number + "=" + totalNum);
                     }
                    }
                }

            }
        }
    }
}