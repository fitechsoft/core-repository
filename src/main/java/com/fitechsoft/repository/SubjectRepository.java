package com.fitechsoft.repository;

import com.fitechsoft.domain.subject.Subject;
import org.springframework.data.repository.Repository;

public interface SubjectRepository extends Repository<Subject, Long> {
    /**
     * Returns the {@link Subject} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    Subject findOne(Long id);

    /**
     * Saves the given {@link Subject}.
     *
     * @param subject the {@link Subject} to search for.
     * @return
     */
    Subject save(Subject subject);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    Subject findByIdentifier(String identifier);

}
