/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fitechsoft.repository;

import com.fitechsoft.domain.base.FDSubject;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Plain JPA based implementation of {@link SubjectRepository}.
 *
 * @author Oliver Gierke
 */
@Repository
class JpaSubjectRepository implements SubjectRepository {

    @PersistenceContext
    private EntityManager em;

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.jpa.core.CustomerRepository#findOne(java.lang.Long)
     */
    @Override
    public FDSubject findOne(Long id) {
        return em.find(FDSubject.class, id);
    }

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.jpa.core.CustomerRepository#save(com.oreilly.springdata.jpa.core.Customer)
     */
    public FDSubject save(FDSubject customer) {
        if (customer.getId() == null) {
            em.persist(customer);
            return customer;
        } else {
            return em.merge(customer);
        }
    }

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.jpa.core.CustomerRepository#findByEmailAddress(com.oreilly.springdata.jpa.core.EmailAddress)
     */
    @Override
    public FDSubject findByIdentifier(String identifier) {

        TypedQuery<FDSubject> query = em.createQuery("select c from FDSubject c where c.identifier = :identifier",
                FDSubject.class);
        query.setParameter("identifier", identifier);

        return query.getSingleResult();
    }
}
