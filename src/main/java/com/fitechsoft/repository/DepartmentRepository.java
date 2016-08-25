package com.fitechsoft.repository;

import com.fitechsoft.domain.base.FDDepartment;
import org.springframework.data.repository.Repository;

/**
 * Created by chun on 16/8/25.
 */
public interface DepartmentRepository  extends Repository<FDDepartment, Long> {

    /**
     * Returns the {@link FDDepartment} with the given identifier.
     *
     * @param id the id to search for.
     * @return
     */
    FDDepartment findOne(Long id);

    /**
     * Saves the given {@link FDDepartment}.
     *
     * @param department the {@link FDDepartment} to search for.
     * @return
     */
    FDDepartment save(FDDepartment department);

    /**
     * Returns the customer with the given EmailAddress.
     *
     * @param identifier the identifier to search for.
     * @return
     */
    FDDepartment findByIdentifier(String identifier);
}
