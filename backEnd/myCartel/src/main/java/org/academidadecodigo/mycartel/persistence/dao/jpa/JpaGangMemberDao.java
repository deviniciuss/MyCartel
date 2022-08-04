package org.academidadecodigo.mycartel.persistence.dao.jpa;

import org.academidadecodigo.mycartel.persistence.dao.GangMemberDao;
import org.academidadecodigo.mycartel.persistence.model.GangMember;
import org.springframework.stereotype.Repository;

@Repository
public class JpaGangMemberDao extends GenericJpaDao<GangMember> implements GangMemberDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaGangMemberDao() {
        super(GangMember.class);
    }
}
