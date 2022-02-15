// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ForwardingRuleServiceDirectoryRegistrationResponse;
import io.pulumi.googlenative.compute_beta.outputs.MetadataFilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetGlobalForwardingRuleResult {
    private final Boolean allPorts;
    private final Boolean allowGlobalAccess;
    private final String backendService;
    private final String creationTimestamp;
    private final String description;
    private final String fingerprint;
    private final String ipAddress;
    private final String ipProtocol;
    private final String ipVersion;
    private final Boolean isMirroringCollector;
    private final String kind;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String loadBalancingScheme;
    private final List<MetadataFilterResponse> metadataFilters;
    private final String name;
    private final String network;
    private final String networkTier;
    private final String portRange;
    private final List<String> ports;
    private final String pscConnectionId;
    private final String pscConnectionStatus;
    private final String region;
    private final String selfLink;
    private final List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations;
    private final String serviceLabel;
    private final String serviceName;
    private final List<String> sourceIpRanges;
    private final String subnetwork;
    private final String target;

    @OutputCustomType.Constructor({"allPorts","allowGlobalAccess","backendService","creationTimestamp","description","fingerprint","ipAddress","ipProtocol","ipVersion","isMirroringCollector","kind","labelFingerprint","labels","loadBalancingScheme","metadataFilters","name","network","networkTier","portRange","ports","pscConnectionId","pscConnectionStatus","region","selfLink","serviceDirectoryRegistrations","serviceLabel","serviceName","sourceIpRanges","subnetwork","target"})
    private GetGlobalForwardingRuleResult(
        Boolean allPorts,
        Boolean allowGlobalAccess,
        String backendService,
        String creationTimestamp,
        String description,
        String fingerprint,
        String ipAddress,
        String ipProtocol,
        String ipVersion,
        Boolean isMirroringCollector,
        String kind,
        String labelFingerprint,
        Map<String,String> labels,
        String loadBalancingScheme,
        List<MetadataFilterResponse> metadataFilters,
        String name,
        String network,
        String networkTier,
        String portRange,
        List<String> ports,
        String pscConnectionId,
        String pscConnectionStatus,
        String region,
        String selfLink,
        List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations,
        String serviceLabel,
        String serviceName,
        List<String> sourceIpRanges,
        String subnetwork,
        String target) {
        this.allPorts = Objects.requireNonNull(allPorts);
        this.allowGlobalAccess = Objects.requireNonNull(allowGlobalAccess);
        this.backendService = Objects.requireNonNull(backendService);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.ipProtocol = Objects.requireNonNull(ipProtocol);
        this.ipVersion = Objects.requireNonNull(ipVersion);
        this.isMirroringCollector = Objects.requireNonNull(isMirroringCollector);
        this.kind = Objects.requireNonNull(kind);
        this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
        this.labels = Objects.requireNonNull(labels);
        this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
        this.metadataFilters = Objects.requireNonNull(metadataFilters);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.networkTier = Objects.requireNonNull(networkTier);
        this.portRange = Objects.requireNonNull(portRange);
        this.ports = Objects.requireNonNull(ports);
        this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
        this.pscConnectionStatus = Objects.requireNonNull(pscConnectionStatus);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serviceDirectoryRegistrations = Objects.requireNonNull(serviceDirectoryRegistrations);
        this.serviceLabel = Objects.requireNonNull(serviceLabel);
        this.serviceName = Objects.requireNonNull(serviceName);
        this.sourceIpRanges = Objects.requireNonNull(sourceIpRanges);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.target = Objects.requireNonNull(target);
    }

    public Boolean getAllPorts() {
        return this.allPorts;
    }
    public Boolean getAllowGlobalAccess() {
        return this.allowGlobalAccess;
    }
    public String getBackendService() {
        return this.backendService;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }
    public Boolean getIsMirroringCollector() {
        return this.isMirroringCollector;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLoadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public List<MetadataFilterResponse> getMetadataFilters() {
        return this.metadataFilters;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public String getNetworkTier() {
        return this.networkTier;
    }
    public String getPortRange() {
        return this.portRange;
    }
    public List<String> getPorts() {
        return this.ports;
    }
    public String getPscConnectionId() {
        return this.pscConnectionId;
    }
    public String getPscConnectionStatus() {
        return this.pscConnectionStatus;
    }
    public String getRegion() {
        return this.region;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public List<ForwardingRuleServiceDirectoryRegistrationResponse> getServiceDirectoryRegistrations() {
        return this.serviceDirectoryRegistrations;
    }
    public String getServiceLabel() {
        return this.serviceLabel;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public List<String> getSourceIpRanges() {
        return this.sourceIpRanges;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allPorts;
        private Boolean allowGlobalAccess;
        private String backendService;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String ipAddress;
        private String ipProtocol;
        private String ipVersion;
        private Boolean isMirroringCollector;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private List<MetadataFilterResponse> metadataFilters;
        private String name;
        private String network;
        private String networkTier;
        private String portRange;
        private List<String> ports;
        private String pscConnectionId;
        private String pscConnectionStatus;
        private String region;
        private String selfLink;
        private List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations;
        private String serviceLabel;
        private String serviceName;
        private List<String> sourceIpRanges;
        private String subnetwork;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipVersion = defaults.ipVersion;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.pscConnectionStatus = defaults.pscConnectionStatus;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceDirectoryRegistrations = defaults.serviceDirectoryRegistrations;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.serviceName = defaults.serviceName;
    	      this.sourceIpRanges = defaults.sourceIpRanges;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        public Builder setAllPorts(Boolean allPorts) {
            this.allPorts = Objects.requireNonNull(allPorts);
            return this;
        }

        public Builder setAllowGlobalAccess(Boolean allowGlobalAccess) {
            this.allowGlobalAccess = Objects.requireNonNull(allowGlobalAccess);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setIpProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }

        public Builder setIpVersion(String ipVersion) {
            this.ipVersion = Objects.requireNonNull(ipVersion);
            return this;
        }

        public Builder setIsMirroringCollector(Boolean isMirroringCollector) {
            this.isMirroringCollector = Objects.requireNonNull(isMirroringCollector);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLoadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }

        public Builder setMetadataFilters(List<MetadataFilterResponse> metadataFilters) {
            this.metadataFilters = Objects.requireNonNull(metadataFilters);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPortRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }

        public Builder setPorts(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setPscConnectionId(String pscConnectionId) {
            this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
            return this;
        }

        public Builder setPscConnectionStatus(String pscConnectionStatus) {
            this.pscConnectionStatus = Objects.requireNonNull(pscConnectionStatus);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServiceDirectoryRegistrations(List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = Objects.requireNonNull(serviceDirectoryRegistrations);
            return this;
        }

        public Builder setServiceLabel(String serviceLabel) {
            this.serviceLabel = Objects.requireNonNull(serviceLabel);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setSourceIpRanges(List<String> sourceIpRanges) {
            this.sourceIpRanges = Objects.requireNonNull(sourceIpRanges);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public GetGlobalForwardingRuleResult build() {
            return new GetGlobalForwardingRuleResult(allPorts, allowGlobalAccess, backendService, creationTimestamp, description, fingerprint, ipAddress, ipProtocol, ipVersion, isMirroringCollector, kind, labelFingerprint, labels, loadBalancingScheme, metadataFilters, name, network, networkTier, portRange, ports, pscConnectionId, pscConnectionStatus, region, selfLink, serviceDirectoryRegistrations, serviceLabel, serviceName, sourceIpRanges, subnetwork, target);
        }
    }
}