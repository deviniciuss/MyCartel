package org.academidadecodigo.mycartel.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ItemToItemDto extends AbstractConverter<Account, AccountDto> {

    /**
     * Converts the account model object into an account DTO
     * @param account the account
     * @return the account DTO
     */
    @Override
    public AccountDto convert(Account account) {

        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setType(account.getAccountType());
        accountDto.setBalance(String.valueOf(account.getBalance()));

        return accountDto;
    }
}
