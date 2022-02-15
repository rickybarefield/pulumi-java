// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs;
import java.lang.String;
import java.util.Objects;


public final class MetastoreServiceHiveMetastoreConfigKerberosConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceHiveMetastoreConfigKerberosConfigArgs Empty = new MetastoreServiceHiveMetastoreConfigKerberosConfigArgs();

    @InputImport(name="keytab", required=true)
    private final Input<MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs> keytab;

    public Input<MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs> getKeytab() {
        return this.keytab;
    }

    @InputImport(name="krb5ConfigGcsUri", required=true)
    private final Input<String> krb5ConfigGcsUri;

    public Input<String> getKrb5ConfigGcsUri() {
        return this.krb5ConfigGcsUri;
    }

    @InputImport(name="principal", required=true)
    private final Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal;
    }

    public MetastoreServiceHiveMetastoreConfigKerberosConfigArgs(
        Input<MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs> keytab,
        Input<String> krb5ConfigGcsUri,
        Input<String> principal) {
        this.keytab = Objects.requireNonNull(keytab, "expected parameter 'keytab' to be non-null");
        this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri, "expected parameter 'krb5ConfigGcsUri' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private MetastoreServiceHiveMetastoreConfigKerberosConfigArgs() {
        this.keytab = Input.empty();
        this.krb5ConfigGcsUri = Input.empty();
        this.principal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfigKerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs> keytab;
        private Input<String> krb5ConfigGcsUri;
        private Input<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfigKerberosConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keytab = defaults.keytab;
    	      this.krb5ConfigGcsUri = defaults.krb5ConfigGcsUri;
    	      this.principal = defaults.principal;
        }

        public Builder setKeytab(Input<MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs> keytab) {
            this.keytab = Objects.requireNonNull(keytab);
            return this;
        }

        public Builder setKeytab(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabArgs keytab) {
            this.keytab = Input.of(Objects.requireNonNull(keytab));
            return this;
        }

        public Builder setKrb5ConfigGcsUri(Input<String> krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri);
            return this;
        }

        public Builder setKrb5ConfigGcsUri(String krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Input.of(Objects.requireNonNull(krb5ConfigGcsUri));
            return this;
        }

        public Builder setPrincipal(Input<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Input.of(Objects.requireNonNull(principal));
            return this;
        }

        public MetastoreServiceHiveMetastoreConfigKerberosConfigArgs build() {
            return new MetastoreServiceHiveMetastoreConfigKerberosConfigArgs(keytab, krb5ConfigGcsUri, principal);
        }
    }
}