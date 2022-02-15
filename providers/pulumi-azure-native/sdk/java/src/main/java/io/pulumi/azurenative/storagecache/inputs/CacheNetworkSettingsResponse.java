// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheNetworkSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheNetworkSettingsResponse Empty = new CacheNetworkSettingsResponse();

    @InputImport(name="dnsSearchDomain")
    private final @Nullable String dnsSearchDomain;

    public Optional<String> getDnsSearchDomain() {
        return this.dnsSearchDomain == null ? Optional.empty() : Optional.ofNullable(this.dnsSearchDomain);
    }

    @InputImport(name="dnsServers")
    private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    @InputImport(name="mtu")
    private final @Nullable Integer mtu;

    public Optional<Integer> getMtu() {
        return this.mtu == null ? Optional.empty() : Optional.ofNullable(this.mtu);
    }

    @InputImport(name="ntpServer")
    private final @Nullable String ntpServer;

    public Optional<String> getNtpServer() {
        return this.ntpServer == null ? Optional.empty() : Optional.ofNullable(this.ntpServer);
    }

    @InputImport(name="utilityAddresses", required=true)
    private final List<String> utilityAddresses;

    public List<String> getUtilityAddresses() {
        return this.utilityAddresses;
    }

    public CacheNetworkSettingsResponse(
        @Nullable String dnsSearchDomain,
        @Nullable List<String> dnsServers,
        @Nullable Integer mtu,
        @Nullable String ntpServer,
        List<String> utilityAddresses) {
        this.dnsSearchDomain = dnsSearchDomain;
        this.dnsServers = dnsServers;
        this.mtu = mtu == null ? 1500 : mtu;
        this.ntpServer = ntpServer == null ? "time.windows.com" : ntpServer;
        this.utilityAddresses = Objects.requireNonNull(utilityAddresses, "expected parameter 'utilityAddresses' to be non-null");
    }

    private CacheNetworkSettingsResponse() {
        this.dnsSearchDomain = null;
        this.dnsServers = List.of();
        this.mtu = null;
        this.ntpServer = null;
        this.utilityAddresses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheNetworkSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsSearchDomain;
        private @Nullable List<String> dnsServers;
        private @Nullable Integer mtu;
        private @Nullable String ntpServer;
        private List<String> utilityAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheNetworkSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSearchDomain = defaults.dnsSearchDomain;
    	      this.dnsServers = defaults.dnsServers;
    	      this.mtu = defaults.mtu;
    	      this.ntpServer = defaults.ntpServer;
    	      this.utilityAddresses = defaults.utilityAddresses;
        }

        public Builder setDnsSearchDomain(@Nullable String dnsSearchDomain) {
            this.dnsSearchDomain = dnsSearchDomain;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setMtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder setNtpServer(@Nullable String ntpServer) {
            this.ntpServer = ntpServer;
            return this;
        }

        public Builder setUtilityAddresses(List<String> utilityAddresses) {
            this.utilityAddresses = Objects.requireNonNull(utilityAddresses);
            return this;
        }

        public CacheNetworkSettingsResponse build() {
            return new CacheNetworkSettingsResponse(dnsSearchDomain, dnsServers, mtu, ntpServer, utilityAddresses);
        }
    }
}