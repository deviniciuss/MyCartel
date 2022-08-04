package org.academidadecodigo.mycartel.converters;

import org.academidadecodigo.mycartel.command.ItemDto;
import org.academidadecodigo.mycartel.persistence.dao.ItemDao;
import org.academidadecodigo.mycartel.persistence.model.item.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemToItemDto extends AbstractConverter<Item, ItemDto > {

    @Override
    public ItemDto convert(Item item) {

        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setType(item.getItemType());


        return itemDto;
    }
}

