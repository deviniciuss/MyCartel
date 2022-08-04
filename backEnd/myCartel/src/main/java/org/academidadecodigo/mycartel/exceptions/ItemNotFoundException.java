package org.academidadecodigo.mycartel.exceptions;

import org.academidadecodigo.mycartel.errors.ErrorMessage;

public class ItemNotFoundException extends Throwable {


    public ItemNotFoundException() {
        super(ErrorMessage.ITEM_NOT_FOUND);
    }
}

