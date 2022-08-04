package org.academidadecodigo.mycartel.persistence.dao.jpa;

import org.academidadecodigo.mycartel.persistence.dao.ItemDao;
import org.academidadecodigo.mycartel.persistence.model.item.Item;
import org.springframework.stereotype.Repository;

@Repository
public class JpaItemDao extends GenericJpaDao<Item> implements ItemDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaItemDao() {
        super(Item.class);
    }
}
