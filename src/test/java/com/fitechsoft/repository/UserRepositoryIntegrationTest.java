/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fitechsoft.repository;

import com.fitechsoft.ApplicationConfig;
import com.fitechsoft.domain.subject.FDDepartment;
import com.fitechsoft.domain.subject.FDUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Integration tests for {@link UserRepository}.
 *
 * @author Chun Cao
 */
@ContextConfiguration(classes = ApplicationConfig.class)
public class UserRepositoryIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    public void savesUserCorrectly() {
        FDUser alice = new FDUser("Alice", "Zhang");

        FDUser result = userRepository.save(alice);
        assertThat(result.getId(), is(notNullValue()));
    }

    @Test
    public void readsUserByIdentifier() {

        FDUser fitech = new FDUser("Fitech", "Com");

        userRepository.save(fitech);

        FDUser result = userRepository.findByIdentifier("Fitech Com");
        assertThat(result, is(fitech));
    }

    @Test
    public void saveUserWithDepartmentCorrectly(){

        FDUser alice = new FDUser("Alice", "Zhang");
        FDDepartment techDept = new FDDepartment("Tech Department");

        alice.setSuperior(techDept);

        FDUser result = userRepository.save(alice);

        FDDepartment savedDept =  departmentRepository.findByIdentifier("Tech Department");

        assertThat(savedDept, is(notNullValue()));
        assertThat(savedDept, is(techDept));

    }

}
