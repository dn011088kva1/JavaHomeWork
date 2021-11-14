package com.pb.Koritskiy.hw6;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Семка ","gray");
        cat.setLocation("дача ");
        cat.setFood("Purina");

        Dog dog = new Dog("Party ","spitz");
        dog.setLocation("дом ");
        dog.setFood("Rayal Canin");

        Horse horse = new Horse("Mustang ",101);
        horse.setLocation("ранчо ");
        horse.setFood("сено");

        Animal[] animals = new Animal[] {cat,horse,dog};

        Class clazz = Class.forName("com.pb.Koritskiy.hw6.Veterinarian");
 //        Constructor constr = clazz.getConstructor();
 //      Object vet = constr.newInstance();

        Constructor constr = clazz.getConstructor(String.class);
        Object vet = constr.newInstance("Айболит ");

        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);
        for (Animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }



    }
}
