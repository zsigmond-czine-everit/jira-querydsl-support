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
 * QCwdMembership is a Querydsl query type for QCwdMembership
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdMembership extends com.querydsl.sql.RelationalPathBase<QCwdMembership> {

    private static final long serialVersionUID = 1115609902;

    public static final QCwdMembership cwdMembership = new QCwdMembership("cwd_membership");

    public final NumberPath<Long> childId = createNumber("childId", Long.class);

    public final StringPath childName = createString("childName");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath groupType = createString("groupType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerChildName = createString("lowerChildName");

    public final StringPath lowerParentName = createString("lowerParentName");

    public final StringPath membershipType = createString("membershipType");

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final StringPath parentName = createString("parentName");

    public final com.querydsl.sql.PrimaryKey<QCwdMembership> cwdMembershipPk = createPrimaryKey(id);

    public QCwdMembership(String variable) {
        super(QCwdMembership.class, forVariable(variable), "public", "cwd_membership");
        addMetadata();
    }

    public QCwdMembership(String variable, String schema, String table) {
        super(QCwdMembership.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdMembership(Path<? extends QCwdMembership> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_membership");
        addMetadata();
    }

    public QCwdMembership(PathMetadata metadata) {
        super(QCwdMembership.class, metadata, "public", "cwd_membership");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(childId, ColumnMetadata.named("child_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(childName, ColumnMetadata.named("child_name").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(directoryId, ColumnMetadata.named("directory_id").withIndex(10).ofType(Types.NUMERIC).withSize(18));
        addMetadata(groupType, ColumnMetadata.named("group_type").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lowerChildName, ColumnMetadata.named("lower_child_name").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerParentName, ColumnMetadata.named("lower_parent_name").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(membershipType, ColumnMetadata.named("membership_type").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(parentId, ColumnMetadata.named("parent_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(parentName, ColumnMetadata.named("parent_name").withIndex(6).ofType(Types.VARCHAR).withSize(255));
    }

}

