package lesson01.home;

public class Cat extends Animal {


    @Override
    public void run(int distance) {
        if (distance <= 0 ){
            System.out.println("Введите положительное число");
        } else if (distance > 200){
            System.out.println("Кот не может пробежать больше 200 метров");
        } else {
            System.out.println("Кот пробежал "+ distance + " метров");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");

    }
}
