package org.academidadecodigo.mycartel.persistence.dao;

import org.academidadecodigo.mycartel.persistence.dao.Dao;
import org.academidadecodigo.mycartel.persistence.model.item.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

public interface ItemDao extends Dao<Item> {
}
