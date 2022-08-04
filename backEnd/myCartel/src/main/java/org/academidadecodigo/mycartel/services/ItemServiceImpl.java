package org.academidadecodigo.mycartel.services;

import org.academidadecodigo.mycartel.persistence.dao.GangMemberDao;
import org.academidadecodigo.mycartel.persistence.dao.ItemDao;
import org.academidadecodigo.mycartel.persistence.model.item.Item;

public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao;
    private GangMemberDao gangMemberDao;



    @Override
    public Item get(Integer id) {
        return itemDao.findById(id);
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void setGangMemberDao(GangMemberDao gangMemberDao) {
        this.gangMemberDao = gangMemberDao;
    }
}

