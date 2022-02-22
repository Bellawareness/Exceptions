class Main {
  public static void main(String[] args) {

    int intArray[] = {1,2,3,4,5};
    
    // Example of catching an exeption.
    // The intArray[5] throws an exeption because the indecies only go up to intArray[4].


    try{
      System.out.println(intArray[5]);
    } catch (Exception ex){
      System.out.println();
    }


    // 1. Create a Dog class in Dog.java.

    // 4. Create a dog object.
   Dog dog= new Dog();
    // 5. In a try/catch block call the meow method.
dog.meow();
    // 6. Catch the exception, print out "No 'Meow' from a dog!"

    // 7. call the bark method.
dog.bark();
  }
}