package org.academidadecodigo.mycartel.converters;

import org.academidadecodigo.mycartel.command.ItemDto;
import org.academidadecodigo.mycartel.factories.ItemFactory;
import org.academidadecodigo.mycartel.persistence.model.item.Item;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemDtoToItem implements Converter<ItemDto, Item> {

    private ItemFactory itemFactory;



    /**
     * Converts the account DTO into a account model object
     *
     * @param accountDto the account DTO
     * @return the account
     */
    @Override
    public Item convert(ItemDto itemDto) {

        Item item = null;

        item = itemFactory.createItem(itemDto.getType());


        return item;
    }
}
