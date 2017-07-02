package com.makotojava.learn.odot.model;

/**
 * A bunch of Category objects expressed as an enum.
 * 
 * Brilliant!
 */
public enum Categories {
  CATEGORY_1(CategoryTest.CATEGORY_1),
  CATEGORY_2(CategoryTest.CATEGORY_2),
  CATEGORY_3(CategoryTest.CATEGORY_3),
  CATEGORY_4(CategoryTest.CATEGORY_4),
  CATEGORY_5(CategoryTest.CATEGORY_5),
  CATEGORY_6(CategoryTest.CATEGORY_6),
  CATEGORY_7(CategoryTest.CATEGORY_7),
  CATEGORY_8(CategoryTest.CATEGORY_8),
  CATEGORY_9(CategoryTest.CATEGORY_9),
  CATEGORY_10(CategoryTest.CATEGORY_10),
  ;

  private Category category;

  private Categories(Category category) {
    this.category = category;
  }

  /**
   * Returns the underlying Category object.
   * 
   * @return Category - the underlying Category object
   *         wrapped by this enum member.
   */
  public Category value() {
    return this.category;
  }
}