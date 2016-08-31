package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDSubject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository<S extends FDSubject> extends CrudRepository<S, Long> {

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    S findByIdentifier(String identifier);
}