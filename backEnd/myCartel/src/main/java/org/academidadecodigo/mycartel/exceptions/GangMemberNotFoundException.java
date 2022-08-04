package org.academidadecodigo.mycartel.exceptions;

import org.academidadecodigo.mycartel.errors.ErrorMessage;

public class GangMemberNotFoundException extends Throwable {
    public GangMemberNotFoundException() {
        super(ErrorMessage.GANGMEMBER_NOT_FOUND);
    }
}

