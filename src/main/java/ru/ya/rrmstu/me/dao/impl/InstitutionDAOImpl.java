package ru.ya.rrmstu.me.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.ya.rrmstu.me.dao.interfaces.InstitutionDAO;
import ru.ya.rrmstu.me.entities.Institution;

import java.util.List;

/**
 * Created by RRM on 21/03/2018.
 */
@Component
public class InstitutionDAOImpl implements InstitutionDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private List<Institution> institutionList;
    private ProjectionList institutionProjection;

    public InstitutionDAOImpl() {
        institutionProjection = Projections.projectionList();
        institutionProjection.add(Projections.property("idInstitution"), "idInstitution");
        institutionProjection.add(Projections.property("nameInstitution"), "nameInstitution");
        institutionProjection.add(Projections.property("institutionType"), "institutionType");
    }

    @Transactional
    public List<Institution> getInstitutions() {
        DetachedCriteria institutionDetachedCriteria = DetachedCriteria.forClass(Institution.class, "i");
        createAliases(institutionDetachedCriteria);

        institutionList = createInstitutionList(institutionDetachedCriteria);

        return institutionList;
    }

    private void createAliases(DetachedCriteria criteria) {
        criteria.createAlias("i.institutionType", "institutionType");
    }

    public List<Institution> createInstitutionList(DetachedCriteria institutionListCriteria) {
        Criteria criteria = institutionListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("i.nameInstitution"))
                .setProjection(institutionProjection)
                .setResultTransformer(Transformers.aliasToBean(Institution.class));

        return criteria.list();
    }
}
