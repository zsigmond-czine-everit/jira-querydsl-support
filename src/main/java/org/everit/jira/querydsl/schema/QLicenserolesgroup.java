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
package org.everit.jira.querydsl.schema;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLicenserolesgroup is a Querydsl query type for QLicenserolesgroup
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLicenserolesgroup extends com.querydsl.sql.RelationalPathBase<QLicenserolesgroup> {

    private static final long serialVersionUID = -866346581;

    public static final QLicenserolesgroup licenserolesgroup = new QLicenserolesgroup("licenserolesgroup");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath licenseRoleName = createString("licenseRoleName");

    public final com.querydsl.sql.PrimaryKey<QLicenserolesgroup> licenserolesgroupPk = createPrimaryKey(id);

    public QLicenserolesgroup(String variable) {
        super(QLicenserolesgroup.class, forVariable(variable), "public", "licenserolesgroup");
        addMetadata();
    }

    public QLicenserolesgroup(String variable, String schema, String table) {
        super(QLicenserolesgroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLicenserolesgroup(Path<? extends QLicenserolesgroup> path) {
        super(path.getType(), path.getMetadata(), "public", "licenserolesgroup");
        addMetadata();
    }

    public QLicenserolesgroup(PathMetadata metadata) {
        super(QLicenserolesgroup.class, metadata, "public", "licenserolesgroup");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(licenseRoleName, ColumnMetadata.named("license_role_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

