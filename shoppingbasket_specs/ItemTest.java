import shoppingbasket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

  Item item;

  @Before
  public void beforeEach() {
    item = new Item( "waffles", 2.99 );
  }

  @Test
  public void canHaveName() {
    assertEquals( "waffles", item.getName() );
  }

  @Test
  public void canHavePrice() {
    assertEquals( 2.99, item.getPrice(), 0.1 );
  }

}