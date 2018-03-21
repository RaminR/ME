package ru.ya.rrmstu.me.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.ya.rrmstu.me.dao.interfaces.InstitutionDAO;
import ru.ya.rrmstu.me.entities.Institution;
import ru.ya.rrmstu.me.entities.InstitutionType;

import java.util.List;

/**
 * Created by RRM on 21/03/2018.
 */
@Component
public class InstitutionDAOImpl implements InstitutionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<Institution> institutionTypeList;


    @Transactional
    public List<Institution> getInstitutions() {
        institutionTypeList = (List<Institution>) sessionFactory.getCurrentSession()
                .createCriteria(Institution.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return institutionTypeList;
    }
}
