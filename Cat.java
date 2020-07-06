public class Cat extends Animal {

    String cat;

    public Cat(String cat){
        this.cat = cat;
    }
    @Override
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is " +cat);
    }
}
