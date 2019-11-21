/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.TransformOutput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A Transform encapsulates the rules or instructions for generating desired
 * outputs from input media, such as by transcoding or by extracting insights.
 * After the Transform is created, it can be applied to input media by creating
 * Jobs.
 */
@JsonFlatten
public class TransformInner extends ProxyResource {
    /**
     * The UTC date and time when the Transform was created, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * An optional verbose description of the Transform.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The UTC date and time when the Transform was last updated, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * An array of one or more TransformOutputs that the Transform should
     * generate.
     */
    @JsonProperty(value = "properties.outputs", required = true)
    private List<TransformOutput> outputs;

    /**
     * Get the UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get an optional verbose description of the Transform.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set an optional verbose description of the Transform.
     *
     * @param description the description value to set
     * @return the TransformInner object itself.
     */
    public TransformInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get an array of one or more TransformOutputs that the Transform should generate.
     *
     * @return the outputs value
     */
    public List<TransformOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set an array of one or more TransformOutputs that the Transform should generate.
     *
     * @param outputs the outputs value to set
     * @return the TransformInner object itself.
     */
    public TransformInner withOutputs(List<TransformOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

}
