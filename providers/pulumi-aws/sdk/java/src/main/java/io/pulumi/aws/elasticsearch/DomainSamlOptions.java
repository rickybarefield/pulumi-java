// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticsearch.DomainSamlOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsState;
import io.pulumi.aws.elasticsearch.outputs.DomainSamlOptionsSamlOptions;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages SAML authentication options for an AWS Elasticsearch Domain.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Elasticsearch domains can be imported using the `domain_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticsearch/domainSamlOptions:DomainSamlOptions example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:elasticsearch/domainSamlOptions:DomainSamlOptions")
public class DomainSamlOptions extends io.pulumi.resources.CustomResource {
    /**
     * Name of the domain.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    @OutputExport(name="samlOptions", type=DomainSamlOptionsSamlOptions.class, parameters={})
    private Output</* @Nullable */ DomainSamlOptionsSamlOptions> samlOptions;

    /**
     * @return The SAML authentication options for an AWS Elasticsearch Domain.
     * 
     */
    public Output</* @Nullable */ DomainSamlOptionsSamlOptions> getSamlOptions() {
        return this.samlOptions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainSamlOptions(String name, DomainSamlOptionsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domainSamlOptions:DomainSamlOptions", name, args == null ? DomainSamlOptionsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainSamlOptions(String name, Input<String> id, @Nullable DomainSamlOptionsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domainSamlOptions:DomainSamlOptions", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainSamlOptions get(String name, Input<String> id, @Nullable DomainSamlOptionsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainSamlOptions(name, id, state, options);
    }
}