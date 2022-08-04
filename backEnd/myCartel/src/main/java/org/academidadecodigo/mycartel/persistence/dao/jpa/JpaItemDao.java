package org.academidadecodigo.mycartel.persistence.dao.jpa;

import org.springframework.stereotype.Repository;

@Repository
public class JpaItemDao extends GenericJpaDao<Account> implements AccountDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaItemDao() {
        super(Account.class);
    }
}
