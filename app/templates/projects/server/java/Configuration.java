package <%= package %>;

import static com.google.common.base.Preconditions.checkNotNull;

import <%= package %>.backend.DatabaseBackend;
import <%= package %>.backend.DatabaseConfiguration;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 * Server configuration for the <%= name %> API server.
 */
public final class <%= className %>Configuration extends Configuration {
    private final DatabaseConfiguration databaseConfiguration;

    @JsonCreator
    public <%= className %>Configuration(
            @JsonProperty("database") final DatabaseConfiguration database) {
        checkNotNull(database);

        this.databaseConfiguration = database;
    }

    public DatabaseConfiguration getDatabaseConfiguration() { return databaseConfiguration; }

    public DatabaseBackend getDatabaseBackend(Environment environment) {
        return databaseConfiguration.createDBI(environment, "jdbi-backend").onDemand(DatabaseBackend.class);
    }
}
