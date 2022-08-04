package org.academidadecodigo.mycartel.persistence.dao.jpa;

import org.springframework.stereotype.Repository;

@Repository
public class JpaRecipientDao extends GenericJpaDao<Recipient> implements RecipientDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaRecipientDao() {
        super(Recipient.class);
    }
}
