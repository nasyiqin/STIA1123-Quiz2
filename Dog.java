public class Dog extends Animal {

    String dog;

    public Dog(String dog){
        this.dog = dog;
    }
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " +dog);
    }

}
