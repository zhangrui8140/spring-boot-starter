/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package sample.mybatis.xml.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.annotation.Generated;
import java.io.Serializable;

/**
 * @author Eddú Meléndez
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CITY")
public class City implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  @Column
  private String name;

  @Column
  private String state;

  @Column
  private String country;

  @Override
  public String toString() {
    return getId() + "," + getName() + "," + getState() + "," + getCountry();
  }
}
