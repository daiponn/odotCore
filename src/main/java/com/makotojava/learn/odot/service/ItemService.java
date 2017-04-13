package com.makotojava.learn.odot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makotojava.learn.odot.dao.ItemDao;
import com.makotojava.learn.odot.exception.EntityPersistenceException;
import com.makotojava.learn.odot.exception.ServiceException;
import com.makotojava.learn.odot.model.Item;

@Service
public class ItemService {

  private static final Logger log = LoggerFactory.getLogger(ItemService.class);

  static final String NOT_INITIALIZED_MESSAGE = "Item DAO has not been initialized, cannot continue.";

  @Autowired
  private ItemDao itemDao;

  ItemDao getItemDao() {
    if (itemDao == null) {
      throw new RuntimeException(NOT_INITIALIZED_MESSAGE);
    }
    return itemDao;
  }

  /**
   * Not everyone uses Spring, and this method is for those weirdos.
   * Hey, weirdos are people too.
   */
  public void setItemDao(ItemDao itemDao) {
    this.itemDao = itemDao;
  }

  /**
   * Finds all Item objects and returns a List of them.
   * 
   * @return List<Item> - the List of Item objects, will
   *         be empty if none found.
   */
  public List<Item> findAll() {
    return getItemDao().findAll();
  }

  /**
   * Find the lone Item matching the specified ID, and
   * return it.
   * 
   * @param id
   *          The ID of the Item to find.
   * 
   * @return Item - the Item whose ID matches the
   *         one specified, or null if none matched.
   */
  public Item findById(Long id) {
    return getItemDao().findById(id);
  }

  /**
   * Find the lone Item matching the specified Description,
   * and return it.
   * 
   * @param description
   *          The Description of the Item to find.
   * 
   * @return Item - the Item whose Description matches the
   *         one specified, or null if none matched.
   */
  public Item findByDescription(String description) {
    return getItemDao().findByDescription(description);
  }

  /**
   * Adds the specified Item object to the system of record.
   * 
   * @param item
   *          The Item object to add.
   * @return Item - The Item object that was added.
   * @throws ServiceException
   *           If something goes wrong, the
   *           underlying Exception will be the cause, wrapped by the
   *           ServiceException.
   */
  public Item add(Item item) throws ServiceException {
    Item ret;
    try {
      ret = getItemDao().add(item);
    } catch (EntityPersistenceException e) {
      String message = "Exception thrown while adding Category object";
      log.error(message, e);
      throw new ServiceException(message, e);
    }
    return ret;
  }

  /**
   * Update the specified Item object in the system of record.
   * 
   * @param item
   *          The Item object to update.
   * 
   * @return Boolean - true if the update succeeded, false otherwise.
   */
  public boolean update(Item item) throws ServiceException {
    boolean ret;
    ret = getItemDao().update(item);
    if (ret == false) {
      String message = "Update FAILED";
      log.error(message);
      throw new ServiceException(message);
    }
    return ret;
  }

  /**
   * Removes the specified Item object from the system of record.
   * 
   * @param item
   *          The Item object to delete.
   * @return Item - The Item object that was deleted.
   * @throws ServiceException
   *           If something goes wrong, the
   *           underlying Exception will be the cause, wrapped by the
   *           ServiceException.
   */
  public Item delete(Item item) throws ServiceException {
    Item ret;
    try {
      ret = getItemDao().delete(item);
    } catch (EntityPersistenceException e) {
      String message = "Exception thrown while deleting Category object";
      log.error(message, e);
      throw new ServiceException(message, e);
    }
    return ret;
  }

}
