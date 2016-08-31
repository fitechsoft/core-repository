package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by chun on 16/8/30.
 */
public interface ObjectRepository<O extends FDObject> extends CrudRepository<O, Long> {

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param oid the oid to search for.
     * @return
     */
    O findByOid(String oid);
}
