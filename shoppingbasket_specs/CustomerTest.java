import shoppingbasket.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CustomerTest {

  ShoppingBasket basket;
  Customer customer;

  @Before
  public void beforeEach() {
    customer = new Customer( true );
  }

  @Test
  public void canHaveLoyaltyCard() {
    assertEquals( true, customer.loyaltyCard() );
  }

}