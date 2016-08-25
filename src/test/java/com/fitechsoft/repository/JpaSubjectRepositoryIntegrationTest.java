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

import com.fitechsoft.PlainJpaConfig;
import com.fitechsoft.domain.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Integration test for the manual implementation ({@link JpaSubjectRepository}) of the {@link SubjectRepository}
 * interface.
 *
 * @author Oliver Gierke
 */
@ContextConfiguration(classes = PlainJpaConfig.class)
public class JpaSubjectRepositoryIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    SubjectRepository repository;

    @Test
    public void insertsNewSubjectCorrectly() {

        Subject subject = new Subject("Alicia");
        subject = repository.save(subject);

        assertThat(subject.getId(), is(notNullValue()));
    }

    @Test
    public void updatesSubjectCorrectly() {

        Subject matthews = repository.findByIdentifier("Matthews");
        assertThat(matthews, is(notNullValue()));

        matthews.setIdentifier("Matt");
        matthews = repository.save(matthews);

        Subject reference = repository.findByIdentifier(matthews.getIdentifier());
        assertThat(reference.getIdentifier(), is(matthews.getIdentifier()));
    }
}
