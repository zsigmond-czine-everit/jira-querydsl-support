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
 * QPortletconfiguration is a Querydsl query type for QPortletconfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPortletconfiguration extends com.querydsl.sql.RelationalPathBase<QPortletconfiguration> {

    private static final long serialVersionUID = 106142580;

    public static final QPortletconfiguration portletconfiguration = new QPortletconfiguration("portletconfiguration");

    public final StringPath color = createString("color");

    public final NumberPath<Integer> columnNumber = createNumber("columnNumber", Integer.class);

    public final StringPath gadgetXml = createString("gadgetXml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> portalpage = createNumber("portalpage", Long.class);

    public final StringPath portletId = createString("portletId");

    public final NumberPath<Integer> positionseq = createNumber("positionseq", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPortletconfiguration> portletconfigurationPk = createPrimaryKey(id);

    public QPortletconfiguration(String variable) {
        super(QPortletconfiguration.class, forVariable(variable), "public", "portletconfiguration");
        addMetadata();
    }

    public QPortletconfiguration(String variable, String schema, String table) {
        super(QPortletconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPortletconfiguration(Path<? extends QPortletconfiguration> path) {
        super(path.getType(), path.getMetadata(), "public", "portletconfiguration");
        addMetadata();
    }

    public QPortletconfiguration(PathMetadata metadata) {
        super(QPortletconfiguration.class, metadata, "public", "portletconfiguration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(color, ColumnMetadata.named("color").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(columnNumber, ColumnMetadata.named("column_number").withIndex(4).ofType(Types.NUMERIC).withSize(9));
        addMetadata(gadgetXml, ColumnMetadata.named("gadget_xml").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(portalpage, ColumnMetadata.named("portalpage").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(portletId, ColumnMetadata.named("portlet_id").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(positionseq, ColumnMetadata.named("positionseq").withIndex(5).ofType(Types.NUMERIC).withSize(9));
    }

}

