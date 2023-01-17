package lesson01.home;

public class MainLesson01Home {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Tiger tiger = new Tiger();
//
//
//        cat.run(50);
//        cat.swim(6);
//
//        dog.run(55);
//        dog.swim(9);
//
//        tiger.run(76);
//        tiger.swim(44);

        Animal [] animals = {
                new Cat(),
                new Dog(),
                new Tiger()
        };

        for (Animal animal : animals) {
            animal.run(30);
            animal.swim(50);
        }

        System.out.println("Всего участвовало животных в забеге: "
                +animals.length);


    }
}
