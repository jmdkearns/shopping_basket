import shoppingbasket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest{

  ShoppingBasket basket;
  Item item;
  Item item1;
  Item item2;

  @Before
  public void beforeEach() {
    basket = new ShoppingBasket();
    item = new Item("apple", 0.3);
    item1 = new Item("banana", 0.4);
    item2 = new Item("orange", 0.5);
  }

  @Test
  public void canHaveAnEmptyBasket() {
    assertEquals( 0, basket.items.size() );
  }

  @Test
  public void canAddItemToBasket() {
    basket.addItem(item);
    assertEquals( 1, basket.items.size() );
  }

  @Test
  public void canRemoveItemFromBasket() {
    basket.addItem(item);
    basket.removeItem(item);
    assertEquals( 0, basket.items.size() );
  }

  @Test
  public void canEmptyShoppingBasket() {
    basket.addItem(item);
    basket.addItem(item1);
    basket.addItem(item2);
    basket.emptyBasket();
    assertEquals( 0, basket.items.size() );
  }

  @Test
  public void canHaveTotalPrice() {
    basket.addItem(item);
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals( 1.2, basket.getTotal(), 0.1 );
  }

}