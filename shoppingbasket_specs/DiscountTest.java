import shoppingbasket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class DiscountTest {

  @Before
  public void beforeEach() {
    
  }

  @Test
  public void canBOGOF() {
    item = new Item("apple", 0.3);
    item = new Item("apple", 0.3);
    assertEquals( 0.3, basket.applyBOGOF );
  }
}
