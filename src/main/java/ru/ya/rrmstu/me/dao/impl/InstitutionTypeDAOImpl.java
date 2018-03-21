package ru.ya.rrmstu.me.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.ya.rrmstu.me.dao.interfaces.InstitutionTypeDAO;
import ru.ya.rrmstu.me.entities.InstitutionType;

import java.util.List;

/**
 * Created by RRM on 21/03/2018.
 */

@Component
public class InstitutionTypeDAOImpl implements InstitutionTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<InstitutionType> institutionTypeList;

    @Transactional
    public List<InstitutionType> getInstitutionTypes() {
        institutionTypeList = (List<InstitutionType>) sessionFactory.getCurrentSession()
                .createCriteria(InstitutionType.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return institutionTypeList;
    }
}
