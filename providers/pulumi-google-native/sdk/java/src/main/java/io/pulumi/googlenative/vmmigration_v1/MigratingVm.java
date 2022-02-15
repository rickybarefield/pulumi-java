// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.MigratingVmArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.CloneJobResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDefaultsResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.CutoverJobResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.ReplicationCycleResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.ReplicationSyncResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.SchedulePolicyResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:vmmigration/v1:MigratingVm")
public class MigratingVm extends io.pulumi.resources.CustomResource {
    @OutputExport(name="computeEngineTargetDefaults", type=ComputeEngineTargetDefaultsResponse.class, parameters={})
    private Output<ComputeEngineTargetDefaultsResponse> computeEngineTargetDefaults;

    public Output<ComputeEngineTargetDefaultsResponse> getComputeEngineTargetDefaults() {
        return this.computeEngineTargetDefaults;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="currentSyncInfo", type=ReplicationCycleResponse.class, parameters={})
    private Output<ReplicationCycleResponse> currentSyncInfo;

    public Output<ReplicationCycleResponse> getCurrentSyncInfo() {
        return this.currentSyncInfo;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    public Output<StatusResponse> getError() {
        return this.error;
    }
    @OutputExport(name="group", type=String.class, parameters={})
    private Output<String> group;

    public Output<String> getGroup() {
        return this.group;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="lastSync", type=ReplicationSyncResponse.class, parameters={})
    private Output<ReplicationSyncResponse> lastSync;

    public Output<ReplicationSyncResponse> getLastSync() {
        return this.lastSync;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policy", type=SchedulePolicyResponse.class, parameters={})
    private Output<SchedulePolicyResponse> policy;

    public Output<SchedulePolicyResponse> getPolicy() {
        return this.policy;
    }
    @OutputExport(name="recentCloneJobs", type=List.class, parameters={CloneJobResponse.class})
    private Output<List<CloneJobResponse>> recentCloneJobs;

    public Output<List<CloneJobResponse>> getRecentCloneJobs() {
        return this.recentCloneJobs;
    }
    @OutputExport(name="recentCutoverJobs", type=List.class, parameters={CutoverJobResponse.class})
    private Output<List<CutoverJobResponse>> recentCutoverJobs;

    public Output<List<CutoverJobResponse>> getRecentCutoverJobs() {
        return this.recentCutoverJobs;
    }
    @OutputExport(name="sourceVmId", type=String.class, parameters={})
    private Output<String> sourceVmId;

    public Output<String> getSourceVmId() {
        return this.sourceVmId;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    public Output<String> getStateTime() {
        return this.stateTime;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public MigratingVm(String name, MigratingVmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:MigratingVm", name, args == null ? MigratingVmArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MigratingVm(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:MigratingVm", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MigratingVm get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MigratingVm(name, id, options);
    }
}