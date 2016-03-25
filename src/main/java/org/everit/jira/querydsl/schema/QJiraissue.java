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
 * QJiraissue is a Querydsl query type for QJiraissue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJiraissue extends com.querydsl.sql.RelationalPathBase<QJiraissue> {

    private static final long serialVersionUID = 809853619;

    public static final QJiraissue jiraissue = new QJiraissue("jiraissue");

    public final StringPath assignee = createString("assignee");

    public final NumberPath<Long> component = createNumber("component", Long.class);

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath creator = createString("creator");

    public final StringPath description = createString("description");

    public final DateTimePath<java.sql.Timestamp> duedate = createDateTime("duedate", java.sql.Timestamp.class);

    public final StringPath environment = createString("environment");

    public final NumberPath<Long> fixfor = createNumber("fixfor", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issuenum = createNumber("issuenum", Long.class);

    public final StringPath issuestatus = createString("issuestatus");

    public final StringPath issuetype = createString("issuetype");

    public final StringPath pkey = createString("pkey");

    public final StringPath priority = createString("priority");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath reporter = createString("reporter");

    public final StringPath resolution = createString("resolution");

    public final DateTimePath<java.sql.Timestamp> resolutiondate = createDateTime("resolutiondate", java.sql.Timestamp.class);

    public final NumberPath<Long> security = createNumber("security", Long.class);

    public final StringPath summary = createString("summary");

    public final NumberPath<Long> timeestimate = createNumber("timeestimate", Long.class);

    public final NumberPath<Long> timeoriginalestimate = createNumber("timeoriginalestimate", Long.class);

    public final NumberPath<Long> timespent = createNumber("timespent", Long.class);

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final NumberPath<Long> votes = createNumber("votes", Long.class);

    public final NumberPath<Long> watches = createNumber("watches", Long.class);

    public final NumberPath<Long> workflowId = createNumber("workflowId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJiraissue> jiraissuePk = createPrimaryKey(id);

    public QJiraissue(String variable) {
        super(QJiraissue.class, forVariable(variable), "public", "jiraissue");
        addMetadata();
    }

    public QJiraissue(String variable, String schema, String table) {
        super(QJiraissue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraissue(Path<? extends QJiraissue> path) {
        super(path.getType(), path.getMetadata(), "public", "jiraissue");
        addMetadata();
    }

    public QJiraissue(PathMetadata metadata) {
        super(QJiraissue.class, metadata, "public", "jiraissue");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assignee, ColumnMetadata.named("assignee").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(component, ColumnMetadata.named("component").withIndex(27).ofType(Types.NUMERIC).withSize(18));
        addMetadata(created, ColumnMetadata.named("created").withIndex(15).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(creator, ColumnMetadata.named("creator").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(description, ColumnMetadata.named("description").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(duedate, ColumnMetadata.named("duedate").withIndex(17).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(environment, ColumnMetadata.named("environment").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fixfor, ColumnMetadata.named("fixfor").withIndex(26).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issuenum, ColumnMetadata.named("issuenum").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(issuestatus, ColumnMetadata.named("issuestatus").withIndex(14).ofType(Types.VARCHAR).withSize(255));
        addMetadata(issuetype, ColumnMetadata.named("issuetype").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pkey, ColumnMetadata.named("pkey").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(12).ofType(Types.VARCHAR).withSize(255));
        addMetadata(project, ColumnMetadata.named("project").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(reporter, ColumnMetadata.named("reporter").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(resolution, ColumnMetadata.named("resolution").withIndex(13).ofType(Types.VARCHAR).withSize(255));
        addMetadata(resolutiondate, ColumnMetadata.named("resolutiondate").withIndex(18).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(security, ColumnMetadata.named("security").withIndex(25).ofType(Types.NUMERIC).withSize(18));
        addMetadata(summary, ColumnMetadata.named("summary").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(timeestimate, ColumnMetadata.named("timeestimate").withIndex(22).ofType(Types.NUMERIC).withSize(18));
        addMetadata(timeoriginalestimate, ColumnMetadata.named("timeoriginalestimate").withIndex(21).ofType(Types.NUMERIC).withSize(18));
        addMetadata(timespent, ColumnMetadata.named("timespent").withIndex(23).ofType(Types.NUMERIC).withSize(18));
        addMetadata(updated, ColumnMetadata.named("updated").withIndex(16).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(votes, ColumnMetadata.named("votes").withIndex(19).ofType(Types.NUMERIC).withSize(18));
        addMetadata(watches, ColumnMetadata.named("watches").withIndex(20).ofType(Types.NUMERIC).withSize(18));
        addMetadata(workflowId, ColumnMetadata.named("workflow_id").withIndex(24).ofType(Types.NUMERIC).withSize(18));
    }

}

