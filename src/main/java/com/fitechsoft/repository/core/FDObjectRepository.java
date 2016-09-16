package com.fitechsoft.repository.core;

import com.fitechsoft.domain.core.FDObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chun on 16/8/30.
 */
public interface FDObjectRepository<O extends FDObject> extends JpaRepository<O, Long> {

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param oid the oid to search for.
     * @return
     */
    O findByOid(String oid);
}
