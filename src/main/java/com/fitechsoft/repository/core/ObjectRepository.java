package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDObject;
import org.springframework.data.repository.Repository;

/**
 * Created by chun on 16/8/30.
 */
public interface ObjectRepository<O extends FDObject> extends Repository<O, Long> {
    /**
     * Returns the {@link O} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    O findOne(Long id);

    /**
     * Saves the given {@link O}.
     *
     * @param obj the {@link O} to search for.
     * @return
     */
    O save(O obj);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param oid the oid to search for.
     * @return
     */
    O findByOid(String oid);
}
