package <%= package %>.backend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableDatabaseConfiguration.class)
public interface DatabaseConfiguration {
    
    @JsonProperty("connection")
    DataSourceFactory getDataSourceFactory();
}
