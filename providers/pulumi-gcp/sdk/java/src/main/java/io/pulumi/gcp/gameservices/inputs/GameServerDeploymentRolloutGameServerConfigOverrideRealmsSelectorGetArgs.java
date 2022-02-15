// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs Empty = new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs();

    @InputImport(name="realms")
    private final @Nullable Input<List<String>> realms;

    public Input<List<String>> getRealms() {
        return this.realms == null ? Input.empty() : this.realms;
    }

    public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs(@Nullable Input<List<String>> realms) {
        this.realms = realms;
    }

    private GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs() {
        this.realms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> realms;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realms = defaults.realms;
        }

        public Builder setRealms(@Nullable Input<List<String>> realms) {
            this.realms = realms;
            return this;
        }

        public Builder setRealms(@Nullable List<String> realms) {
            this.realms = Input.ofNullable(realms);
            return this;
        }

        public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs build() {
            return new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorGetArgs(realms);
        }
    }
}