package lesson01.home;

public class Tiger extends Animal {


    @Override
    public void run(int distance) {
        if (distance <= 0 ){
            System.out.println("Введите положительное число");
        } else if (distance > 1000){
            System.out.println("Тигр не может пробежать больше 1000 метров");
        } else {
            System.out.println("Тигр пробежал "+ distance + " метров");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= 0 ){
            System.out.println("Введите положительное число");
        } else if (distance > 10){
            System.out.println("Тигр не может проплыть больше 10 метров");
        } else {
            System.out.println("Тигр проплыл "+ distance + " метров");
        }

    }
}
