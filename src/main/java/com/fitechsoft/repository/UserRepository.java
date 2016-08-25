package com.fitechsoft.repository;

import com.fitechsoft.domain.subject.FDUser;
import org.springframework.data.repository.Repository;

/**
 * @author Chun Cao
 */
public interface UserRepository extends Repository<FDUser, Long> {
    /**
     * Returns the {@link FDUser} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    FDUser findOne(Long id);

    /**
     * Saves the given {@link FDUser}.
     *
     * @param user the {@link FDUser} to search for.
     * @return
     */
    FDUser save(FDUser user);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    FDUser findByIdentifier(String identifier);
}
