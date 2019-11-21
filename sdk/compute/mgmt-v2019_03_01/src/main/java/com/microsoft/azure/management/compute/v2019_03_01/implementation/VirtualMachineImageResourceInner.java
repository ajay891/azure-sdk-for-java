/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Virtual machine image resource information.
 */
public class VirtualMachineImageResourceInner extends SubResource {
    /**
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The supported Azure location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Specifies the tags that are assigned to the virtual machine. For more
     * information about using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource.
     *
     * @param name the name value to set
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the supported Azure location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the supported Azure location of the resource.
     *
     * @param location the location value to set
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get specifies the tags that are assigned to the virtual machine. For more information about using tags, see [Using tags to organize your Azure resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set specifies the tags that are assigned to the virtual machine. For more information about using tags, see [Using tags to organize your Azure resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     *
     * @param tags the tags value to set
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
