// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/**
 * Defines headers for GetProperties operation.
 */
@Fluent
public final class FileSystemGetPropertiesHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * An HTTP entity tag associated with the filesystem.  Changes to
     * filesystem properties affect the entity tag, but operations on files and
     * directories do not.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The data and time the filesystem was last modified.  Changes to
     * filesystem properties update the last modified time, but operations on
     * files and directories do not.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * The user-defined properties associated with the filesystem.  A
     * comma-separated list of name and value pairs in the format "n1=v1,
     * n2=v2, ...", where each value is a base64 encoded string. Note that the
     * string may only contain ASCII characters in the ISO-8859-1 character
     * set.
     */
    @JsonProperty(value = "x-ms-properties")
    private String properties;

    /*
     * A bool string indicates whether the namespace feature is enabled. If
     * "true", the namespace is enabled for the filesystem.
     */
    @JsonProperty(value = "x-ms-namespace-enabled")
    private String namespaceEnabled;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the eTag property: An HTTP entity tag associated with the
     * filesystem.  Changes to filesystem properties affect the entity tag, but
     * operations on files and directories do not.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the
     * filesystem.  Changes to filesystem properties affect the entity tag, but
     * operations on files and directories do not.
     *
     * @param eTag the eTag value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the filesystem was last
     * modified.  Changes to filesystem properties update the last modified
     * time, but operations on files and directories do not.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The data and time the filesystem was last
     * modified.  Changes to filesystem properties update the last modified
     * time, but operations on files and directories do not.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the properties property: The user-defined properties associated with
     * the filesystem.  A comma-separated list of name and value pairs in the
     * format "n1=v1, n2=v2, ...", where each value is a base64 encoded string.
     * Note that the string may only contain ASCII characters in the ISO-8859-1
     * character set.
     *
     * @return the properties value.
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The user-defined properties associated with
     * the filesystem.  A comma-separated list of name and value pairs in the
     * format "n1=v1, n2=v2, ...", where each value is a base64 encoded string.
     * Note that the string may only contain ASCII characters in the ISO-8859-1
     * character set.
     *
     * @param properties the properties value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the namespaceEnabled property: A bool string indicates whether the
     * namespace feature is enabled. If "true", the namespace is enabled for
     * the filesystem.
     *
     * @return the namespaceEnabled value.
     */
    public String getNamespaceEnabled() {
        return this.namespaceEnabled;
    }

    /**
     * Set the namespaceEnabled property: A bool string indicates whether the
     * namespace feature is enabled. If "true", the namespace is enabled for
     * the filesystem.
     *
     * @param namespaceEnabled the namespaceEnabled value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setNamespaceEnabled(String namespaceEnabled) {
        this.namespaceEnabled = namespaceEnabled;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the FileSystemGetPropertiesHeaders object itself.
     */
    public FileSystemGetPropertiesHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
