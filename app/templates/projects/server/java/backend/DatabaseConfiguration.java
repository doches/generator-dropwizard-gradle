package <%= package %>.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.immutables.value.Value;
import org.skife.jdbi.v2.DBI;

@Value.Immutable
@JsonDeserialize(as = ImmutableDatabaseConfiguration.class)
public interface DatabaseConfiguration {
    
    @JsonProperty("connection")
    DataSourceFactory getDataSourceFactory();

    default DBI createDBI(Environment environment, String name) {
        DBIFactory factory = new DBIFactory();
        return factory.build(environment, getDataSourceFactory(), name);
    }
}
