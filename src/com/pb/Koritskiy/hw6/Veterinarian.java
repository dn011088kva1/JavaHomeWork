package com.pb.Koritskiy.hw6;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }
    public void treatAnimal(Animal animal){
        System.out.println("Ветеринар " + name + "лечит животное " + animal.getName() + "которая живет " + animal.getLocation() + "и ест " + animal.getFood() );
    }
}
