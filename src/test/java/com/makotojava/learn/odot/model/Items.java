package com.makotojava.learn.odot.model;

/**
 * A bunch of Items objects expressed as an Enumeration.
 * 
 * Brilliant!
 * 
 */
public enum Items {
  ITEM_1(ItemTest.ITEM_1),
  ITEM_2(ItemTest.ITEM_2),
  ITEM_3(ItemTest.ITEM_3),
  ITEM_4(ItemTest.ITEM_4),
  ITEM_5(ItemTest.ITEM_5),
  ITEM_6(ItemTest.ITEM_6),
  ITEM_7(ItemTest.ITEM_7),
  ITEM_8(ItemTest.ITEM_8),
  ITEM_9(ItemTest.ITEM_9),
  ITEM_10(ItemTest.ITEM_10);

  private Item item;

  private Items(Item item) {
    this.item = item;
  }

  /**
   * Returns the underlying Item object for this enum
   * member.
   * 
   * @return Item - the Item represented by this enum member.
   */
  public Item value() {
    return this.item;
  }
}