public class Tree {
  private String name, id;
  private double price;

  public Tree() {

  }

  public Tree(String id, String name, double price) {
    this.name = name;
    this.id = id;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}
