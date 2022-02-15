// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceGroupNamedPortGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupState Empty = new InstanceGroupState();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="instances")
    private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="namedPorts")
    private final @Nullable Input<List<InstanceGroupNamedPortGetArgs>> namedPorts;

    public Input<List<InstanceGroupNamedPortGetArgs>> getNamedPorts() {
        return this.namedPorts == null ? Input.empty() : this.namedPorts;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceGroupState(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> instances,
        @Nullable Input<String> name,
        @Nullable Input<List<InstanceGroupNamedPortGetArgs>> namedPorts,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<Integer> size,
        @Nullable Input<String> zone) {
        this.description = description;
        this.instances = instances;
        this.name = name;
        this.namedPorts = namedPorts;
        this.network = network;
        this.project = project;
        this.selfLink = selfLink;
        this.size = size;
        this.zone = zone;
    }

    private InstanceGroupState() {
        this.description = Input.empty();
        this.instances = Input.empty();
        this.name = Input.empty();
        this.namedPorts = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.size = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<String> name;
        private @Nullable Input<List<InstanceGroupNamedPortGetArgs>> namedPorts;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamedPorts(@Nullable Input<List<InstanceGroupNamedPortGetArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder setNamedPorts(@Nullable List<InstanceGroupNamedPortGetArgs> namedPorts) {
            this.namedPorts = Input.ofNullable(namedPorts);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public InstanceGroupState build() {
            return new InstanceGroupState(description, instances, name, namedPorts, network, project, selfLink, size, zone);
        }
    }
}