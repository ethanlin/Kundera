/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kundera.tests.crossdatastore.useraddress.datatype.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.impetus.kundera.index.Index;
import com.impetus.kundera.index.IndexCollection;

@Entity
@Table(name = "ADDRESS_INT", schema = "KunderaTests@addCassandra")
@IndexCollection(columns = { @Index(name = "street") })
public class HabitatBiMToMShort
{
    @Id
    @Column(name = "ADDRESS_ID")
    private short addressId;

    @Column(name = "STREET")
    private String street;

    @ManyToMany(mappedBy = "addresses", fetch = FetchType.LAZY)
    private Set<PersonnelBiMToMInt> people;

    public short getAddressId()
    {
        return addressId;
    }

    public void setAddressId(short addressId)
    {
        this.addressId = addressId;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public Set<PersonnelBiMToMInt> getPeople()
    {
        return people;
    }

    public void setPeople(Set<PersonnelBiMToMInt> people)
    {
        this.people = people;
    }

}
