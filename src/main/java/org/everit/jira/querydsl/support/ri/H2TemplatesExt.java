/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.querydsl.support.ri;

import com.querydsl.sql.SQLTemplates;

/**
 * H2TemplatesExt is an SQL dialect for H2.
 */
public class H2TemplatesExt extends com.querydsl.sql.H2Templates {

  /**
   * Builder to create H2TemplatesExt.
   */
  public static Builder builder() {
    return new Builder() {

      @Override
      protected SQLTemplates build(final char escape, final boolean quote) {
        return new H2TemplatesExt(escape, quote);
      }
    };
  }

  public H2TemplatesExt(final char escape, final boolean quote) {
    super(escape, quote);
    setSupportsUnquotedReservedWordsAsIdentifier(true);
  }
}
