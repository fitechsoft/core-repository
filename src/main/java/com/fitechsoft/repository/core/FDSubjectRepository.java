package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FDSubjectRepository<S extends FDSubject> extends JpaRepository<S, Long> {

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    S findByIdentifier(String identifier);
}