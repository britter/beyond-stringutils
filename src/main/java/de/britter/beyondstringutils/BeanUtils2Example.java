/*
 * Copyright 2016 Benedikt Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.britter.beyondstringutils;

import static org.apache.commons.beanutils2.BeanUtils.on;

import java.util.Map;

public class BeanUtils2Example {

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "19.03.1970");

        on(person).set("firstName").with("William");

        Map<String, Object> props = on(person).describe();
        for (Map.Entry<String, Object> prop : props.entrySet()) {
            System.out.println(prop.getKey() + ": " + prop.getValue());
        }
    }

    public static class Person {

        private String firstName, lastName, birthday;

        public Person(final String firstName, final String lastName, final String birthday) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(final String birthday) {
            this.birthday = birthday;
        }
    }
}
