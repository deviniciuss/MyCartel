package org.academidadecodigo.mycartel.exceptions;

import org.academidadecodigo.mycartel.errors.ErrorMessage;

public class AssociationExistsException extends MyCartelException {


    public AssociationExistsException() {
        super(ErrorMessage.ASSOCIATION_EXISTS);
    }
}


