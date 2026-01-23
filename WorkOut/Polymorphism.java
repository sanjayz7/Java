// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Animal {
    void sound(){ //static on both method void sound() then we got Animal :
        
        System.out.println("Animal :");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}