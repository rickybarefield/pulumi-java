// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.DayOfWeek;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoPatchingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoPatchingSettingsArgs Empty = new AutoPatchingSettingsArgs();

    @InputImport(name="dayOfWeek")
    private final @Nullable Input<DayOfWeek> dayOfWeek;

    public Input<DayOfWeek> getDayOfWeek() {
        return this.dayOfWeek == null ? Input.empty() : this.dayOfWeek;
    }

    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    @InputImport(name="maintenanceWindowDuration")
    private final @Nullable Input<Integer> maintenanceWindowDuration;

    public Input<Integer> getMaintenanceWindowDuration() {
        return this.maintenanceWindowDuration == null ? Input.empty() : this.maintenanceWindowDuration;
    }

    @InputImport(name="maintenanceWindowStartingHour")
    private final @Nullable Input<Integer> maintenanceWindowStartingHour;

    public Input<Integer> getMaintenanceWindowStartingHour() {
        return this.maintenanceWindowStartingHour == null ? Input.empty() : this.maintenanceWindowStartingHour;
    }

    public AutoPatchingSettingsArgs(
        @Nullable Input<DayOfWeek> dayOfWeek,
        @Nullable Input<Boolean> enable,
        @Nullable Input<Integer> maintenanceWindowDuration,
        @Nullable Input<Integer> maintenanceWindowStartingHour) {
        this.dayOfWeek = dayOfWeek;
        this.enable = enable;
        this.maintenanceWindowDuration = maintenanceWindowDuration;
        this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
    }

    private AutoPatchingSettingsArgs() {
        this.dayOfWeek = Input.empty();
        this.enable = Input.empty();
        this.maintenanceWindowDuration = Input.empty();
        this.maintenanceWindowStartingHour = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoPatchingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DayOfWeek> dayOfWeek;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<Integer> maintenanceWindowDuration;
        private @Nullable Input<Integer> maintenanceWindowStartingHour;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoPatchingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.enable = defaults.enable;
    	      this.maintenanceWindowDuration = defaults.maintenanceWindowDuration;
    	      this.maintenanceWindowStartingHour = defaults.maintenanceWindowStartingHour;
        }

        public Builder setDayOfWeek(@Nullable Input<DayOfWeek> dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder setDayOfWeek(@Nullable DayOfWeek dayOfWeek) {
            this.dayOfWeek = Input.ofNullable(dayOfWeek);
            return this;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setMaintenanceWindowDuration(@Nullable Input<Integer> maintenanceWindowDuration) {
            this.maintenanceWindowDuration = maintenanceWindowDuration;
            return this;
        }

        public Builder setMaintenanceWindowDuration(@Nullable Integer maintenanceWindowDuration) {
            this.maintenanceWindowDuration = Input.ofNullable(maintenanceWindowDuration);
            return this;
        }

        public Builder setMaintenanceWindowStartingHour(@Nullable Input<Integer> maintenanceWindowStartingHour) {
            this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
            return this;
        }

        public Builder setMaintenanceWindowStartingHour(@Nullable Integer maintenanceWindowStartingHour) {
            this.maintenanceWindowStartingHour = Input.ofNullable(maintenanceWindowStartingHour);
            return this;
        }

        public AutoPatchingSettingsArgs build() {
            return new AutoPatchingSettingsArgs(dayOfWeek, enable, maintenanceWindowDuration, maintenanceWindowStartingHour);
        }
    }
}