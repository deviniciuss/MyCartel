package org.academidadecodigo.mycartel.persistence.model.item;

import java.util.Arrays;
import java.util.List;

public enum ItemType {

    /**
     * @see CheckingAccount
     */
    CHECKING,

    /**
     * @see SavingsAccount
     */
    SAVINGS;

    /**
     * Lists the account types
     *
     * @return the list of account types
     */
    public static List<AccountType> list() {
        return Arrays.asList(AccountType.values());
    }
}
