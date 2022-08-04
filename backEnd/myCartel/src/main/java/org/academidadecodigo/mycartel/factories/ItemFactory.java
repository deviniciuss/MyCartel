package org.academidadecodigo.mycartel.factories;

import org.springframework.stereotype.Component;

    @Component
    public class ItemFactory {

        /**
         * Creates a new {@link Account}
         *
         * @param accountType the account type
         * @return the new account
         */
        public Account createAccount(AccountType accountType) {

            Account newAccount;

            switch (accountType) {
                case CHECKING:
                    newAccount = new CheckingAccount();
                    break;
                case SAVINGS:
                    newAccount = new SavingsAccount();
                    break;
                default:
                    throw new IllegalArgumentException(ErrorMessage.TRANSACTION_INVALID);
            }

            return newAccount;
        }

