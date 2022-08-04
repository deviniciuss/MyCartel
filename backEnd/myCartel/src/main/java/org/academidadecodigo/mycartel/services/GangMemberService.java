package org.academidadecodigo.mycartel.services;

import org.academidadecodigo.mycartel.exceptions.GangMemberNotFoundException;
import org.academidadecodigo.mycartel.exceptions.ItemNotFoundException;
import org.academidadecodigo.mycartel.persistence.model.GangMember;
import org.academidadecodigo.mycartel.persistence.model.item.Item;

import java.util.List;

public interface GangMemberService {

    GangMember get(Integer id);


    GangMember save(GangMember gangMember);

    void delete(Integer id) throws GangMemberNotFoundException;


    List<GangMember> list();

    Item addItem(Integer id, Item item)
            throws GangMemberNotFoundException;


    void deleteItem(Integer id, Integer itemId)
            throws GangMemberNotFoundException, ItemNotFoundException;
}
