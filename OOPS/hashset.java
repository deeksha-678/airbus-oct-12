import java.util.HashSet;

 class hashset {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    cars.remove("BMW");
    cars.remove("Mazda");
    System.out.println(cars);

  }
}
