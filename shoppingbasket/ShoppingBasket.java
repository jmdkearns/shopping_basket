package shoppingbasket;
import java.util.ArrayList;

public class ShoppingBasket {

  public ArrayList<Item> items;

  public ShoppingBasket() {
    this.items = new ArrayList<Item>();
  }

  public Item addItem(Item item) {
    items.add(item);
    return item;
  }

  public Item removeItem(Item item) {
    items.remove(item);
    return item;
  }

  public void emptyBasket() {
    items.clear();
  }

  public double getTotal() {
    double total = 0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }

}