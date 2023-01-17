package lesson01.home;

public class Dog extends Animal {
    @Override
    public void run(int distance) {
        if (distance <= 0 ){
            System.out.println("Введите положительное число");
        } else if (distance > 500){
            System.out.println("Собака не может пробежать больше 200 метров");
        } else {
            System.out.println("Собака пробежала "+ distance + " метров");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= 0 ){
            System.out.println("Введите положительное число");
        } else if (distance > 100){
            System.out.println("Собака не может проплыть больше 200 метров");
        } else {
            System.out.println("Собака проплыла "+ distance + " метров");
        }

    }
}
