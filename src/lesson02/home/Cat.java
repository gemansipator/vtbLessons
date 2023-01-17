package lesson02.home;

public class Cat implements Jump, Run{


    @Override
    public void jump(int distance) {
        if (distance <=0) {
            System.out.println("Введите положитеьное число");
        }else if(distance >1){
            System.out.println("Не смог прыгнуть больше 1 метра");
        }else {
            System.out.println("Cat успешно прыгнул " + distance+ " метров");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <=0) {
            System.out.println("Введите положитеьное число");
        }else if(distance >100){
            System.out.println("Не смог пробежать больше 100 метров");
        }else {
            System.out.println("Cat успешно прыгнул " + distance + " метров");
        }


    }
}
