/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents resource specific settings.
 */
public class ResourceSettings {
    /**
     * The unique id of the resource setting.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The resource id of the gallery image used for creating the virtual
     * machine.
     */
    @JsonProperty(value = "galleryImageResourceId")
    private String galleryImageResourceId;

    /**
     * The name of the image used to created the environment setting.
     */
    @JsonProperty(value = "imageName", access = JsonProperty.Access.WRITE_ONLY)
    private String imageName;

    /**
     * The size of the virtual machine. Possible values include: 'Basic',
     * 'Standard', 'Performance'.
     */
    @JsonProperty(value = "size")
    private ManagedLabVmSize size;

    /**
     * The translated compute cores of the virtual machine.
     */
    @JsonProperty(value = "cores", access = JsonProperty.Access.WRITE_ONLY)
    private Integer cores;

    /**
     * Details specific to Reference Vm.
     */
    @JsonProperty(value = "referenceVm", required = true)
    private ReferenceVm referenceVm;

    /**
     * Get the unique id of the resource setting.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the resource id of the gallery image used for creating the virtual machine.
     *
     * @return the galleryImageResourceId value
     */
    public String galleryImageResourceId() {
        return this.galleryImageResourceId;
    }

    /**
     * Set the resource id of the gallery image used for creating the virtual machine.
     *
     * @param galleryImageResourceId the galleryImageResourceId value to set
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withGalleryImageResourceId(String galleryImageResourceId) {
        this.galleryImageResourceId = galleryImageResourceId;
        return this;
    }

    /**
     * Get the name of the image used to created the environment setting.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Get the size of the virtual machine. Possible values include: 'Basic', 'Standard', 'Performance'.
     *
     * @return the size value
     */
    public ManagedLabVmSize size() {
        return this.size;
    }

    /**
     * Set the size of the virtual machine. Possible values include: 'Basic', 'Standard', 'Performance'.
     *
     * @param size the size value to set
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withSize(ManagedLabVmSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the translated compute cores of the virtual machine.
     *
     * @return the cores value
     */
    public Integer cores() {
        return this.cores;
    }

    /**
     * Get details specific to Reference Vm.
     *
     * @return the referenceVm value
     */
    public ReferenceVm referenceVm() {
        return this.referenceVm;
    }

    /**
     * Set details specific to Reference Vm.
     *
     * @param referenceVm the referenceVm value to set
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withReferenceVm(ReferenceVm referenceVm) {
        this.referenceVm = referenceVm;
        return this;
    }

}