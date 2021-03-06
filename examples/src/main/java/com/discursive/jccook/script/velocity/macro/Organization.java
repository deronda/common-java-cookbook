/* 
 * ========================================================================
 * 
 * Copyright 2005 Tim O'Brien.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ========================================================================
 */
package com.discursive.jccook.script.velocity.macro;

public class Organization {

    private String id;
    private String baseUrl;
    private String email;
    private Person president;
    private Address address;

    public String getId() {
        return id;
    }
    public Address getAddress() {
        return address;
    }
    public String getBaseUrl() {
        return baseUrl;
    }
    public String getEmail() {
        return email;
    }
    public Person getPresident() {
        return president;
    }

    public void setId(String pId) {
        this.id = pId;
    }
    public void setAddress(Address pAddress) {
        this.address = pAddress;
    }
    public void setBaseUrl(String pBaseUrl) {
        baseUrl = pBaseUrl;
    }
    public void setEmail(String pEmail) {
        email = pEmail;
    }
    public void setPresident(Person pPerson) {
        president = pPerson;
    }

}
