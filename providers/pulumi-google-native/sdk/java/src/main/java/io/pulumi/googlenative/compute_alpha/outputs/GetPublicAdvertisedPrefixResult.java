// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.PublicAdvertisedPrefixPublicDelegatedPrefixResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPublicAdvertisedPrefixResult {
    private final String creationTimestamp;
    private final String description;
    private final String dnsVerificationIp;
    private final String fingerprint;
    private final String ipCidrRange;
    private final String kind;
    private final String name;
    private final List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs;
    private final String selfLink;
    private final String selfLinkWithId;
    private final String sharedSecret;
    private final String status;

    @OutputCustomType.Constructor({"creationTimestamp","description","dnsVerificationIp","fingerprint","ipCidrRange","kind","name","publicDelegatedPrefixs","selfLink","selfLinkWithId","sharedSecret","status"})
    private GetPublicAdvertisedPrefixResult(
        String creationTimestamp,
        String description,
        String dnsVerificationIp,
        String fingerprint,
        String ipCidrRange,
        String kind,
        String name,
        List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs,
        String selfLink,
        String selfLinkWithId,
        String sharedSecret,
        String status) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.dnsVerificationIp = Objects.requireNonNull(dnsVerificationIp);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.publicDelegatedPrefixs = Objects.requireNonNull(publicDelegatedPrefixs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.sharedSecret = Objects.requireNonNull(sharedSecret);
        this.status = Objects.requireNonNull(status);
    }

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDnsVerificationIp() {
        return this.dnsVerificationIp;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> getPublicDelegatedPrefixs() {
        return this.publicDelegatedPrefixs;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    public String getSharedSecret() {
        return this.sharedSecret;
    }
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicAdvertisedPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String dnsVerificationIp;
        private String fingerprint;
        private String ipCidrRange;
        private String kind;
        private String name;
        private List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs;
        private String selfLink;
        private String selfLinkWithId;
        private String sharedSecret;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicAdvertisedPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.dnsVerificationIp = defaults.dnsVerificationIp;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicDelegatedPrefixs = defaults.publicDelegatedPrefixs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.sharedSecret = defaults.sharedSecret;
    	      this.status = defaults.status;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDnsVerificationIp(String dnsVerificationIp) {
            this.dnsVerificationIp = Objects.requireNonNull(dnsVerificationIp);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicDelegatedPrefixs(List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse> publicDelegatedPrefixs) {
            this.publicDelegatedPrefixs = Objects.requireNonNull(publicDelegatedPrefixs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setSharedSecret(String sharedSecret) {
            this.sharedSecret = Objects.requireNonNull(sharedSecret);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public GetPublicAdvertisedPrefixResult build() {
            return new GetPublicAdvertisedPrefixResult(creationTimestamp, description, dnsVerificationIp, fingerprint, ipCidrRange, kind, name, publicDelegatedPrefixs, selfLink, selfLinkWithId, sharedSecret, status);
        }
    }
}