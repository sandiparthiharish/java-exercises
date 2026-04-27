package com.harish.java.collections;

import com.harish.java.collections.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private static final double EPS = 1e-9;

    // ---------------- isEmpty ----------------
    @Test
    void testNewCartIsEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
        assertFalse(cart.containsCategory(ShoppingCart.Category.FOOD));
    }

    // ---------------- addItem / totals ----------------
    @Test
    void testSubtotalDiscountTotalAndTotalItems() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apples", 100.0, 1, ShoppingCart.Category.FOOD);        // subtotal 100, discount 5
        cart.addItem("Book", 50.0, 2, ShoppingCart.Category.BOOKS);          // subtotal 100, discount 10
        cart.addItem("Shirt", 20.0, 3, ShoppingCart.Category.CLOTHING);      // subtotal 60,  discount 9
        cart.addItem("Laptop", 200.0, 1, ShoppingCart.Category.ELECTRONICS); // subtotal 200, discount 0

        assertFalse(cart.isEmpty());
        assertEquals(460.0, cart.getSubtotal(), EPS);
        assertEquals(24.0, cart.getDiscount(), EPS);
        assertEquals(436.0, cart.getTotal(), EPS);
        assertEquals(7, cart.getTotalItems());
    }

    // ---------------- getMostExpensiveItem ----------------
    @Test
    void testGetMostExpensiveItemTiesReturnFirstAdded() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("First", 10.0, 1, ShoppingCart.Category.FOOD);
        cart.addItem("Second", 10.0, 1, ShoppingCart.Category.FOOD);

        assertEquals("First", cart.getMostExpensiveItem());

        cart.addItem("Third", 11.0, 1, ShoppingCart.Category.FOOD);
        assertEquals("Third", cart.getMostExpensiveItem());
    }

    @Test
    void testGetMostExpensiveItemThrowsWhenEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalStateException.class, cart::getMostExpensiveItem);
    }

    // ---------------- getAverageItemPrice ----------------
    @Test
    void testGetAverageItemPriceIsNotWeightedByQuantity() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Cheap bulk", 10.0, 100, ShoppingCart.Category.FOOD);
        cart.addItem("Single expensive", 20.0, 1, ShoppingCart.Category.ELECTRONICS);

        assertEquals(15.0, cart.getAverageItemPrice(), EPS);
    }

    @Test
    void testGetAverageItemPriceThrowsWhenEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalStateException.class, cart::getAverageItemPrice);
    }

    // ---------------- containsCategory ----------------
    @Test
    void testContainsCategory() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Bread", 3.0, 1, ShoppingCart.Category.FOOD);
        cart.addItem("Jeans", 40.0, 1, ShoppingCart.Category.CLOTHING);

        assertTrue(cart.containsCategory(ShoppingCart.Category.FOOD));
        assertTrue(cart.containsCategory(ShoppingCart.Category.CLOTHING));
        assertFalse(cart.containsCategory(ShoppingCart.Category.BOOKS));
    }

    // ---------------- input validation ----------------
    @Test
    void testAddItemRejectsInvalidInputs() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class,
                () -> cart.addItem("Bad price", -0.01, 1, ShoppingCart.Category.FOOD));
        assertThrows(IllegalArgumentException.class,
                () -> cart.addItem("Bad qty", 1.0, 0, ShoppingCart.Category.FOOD));
        assertThrows(IllegalArgumentException.class,
                () -> cart.addItem("Bad qty", 1.0, -2, ShoppingCart.Category.FOOD));
    }
}
