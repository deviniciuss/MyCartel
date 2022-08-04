package org.academidadecodigo.mycartel.services;

import org.academidadecodigo.mycartel.persistence.model.item.Item;

public interface ItemService {

    /**
     * Gets the account with the given id
     *
     * @param id the account id
     * @return the account
     */
    Item get(Integer id);

    Item addItem(Integer cid, Item item);


}

