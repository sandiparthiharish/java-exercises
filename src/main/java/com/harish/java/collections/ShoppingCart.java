package com.harish.java.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * EXERCISE 4 — Hard
 * A shopping cart that combines access modifiers, encapsulation, all iteration
 * constructs, and switch expressions.
 *
 * <h2>Access Modifier Rules in This Class</h2>
 * <ul>
 *   <li>The {@link Item} inner class is {@code private} — only {@code ShoppingCart} can see it.</li>
 *   <li>Fields inside {@code Item} are {@code private final} — only accessed via getters.</li>
 *   <li>The {@code items} list is {@code private} — callers use the public methods of this class.</li>
 * </ul>
 *
 * <h2>Discount Rules</h2>
 * <pre>
 *   FOOD        →  5% off the item's subtotal (price × quantity)
 *   BOOKS       → 10% off the item's subtotal
 *   CLOTHING    → 15% off the item's subtotal
 *   ELECTRONICS →  no discount
 * </pre>
 */
public class ShoppingCart {

    /** Product categories that determine discount rates. */
    public enum Category {
        ELECTRONICS, FOOD, CLOTHING, BOOKS
    }

    // -------------------------------------------------------------------------
    // Private inner class — demonstrates encapsulation and access modifiers.
    // You do NOT need to modify this class; study it and use its getters.
    // -------------------------------------------------------------------------
    private static class Item {
        private final String name;
        private final double price;
        private final int quantity;
        private final Category category;

        Item(String name, double price, int quantity, Category category) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.category = category;
        }

        String getName()         { return name; }
        double getPrice()        { return price; }
        int getQuantity()        { return quantity; }
        Category getCategory()   { return category; }
    }

    // -------------------------------------------------------------------------
    // Private state — never expose this list directly.
    // -------------------------------------------------------------------------
    private final List<Item> items = new ArrayList<>();

    // =========================================================================
    // Methods to implement
    // =========================================================================

    /**
     * Adds a new item to the cart.
     *
     * <p>Simply create a new {@code Item} and add it to {@code items}.
     *
     * @param name     product name
     * @param price    unit price (must be >= 0)
     * @param quantity number of units (must be >= 1)
     * @param category product category
     */
    public void addItem(String name, double price, int quantity, Category category) {
        throw new UnsupportedOperationException("TODO: create an Item and add to items list");
    }

    /**
     * Returns the subtotal: the sum of (price × quantity) for every item.
     *
     * <p><b>Required construct:</b> enhanced {@code for-each} loop.
     *
     * @return total before discounts
     */
    public double getSubtotal() {
        throw new UnsupportedOperationException("TODO: implement using for-each");
    }

    /**
     * Returns the total discount amount across all items.
     *
     * <p><b>Required construct:</b> enhanced {@code for-each} loop containing a
     * {@code switch} <em>expression</em> that returns the discount rate for each category:
     * <pre>
     *   double rate = switch (item.getCategory()) {
     *       case FOOD        -> 0.05;
     *       case BOOKS       -> 0.10;
     *       case CLOTHING    -> 0.15;
     *       case ELECTRONICS -> 0.0;
     *   };
     * </pre>
     * Accumulate {@code rate × price × quantity} for each item.
     *
     * @return sum of all per-item discounts
     */
    public double getDiscount() {
        throw new UnsupportedOperationException("TODO: implement using for-each + switch expression");
    }

    /**
     * Returns the final total: {@code getSubtotal() - getDiscount()}.
     *
     * @return the amount the customer pays
     */
    public double getTotal() {
        throw new UnsupportedOperationException("TODO: implement using getSubtotal() and getDiscount()");
    }

    /**
     * Returns the total number of individual units across all items (sum of quantities).
     *
     * <p><b>Required construct:</b> classic {@code for} loop with an index variable.
     *
     * @return total unit count
     */
    public int getTotalItems() {
        throw new UnsupportedOperationException("TODO: implement using classic for loop with index");
    }

    /**
     * Returns {@code true} if the cart contains no items.
     *
     * <p>Implement as a single expression — no loop needed.
     *
     * @return {@code true} if no items have been added
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("TODO: implement isEmpty");
    }

    /**
     * Returns the name of the item with the highest unit price.
     * If multiple items share the highest price, return the one added first.
     *
     * <p><b>Required construct:</b> classic {@code for} loop with an index variable,
     * tracking the index of the current maximum.
     *
     * @return the name of the most expensive item
     * @throws IllegalStateException if the cart is empty
     */
    public String getMostExpensiveItem() {
        if (isEmpty()) throw new IllegalStateException("Cart is empty");
        throw new UnsupportedOperationException("TODO: implement using classic for with index");
    }

    /**
     * Returns the average unit price across all items (not weighted by quantity).
     *
     * <p>Example: two items priced at 10.0 and 20.0 → average is 15.0,
     * regardless of their quantities.
     *
     * <p><b>Required construct:</b> a {@code while} loop with an index variable.
     *
     * @return the mean of all unit prices
     * @throws IllegalStateException if the cart is empty
     */
    public double getAverageItemPrice() {
        if (isEmpty()) throw new IllegalStateException("Cart is empty");
        throw new UnsupportedOperationException("TODO: implement using a while loop");
    }

    /**
     * Returns {@code true} if the cart contains at least one item of the given category.
     *
     * <p><b>Required construct:</b> a {@code do-while} loop.
     * Guard against an empty cart before entering the loop.
     *
     * @param category the category to look for
     * @return {@code true} if at least one item belongs to that category
     */
    public boolean containsCategory(Category category) {
        throw new UnsupportedOperationException("TODO: implement using do-while");
    }
}