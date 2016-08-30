package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDSubject;
import org.springframework.data.repository.Repository;

public interface SubjectRepository<S extends FDSubject> extends Repository<S, Long> {


    /**
     * Returns the {@link S} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    S findOne(Long id);

    /**
     * Saves the given {@link S}.
     *
     * @param user the {@link S} to search for.
     * @return
     */
    S save(S user);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    S findByIdentifier(String identifier);
}