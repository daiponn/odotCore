package com.makotojava.learn.odot.exception;

public class EntityPersistenceException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 3332297154429850175L;

  public EntityPersistenceException() {
    super();
  }

  public EntityPersistenceException(String message, Throwable cause) {
    super(message, cause);
  }

  public EntityPersistenceException(String message) {
    super(message);
  }

  public EntityPersistenceException(Throwable cause) {
    super(cause);
  }

}
