// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.AgentPoolUpgradeProfilePropertiesUpgradesItem;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AgentPoolUpgradeProfile model. */
@JsonFlatten
@Fluent
public class AgentPoolUpgradeProfileInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentPoolUpgradeProfileInner.class);

    /*
     * Id of the agent pool upgrade profile.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the agent pool upgrade profile.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the agent pool upgrade profile.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Kubernetes version (major, minor, patch).
     */
    @JsonProperty(value = "properties.kubernetesVersion", required = true)
    private String kubernetesVersion;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "properties.osType", required = true)
    private OSType osType;

    /*
     * List of orchestrator types and versions available for upgrade.
     */
    @JsonProperty(value = "properties.upgrades")
    private List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades;

    /**
     * Get the id property: Id of the agent pool upgrade profile.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the agent pool upgrade profile.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the agent pool upgrade profile.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the kubernetesVersion property: Kubernetes version (major, minor, patch).
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: Kubernetes version (major, minor, patch).
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the upgrades property: List of orchestrator types and versions available for upgrade.
     *
     * @return the upgrades value.
     */
    public List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the upgrades property: List of orchestrator types and versions available for upgrade.
     *
     * @param upgrades the upgrades value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withUpgrades(List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kubernetesVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kubernetesVersion in model AgentPoolUpgradeProfileInner"));
        }
        if (osType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property osType in model AgentPoolUpgradeProfileInner"));
        }
        if (upgrades() != null) {
            upgrades().forEach(e -> e.validate());
        }
    }
}
