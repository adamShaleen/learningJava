class Dog {
  String name;
  public static void main(String[] args) {
    // make a dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";
    // make a dog array
    Dog[] myDogs = new Dog[3];
    // put some dogs in the dog array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
    // access the dogs using array references
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";
    // What was dog 2's name?
    System.out.print("last dog's name was ");
    System.out.println(myDogs[2].name);
    // loop through the array and have all dogs bark
    int x = 0;
    while(x < myDogs.length) {
      myDogs[x].bark();
      x = x + 1;
    }
  }
  public void bark() {
    System.out.println(name + " says Ruff!");
  }
}
