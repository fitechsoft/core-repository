package com.fitechsoft.repository;

import com.fitechsoft.domain.base.FDSubject;
import org.springframework.data.repository.Repository;

public interface SubjectRepository extends Repository<FDSubject, Long> {
    /**
     * Returns the {@link FDSubject} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    FDSubject findOne(Long id);

    /**
     * Saves the given {@link FDSubject}.
     *
     * @param subject the {@link FDSubject} to search for.
     * @return
     */
    FDSubject save(FDSubject subject);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    FDSubject findByIdentifier(String identifier);

}
