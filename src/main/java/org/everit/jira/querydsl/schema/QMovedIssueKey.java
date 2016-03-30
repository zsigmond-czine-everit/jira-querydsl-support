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
 * QMovedIssueKey is a Querydsl query type for QMovedIssueKey
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMovedIssueKey extends com.querydsl.sql.RelationalPathBase<QMovedIssueKey> {

    private static final long serialVersionUID = 543794017;

    public static final QMovedIssueKey movedIssueKey = new QMovedIssueKey("moved_issue_key");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueId = createNumber("issueId", Long.class);

    public final StringPath oldIssueKey = createString("oldIssueKey");

    public final com.querydsl.sql.PrimaryKey<QMovedIssueKey> movedIssueKeyPk = createPrimaryKey(id);

    public QMovedIssueKey(String variable) {
        super(QMovedIssueKey.class, forVariable(variable), "public", "moved_issue_key");
        addMetadata();
    }

    public QMovedIssueKey(String variable, String schema, String table) {
        super(QMovedIssueKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMovedIssueKey(Path<? extends QMovedIssueKey> path) {
        super(path.getType(), path.getMetadata(), "public", "moved_issue_key");
        addMetadata();
    }

    public QMovedIssueKey(PathMetadata metadata) {
        super(QMovedIssueKey.class, metadata, "public", "moved_issue_key");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueId, ColumnMetadata.named("issue_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(oldIssueKey, ColumnMetadata.named("old_issue_key").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

