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
 * QRemotelink is a Querydsl query type for QRemotelink
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRemotelink extends com.querydsl.sql.RelationalPathBase<QRemotelink> {

    private static final long serialVersionUID = 416205176;

    public static final QRemotelink remotelink = new QRemotelink("remotelink");

    public final StringPath applicationname = createString("applicationname");

    public final StringPath applicationtype = createString("applicationtype");

    public final StringPath globalid = createString("globalid");

    public final StringPath icontitle = createString("icontitle");

    public final StringPath iconurl = createString("iconurl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath relationship = createString("relationship");

    public final StringPath resolved = createString("resolved");

    public final StringPath statuscategorycolorname = createString("statuscategorycolorname");

    public final StringPath statuscategorykey = createString("statuscategorykey");

    public final StringPath statusdescription = createString("statusdescription");

    public final StringPath statusiconlink = createString("statusiconlink");

    public final StringPath statusicontitle = createString("statusicontitle");

    public final StringPath statusiconurl = createString("statusiconurl");

    public final StringPath statusname = createString("statusname");

    public final StringPath summary = createString("summary");

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QRemotelink> remotelinkPk = createPrimaryKey(id);

    public QRemotelink(String variable) {
        super(QRemotelink.class, forVariable(variable), "public", "remotelink");
        addMetadata();
    }

    public QRemotelink(String variable, String schema, String table) {
        super(QRemotelink.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemotelink(Path<? extends QRemotelink> path) {
        super(path.getType(), path.getMetadata(), "public", "remotelink");
        addMetadata();
    }

    public QRemotelink(PathMetadata metadata) {
        super(QRemotelink.class, metadata, "public", "remotelink");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(applicationname, ColumnMetadata.named("applicationname").withIndex(19).ofType(Types.VARCHAR).withSize(255));
        addMetadata(applicationtype, ColumnMetadata.named("applicationtype").withIndex(18).ofType(Types.VARCHAR).withSize(255));
        addMetadata(globalid, ColumnMetadata.named("globalid").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(icontitle, ColumnMetadata.named("icontitle").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("iconurl").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueid, ColumnMetadata.named("issueid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(relationship, ColumnMetadata.named("relationship").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(resolved, ColumnMetadata.named("resolved").withIndex(10).ofType(Types.CHAR).withSize(1));
        addMetadata(statuscategorycolorname, ColumnMetadata.named("statuscategorycolorname").withIndex(17).ofType(Types.VARCHAR).withSize(255));
        addMetadata(statuscategorykey, ColumnMetadata.named("statuscategorykey").withIndex(16).ofType(Types.VARCHAR).withSize(255));
        addMetadata(statusdescription, ColumnMetadata.named("statusdescription").withIndex(12).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusiconlink, ColumnMetadata.named("statusiconlink").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusicontitle, ColumnMetadata.named("statusicontitle").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusiconurl, ColumnMetadata.named("statusiconurl").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(statusname, ColumnMetadata.named("statusname").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(summary, ColumnMetadata.named("summary").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(title, ColumnMetadata.named("title").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(url, ColumnMetadata.named("url").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

