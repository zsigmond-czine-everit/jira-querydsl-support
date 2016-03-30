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
 * QCwdApplicationAddress is a Querydsl query type for QCwdApplicationAddress
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdApplicationAddress extends com.querydsl.sql.RelationalPathBase<QCwdApplicationAddress> {

    private static final long serialVersionUID = -1496379428;

    public static final QCwdApplicationAddress cwdApplicationAddress = new QCwdApplicationAddress("cwd_application_address");

    public final NumberPath<Long> applicationId = createNumber("applicationId", Long.class);

    public final StringPath encodedAddressBinary = createString("encodedAddressBinary");

    public final StringPath remoteAddress = createString("remoteAddress");

    public final NumberPath<Integer> remoteAddressMask = createNumber("remoteAddressMask", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QCwdApplicationAddress> cwdApplicationAddressPk = createPrimaryKey(applicationId, remoteAddress);

    public QCwdApplicationAddress(String variable) {
        super(QCwdApplicationAddress.class, forVariable(variable), "public", "cwd_application_address");
        addMetadata();
    }

    public QCwdApplicationAddress(String variable, String schema, String table) {
        super(QCwdApplicationAddress.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdApplicationAddress(Path<? extends QCwdApplicationAddress> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_application_address");
        addMetadata();
    }

    public QCwdApplicationAddress(PathMetadata metadata) {
        super(QCwdApplicationAddress.class, metadata, "public", "cwd_application_address");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationId, ColumnMetadata.named("application_id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(encodedAddressBinary, ColumnMetadata.named("encoded_address_binary").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(remoteAddress, ColumnMetadata.named("remote_address").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(remoteAddressMask, ColumnMetadata.named("remote_address_mask").withIndex(4).ofType(Types.NUMERIC).withSize(9));
    }

}

