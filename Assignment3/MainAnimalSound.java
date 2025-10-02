
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog → Bark");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat → Meow");
    }
}


 class MainAnimalSound {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        Cat c1 = new Cat();

       
        d1.makeSound();  
        c1.makeSound();  
    }
}
