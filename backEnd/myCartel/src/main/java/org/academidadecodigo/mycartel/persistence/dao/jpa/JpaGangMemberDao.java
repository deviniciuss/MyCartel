package org.academidadecodigo.mycartel.persistence.dao.jpa;

import org.springframework.stereotype.Repository;

@Repository
public class JpaGangMemberDao extends GenericJpaDao<Customer> implements CustomerDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaCustomerDao() {
        super(Customer.class);
    }
}
