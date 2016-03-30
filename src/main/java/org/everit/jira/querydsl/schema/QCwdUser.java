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
 * QCwdUser is a Querydsl query type for QCwdUser
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdUser extends com.querydsl.sql.RelationalPathBase<QCwdUser> {

    private static final long serialVersionUID = -40918749;

    public static final QCwdUser cwdUser = new QCwdUser("cwd_user");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath credential = createString("credential");

    public final NumberPath<Integer> deletedExternally = createNumber("deletedExternally", Integer.class);

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath displayName = createString("displayName");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath externalId = createString("externalId");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath lowerDisplayName = createString("lowerDisplayName");

    public final StringPath lowerEmailAddress = createString("lowerEmailAddress");

    public final StringPath lowerFirstName = createString("lowerFirstName");

    public final StringPath lowerLastName = createString("lowerLastName");

    public final StringPath lowerUserName = createString("lowerUserName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final StringPath userName = createString("userName");

    public final com.querydsl.sql.PrimaryKey<QCwdUser> cwdUserPk = createPrimaryKey(id);

    public QCwdUser(String variable) {
        super(QCwdUser.class, forVariable(variable), "public", "cwd_user");
        addMetadata();
    }

    public QCwdUser(String variable, String schema, String table) {
        super(QCwdUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdUser(Path<? extends QCwdUser> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_user");
        addMetadata();
    }

    public QCwdUser(PathMetadata metadata) {
        super(QCwdUser.class, metadata, "public", "cwd_user");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("active").withIndex(5).ofType(Types.NUMERIC).withSize(9));
        addMetadata(createdDate, ColumnMetadata.named("created_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(credential, ColumnMetadata.named("credential").withIndex(16).ofType(Types.VARCHAR).withSize(255));
        addMetadata(deletedExternally, ColumnMetadata.named("deleted_externally").withIndex(17).ofType(Types.NUMERIC).withSize(9));
        addMetadata(directoryId, ColumnMetadata.named("directory_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(displayName, ColumnMetadata.named("display_name").withIndex(12).ofType(Types.VARCHAR).withSize(255));
        addMetadata(emailAddress, ColumnMetadata.named("email_address").withIndex(14).ofType(Types.VARCHAR).withSize(255));
        addMetadata(externalId, ColumnMetadata.named("external_id").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerDisplayName, ColumnMetadata.named("lower_display_name").withIndex(13).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerEmailAddress, ColumnMetadata.named("lower_email_address").withIndex(15).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerFirstName, ColumnMetadata.named("lower_first_name").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerLastName, ColumnMetadata.named("lower_last_name").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerUserName, ColumnMetadata.named("lower_user_name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedDate, ColumnMetadata.named("updated_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(userName, ColumnMetadata.named("user_name").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

