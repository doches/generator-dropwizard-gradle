package <%= package %>.backend;

import org.jdbi.v3.sqlobject.statement.SqlQuery;

public abstract class DatabaseBackend {
    @SqlQuery("select 1")
    public abstract Integer exampleQuery();
}
