package com.fitechsoft.repository;

import com.fitechsoft.domain.base.FDInstitution;
import org.springframework.data.repository.Repository;

/**
 * Created by chun on 16/8/25.
 */
public interface InstitutionRepository extends Repository<FDInstitution, Long> {
    /**
     * Returns the {@link FDInstitution} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    FDInstitution findOne(Long id);

    /**
     * Saves the given {@link FDInstitution}.
     *
     * @param institution the {@link FDInstitution} to search for.
     * @return
     */
    FDInstitution save(FDInstitution institution);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
//    FDInstitution findByIdentifier(String identifier);

}
