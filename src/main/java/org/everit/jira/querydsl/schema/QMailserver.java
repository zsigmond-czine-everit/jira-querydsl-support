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
 * QMailserver is a Querydsl query type for QMailserver
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMailserver extends com.querydsl.sql.RelationalPathBase<QMailserver> {

    private static final long serialVersionUID = -1033600014;

    public static final QMailserver mailserver = new QMailserver("mailserver");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath istlsrequired = createString("istlsrequired");

    public final StringPath jndilocation = createString("jndilocation");

    public final StringPath mailfrom = createString("mailfrom");

    public final StringPath mailpassword = createString("mailpassword");

    public final StringPath mailusername = createString("mailusername");

    public final StringPath name = createString("name");

    public final StringPath prefix = createString("prefix");

    public final StringPath protocol = createString("protocol");

    public final StringPath servername = createString("servername");

    public final StringPath serverType = createString("serverType");

    public final StringPath smtpPort = createString("smtpPort");

    public final StringPath socksHost = createString("socksHost");

    public final StringPath socksPort = createString("socksPort");

    public final NumberPath<Long> timeout = createNumber("timeout", Long.class);

    public final com.querydsl.sql.PrimaryKey<QMailserver> mailserverPk = createPrimaryKey(id);

    public QMailserver(String variable) {
        super(QMailserver.class, forVariable(variable), "public", "mailserver");
        addMetadata();
    }

    public QMailserver(String variable, String schema, String table) {
        super(QMailserver.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMailserver(Path<? extends QMailserver> path) {
        super(path.getType(), path.getMetadata(), "public", "mailserver");
        addMetadata();
    }

    public QMailserver(PathMetadata metadata) {
        super(QMailserver.class, metadata, "public", "mailserver");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(istlsrequired, ColumnMetadata.named("istlsrequired").withIndex(13).ofType(Types.VARCHAR).withSize(60));
        addMetadata(jndilocation, ColumnMetadata.named("jndilocation").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mailfrom, ColumnMetadata.named("mailfrom").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mailpassword, ColumnMetadata.named("mailpassword").withIndex(12).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mailusername, ColumnMetadata.named("mailusername").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(prefix, ColumnMetadata.named("prefix").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(servername, ColumnMetadata.named("servername").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(serverType, ColumnMetadata.named("server_type").withIndex(8).ofType(Types.VARCHAR).withSize(60));
        addMetadata(smtpPort, ColumnMetadata.named("smtp_port").withIndex(6).ofType(Types.VARCHAR).withSize(60));
        addMetadata(socksHost, ColumnMetadata.named("socks_host").withIndex(16).ofType(Types.VARCHAR).withSize(60));
        addMetadata(socksPort, ColumnMetadata.named("socks_port").withIndex(15).ofType(Types.VARCHAR).withSize(60));
        addMetadata(timeout, ColumnMetadata.named("timeout").withIndex(14).ofType(Types.NUMERIC).withSize(18));
    }

}

