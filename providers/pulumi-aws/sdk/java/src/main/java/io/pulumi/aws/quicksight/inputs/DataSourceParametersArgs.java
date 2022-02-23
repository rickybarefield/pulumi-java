// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersArgs Empty = new DataSourceParametersArgs();

    /**
     * Parameters for connecting to Amazon Elasticsearch.
     * 
     */
    @InputImport(name="amazonElasticsearch")
    private final @Nullable Input<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch;

    public Input<DataSourceParametersAmazonElasticsearchArgs> getAmazonElasticsearch() {
        return this.amazonElasticsearch == null ? Input.empty() : this.amazonElasticsearch;
    }

    /**
     * Parameters for connecting to Athena.
     * 
     */
    @InputImport(name="athena")
    private final @Nullable Input<DataSourceParametersAthenaArgs> athena;

    public Input<DataSourceParametersAthenaArgs> getAthena() {
        return this.athena == null ? Input.empty() : this.athena;
    }

    /**
     * Parameters for connecting to Aurora MySQL.
     * 
     */
    @InputImport(name="aurora")
    private final @Nullable Input<DataSourceParametersAuroraArgs> aurora;

    public Input<DataSourceParametersAuroraArgs> getAurora() {
        return this.aurora == null ? Input.empty() : this.aurora;
    }

    /**
     * Parameters for connecting to Aurora Postgresql.
     * 
     */
    @InputImport(name="auroraPostgresql")
    private final @Nullable Input<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql;

    public Input<DataSourceParametersAuroraPostgresqlArgs> getAuroraPostgresql() {
        return this.auroraPostgresql == null ? Input.empty() : this.auroraPostgresql;
    }

    /**
     * Parameters for connecting to AWS IOT Analytics.
     * 
     */
    @InputImport(name="awsIotAnalytics")
    private final @Nullable Input<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics;

    public Input<DataSourceParametersAwsIotAnalyticsArgs> getAwsIotAnalytics() {
        return this.awsIotAnalytics == null ? Input.empty() : this.awsIotAnalytics;
    }

    /**
     * Parameters for connecting to Jira.
     * 
     */
    @InputImport(name="jira")
    private final @Nullable Input<DataSourceParametersJiraArgs> jira;

    public Input<DataSourceParametersJiraArgs> getJira() {
        return this.jira == null ? Input.empty() : this.jira;
    }

    /**
     * Parameters for connecting to MariaDB.
     * 
     */
    @InputImport(name="mariaDb")
    private final @Nullable Input<DataSourceParametersMariaDbArgs> mariaDb;

    public Input<DataSourceParametersMariaDbArgs> getMariaDb() {
        return this.mariaDb == null ? Input.empty() : this.mariaDb;
    }

    /**
     * Parameters for connecting to MySQL.
     * 
     */
    @InputImport(name="mysql")
    private final @Nullable Input<DataSourceParametersMysqlArgs> mysql;

    public Input<DataSourceParametersMysqlArgs> getMysql() {
        return this.mysql == null ? Input.empty() : this.mysql;
    }

    /**
     * Parameters for connecting to Oracle.
     * 
     */
    @InputImport(name="oracle")
    private final @Nullable Input<DataSourceParametersOracleArgs> oracle;

    public Input<DataSourceParametersOracleArgs> getOracle() {
        return this.oracle == null ? Input.empty() : this.oracle;
    }

    /**
     * Parameters for connecting to Postgresql.
     * 
     */
    @InputImport(name="postgresql")
    private final @Nullable Input<DataSourceParametersPostgresqlArgs> postgresql;

    public Input<DataSourceParametersPostgresqlArgs> getPostgresql() {
        return this.postgresql == null ? Input.empty() : this.postgresql;
    }

    /**
     * Parameters for connecting to Presto.
     * 
     */
    @InputImport(name="presto")
    private final @Nullable Input<DataSourceParametersPrestoArgs> presto;

    public Input<DataSourceParametersPrestoArgs> getPresto() {
        return this.presto == null ? Input.empty() : this.presto;
    }

    /**
     * Parameters for connecting to RDS.
     * 
     */
    @InputImport(name="rds")
    private final @Nullable Input<DataSourceParametersRdsArgs> rds;

    public Input<DataSourceParametersRdsArgs> getRds() {
        return this.rds == null ? Input.empty() : this.rds;
    }

    /**
     * Parameters for connecting to Redshift.
     * 
     */
    @InputImport(name="redshift")
    private final @Nullable Input<DataSourceParametersRedshiftArgs> redshift;

    public Input<DataSourceParametersRedshiftArgs> getRedshift() {
        return this.redshift == null ? Input.empty() : this.redshift;
    }

    /**
     * Parameters for connecting to S3.
     * 
     */
    @InputImport(name="s3")
    private final @Nullable Input<DataSourceParametersS3Args> s3;

    public Input<DataSourceParametersS3Args> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    /**
     * Parameters for connecting to ServiceNow.
     * 
     */
    @InputImport(name="serviceNow")
    private final @Nullable Input<DataSourceParametersServiceNowArgs> serviceNow;

    public Input<DataSourceParametersServiceNowArgs> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    /**
     * Parameters for connecting to Snowflake.
     * 
     */
    @InputImport(name="snowflake")
    private final @Nullable Input<DataSourceParametersSnowflakeArgs> snowflake;

    public Input<DataSourceParametersSnowflakeArgs> getSnowflake() {
        return this.snowflake == null ? Input.empty() : this.snowflake;
    }

    /**
     * Parameters for connecting to Spark.
     * 
     */
    @InputImport(name="spark")
    private final @Nullable Input<DataSourceParametersSparkArgs> spark;

    public Input<DataSourceParametersSparkArgs> getSpark() {
        return this.spark == null ? Input.empty() : this.spark;
    }

    /**
     * Parameters for connecting to SQL Server.
     * 
     */
    @InputImport(name="sqlServer")
    private final @Nullable Input<DataSourceParametersSqlServerArgs> sqlServer;

    public Input<DataSourceParametersSqlServerArgs> getSqlServer() {
        return this.sqlServer == null ? Input.empty() : this.sqlServer;
    }

    /**
     * Parameters for connecting to Teradata.
     * 
     */
    @InputImport(name="teradata")
    private final @Nullable Input<DataSourceParametersTeradataArgs> teradata;

    public Input<DataSourceParametersTeradataArgs> getTeradata() {
        return this.teradata == null ? Input.empty() : this.teradata;
    }

    /**
     * Parameters for connecting to Twitter.
     * 
     */
    @InputImport(name="twitter")
    private final @Nullable Input<DataSourceParametersTwitterArgs> twitter;

    public Input<DataSourceParametersTwitterArgs> getTwitter() {
        return this.twitter == null ? Input.empty() : this.twitter;
    }

    public DataSourceParametersArgs(
        @Nullable Input<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch,
        @Nullable Input<DataSourceParametersAthenaArgs> athena,
        @Nullable Input<DataSourceParametersAuroraArgs> aurora,
        @Nullable Input<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql,
        @Nullable Input<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics,
        @Nullable Input<DataSourceParametersJiraArgs> jira,
        @Nullable Input<DataSourceParametersMariaDbArgs> mariaDb,
        @Nullable Input<DataSourceParametersMysqlArgs> mysql,
        @Nullable Input<DataSourceParametersOracleArgs> oracle,
        @Nullable Input<DataSourceParametersPostgresqlArgs> postgresql,
        @Nullable Input<DataSourceParametersPrestoArgs> presto,
        @Nullable Input<DataSourceParametersRdsArgs> rds,
        @Nullable Input<DataSourceParametersRedshiftArgs> redshift,
        @Nullable Input<DataSourceParametersS3Args> s3,
        @Nullable Input<DataSourceParametersServiceNowArgs> serviceNow,
        @Nullable Input<DataSourceParametersSnowflakeArgs> snowflake,
        @Nullable Input<DataSourceParametersSparkArgs> spark,
        @Nullable Input<DataSourceParametersSqlServerArgs> sqlServer,
        @Nullable Input<DataSourceParametersTeradataArgs> teradata,
        @Nullable Input<DataSourceParametersTwitterArgs> twitter) {
        this.amazonElasticsearch = amazonElasticsearch;
        this.athena = athena;
        this.aurora = aurora;
        this.auroraPostgresql = auroraPostgresql;
        this.awsIotAnalytics = awsIotAnalytics;
        this.jira = jira;
        this.mariaDb = mariaDb;
        this.mysql = mysql;
        this.oracle = oracle;
        this.postgresql = postgresql;
        this.presto = presto;
        this.rds = rds;
        this.redshift = redshift;
        this.s3 = s3;
        this.serviceNow = serviceNow;
        this.snowflake = snowflake;
        this.spark = spark;
        this.sqlServer = sqlServer;
        this.teradata = teradata;
        this.twitter = twitter;
    }

    private DataSourceParametersArgs() {
        this.amazonElasticsearch = Input.empty();
        this.athena = Input.empty();
        this.aurora = Input.empty();
        this.auroraPostgresql = Input.empty();
        this.awsIotAnalytics = Input.empty();
        this.jira = Input.empty();
        this.mariaDb = Input.empty();
        this.mysql = Input.empty();
        this.oracle = Input.empty();
        this.postgresql = Input.empty();
        this.presto = Input.empty();
        this.rds = Input.empty();
        this.redshift = Input.empty();
        this.s3 = Input.empty();
        this.serviceNow = Input.empty();
        this.snowflake = Input.empty();
        this.spark = Input.empty();
        this.sqlServer = Input.empty();
        this.teradata = Input.empty();
        this.twitter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch;
        private @Nullable Input<DataSourceParametersAthenaArgs> athena;
        private @Nullable Input<DataSourceParametersAuroraArgs> aurora;
        private @Nullable Input<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql;
        private @Nullable Input<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics;
        private @Nullable Input<DataSourceParametersJiraArgs> jira;
        private @Nullable Input<DataSourceParametersMariaDbArgs> mariaDb;
        private @Nullable Input<DataSourceParametersMysqlArgs> mysql;
        private @Nullable Input<DataSourceParametersOracleArgs> oracle;
        private @Nullable Input<DataSourceParametersPostgresqlArgs> postgresql;
        private @Nullable Input<DataSourceParametersPrestoArgs> presto;
        private @Nullable Input<DataSourceParametersRdsArgs> rds;
        private @Nullable Input<DataSourceParametersRedshiftArgs> redshift;
        private @Nullable Input<DataSourceParametersS3Args> s3;
        private @Nullable Input<DataSourceParametersServiceNowArgs> serviceNow;
        private @Nullable Input<DataSourceParametersSnowflakeArgs> snowflake;
        private @Nullable Input<DataSourceParametersSparkArgs> spark;
        private @Nullable Input<DataSourceParametersSqlServerArgs> sqlServer;
        private @Nullable Input<DataSourceParametersTeradataArgs> teradata;
        private @Nullable Input<DataSourceParametersTwitterArgs> twitter;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonElasticsearch = defaults.amazonElasticsearch;
    	      this.athena = defaults.athena;
    	      this.aurora = defaults.aurora;
    	      this.auroraPostgresql = defaults.auroraPostgresql;
    	      this.awsIotAnalytics = defaults.awsIotAnalytics;
    	      this.jira = defaults.jira;
    	      this.mariaDb = defaults.mariaDb;
    	      this.mysql = defaults.mysql;
    	      this.oracle = defaults.oracle;
    	      this.postgresql = defaults.postgresql;
    	      this.presto = defaults.presto;
    	      this.rds = defaults.rds;
    	      this.redshift = defaults.redshift;
    	      this.s3 = defaults.s3;
    	      this.serviceNow = defaults.serviceNow;
    	      this.snowflake = defaults.snowflake;
    	      this.spark = defaults.spark;
    	      this.sqlServer = defaults.sqlServer;
    	      this.teradata = defaults.teradata;
    	      this.twitter = defaults.twitter;
        }

        public Builder setAmazonElasticsearch(@Nullable Input<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch) {
            this.amazonElasticsearch = amazonElasticsearch;
            return this;
        }

        public Builder setAmazonElasticsearch(@Nullable DataSourceParametersAmazonElasticsearchArgs amazonElasticsearch) {
            this.amazonElasticsearch = Input.ofNullable(amazonElasticsearch);
            return this;
        }

        public Builder setAthena(@Nullable Input<DataSourceParametersAthenaArgs> athena) {
            this.athena = athena;
            return this;
        }

        public Builder setAthena(@Nullable DataSourceParametersAthenaArgs athena) {
            this.athena = Input.ofNullable(athena);
            return this;
        }

        public Builder setAurora(@Nullable Input<DataSourceParametersAuroraArgs> aurora) {
            this.aurora = aurora;
            return this;
        }

        public Builder setAurora(@Nullable DataSourceParametersAuroraArgs aurora) {
            this.aurora = Input.ofNullable(aurora);
            return this;
        }

        public Builder setAuroraPostgresql(@Nullable Input<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql) {
            this.auroraPostgresql = auroraPostgresql;
            return this;
        }

        public Builder setAuroraPostgresql(@Nullable DataSourceParametersAuroraPostgresqlArgs auroraPostgresql) {
            this.auroraPostgresql = Input.ofNullable(auroraPostgresql);
            return this;
        }

        public Builder setAwsIotAnalytics(@Nullable Input<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics) {
            this.awsIotAnalytics = awsIotAnalytics;
            return this;
        }

        public Builder setAwsIotAnalytics(@Nullable DataSourceParametersAwsIotAnalyticsArgs awsIotAnalytics) {
            this.awsIotAnalytics = Input.ofNullable(awsIotAnalytics);
            return this;
        }

        public Builder setJira(@Nullable Input<DataSourceParametersJiraArgs> jira) {
            this.jira = jira;
            return this;
        }

        public Builder setJira(@Nullable DataSourceParametersJiraArgs jira) {
            this.jira = Input.ofNullable(jira);
            return this;
        }

        public Builder setMariaDb(@Nullable Input<DataSourceParametersMariaDbArgs> mariaDb) {
            this.mariaDb = mariaDb;
            return this;
        }

        public Builder setMariaDb(@Nullable DataSourceParametersMariaDbArgs mariaDb) {
            this.mariaDb = Input.ofNullable(mariaDb);
            return this;
        }

        public Builder setMysql(@Nullable Input<DataSourceParametersMysqlArgs> mysql) {
            this.mysql = mysql;
            return this;
        }

        public Builder setMysql(@Nullable DataSourceParametersMysqlArgs mysql) {
            this.mysql = Input.ofNullable(mysql);
            return this;
        }

        public Builder setOracle(@Nullable Input<DataSourceParametersOracleArgs> oracle) {
            this.oracle = oracle;
            return this;
        }

        public Builder setOracle(@Nullable DataSourceParametersOracleArgs oracle) {
            this.oracle = Input.ofNullable(oracle);
            return this;
        }

        public Builder setPostgresql(@Nullable Input<DataSourceParametersPostgresqlArgs> postgresql) {
            this.postgresql = postgresql;
            return this;
        }

        public Builder setPostgresql(@Nullable DataSourceParametersPostgresqlArgs postgresql) {
            this.postgresql = Input.ofNullable(postgresql);
            return this;
        }

        public Builder setPresto(@Nullable Input<DataSourceParametersPrestoArgs> presto) {
            this.presto = presto;
            return this;
        }

        public Builder setPresto(@Nullable DataSourceParametersPrestoArgs presto) {
            this.presto = Input.ofNullable(presto);
            return this;
        }

        public Builder setRds(@Nullable Input<DataSourceParametersRdsArgs> rds) {
            this.rds = rds;
            return this;
        }

        public Builder setRds(@Nullable DataSourceParametersRdsArgs rds) {
            this.rds = Input.ofNullable(rds);
            return this;
        }

        public Builder setRedshift(@Nullable Input<DataSourceParametersRedshiftArgs> redshift) {
            this.redshift = redshift;
            return this;
        }

        public Builder setRedshift(@Nullable DataSourceParametersRedshiftArgs redshift) {
            this.redshift = Input.ofNullable(redshift);
            return this;
        }

        public Builder setS3(@Nullable Input<DataSourceParametersS3Args> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable DataSourceParametersS3Args s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<DataSourceParametersServiceNowArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable DataSourceParametersServiceNowArgs serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setSnowflake(@Nullable Input<DataSourceParametersSnowflakeArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        public Builder setSnowflake(@Nullable DataSourceParametersSnowflakeArgs snowflake) {
            this.snowflake = Input.ofNullable(snowflake);
            return this;
        }

        public Builder setSpark(@Nullable Input<DataSourceParametersSparkArgs> spark) {
            this.spark = spark;
            return this;
        }

        public Builder setSpark(@Nullable DataSourceParametersSparkArgs spark) {
            this.spark = Input.ofNullable(spark);
            return this;
        }

        public Builder setSqlServer(@Nullable Input<DataSourceParametersSqlServerArgs> sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }

        public Builder setSqlServer(@Nullable DataSourceParametersSqlServerArgs sqlServer) {
            this.sqlServer = Input.ofNullable(sqlServer);
            return this;
        }

        public Builder setTeradata(@Nullable Input<DataSourceParametersTeradataArgs> teradata) {
            this.teradata = teradata;
            return this;
        }

        public Builder setTeradata(@Nullable DataSourceParametersTeradataArgs teradata) {
            this.teradata = Input.ofNullable(teradata);
            return this;
        }

        public Builder setTwitter(@Nullable Input<DataSourceParametersTwitterArgs> twitter) {
            this.twitter = twitter;
            return this;
        }

        public Builder setTwitter(@Nullable DataSourceParametersTwitterArgs twitter) {
            this.twitter = Input.ofNullable(twitter);
            return this;
        }
        public DataSourceParametersArgs build() {
            return new DataSourceParametersArgs(amazonElasticsearch, athena, aurora, auroraPostgresql, awsIotAnalytics, jira, mariaDb, mysql, oracle, postgresql, presto, rds, redshift, s3, serviceNow, snowflake, spark, sqlServer, teradata, twitter);
        }
    }
}