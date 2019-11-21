// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/**
 * Additional parameters for a set of operations.
 */
@Fluent
public final class ModifiedAccessConditions {
    /*
     * Specify this header value to operate only on a blob if it has been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifModifiedSince;

    /*
     * Specify this header value to operate only on a blob if it has not been
     * modified since the specified date/time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifUnmodifiedSince;

    /*
     * Specify an ETag value to operate only on blobs with a matching value.
     */
    @JsonProperty(value = "")
    private String ifMatch;

    /*
     * Specify an ETag value to operate only on blobs without a matching value.
     */
    @JsonProperty(value = "")
    private String ifNoneMatch;

    /**
     * Get the ifModifiedSince property: Specify this header value to operate
     * only on a blob if it has been modified since the specified date/time.
     *
     * @return the ifModifiedSince value.
     */
    public OffsetDateTime getIfModifiedSince() {
        if (this.ifModifiedSince == null) {
            return null;
        }
        return this.ifModifiedSince.getDateTime();
    }

    /**
     * Set the ifModifiedSince property: Specify this header value to operate
     * only on a blob if it has been modified since the specified date/time.
     *
     * @param ifModifiedSince the ifModifiedSince value to set.
     * @return the ModifiedAccessConditions object itself.
     */
    public ModifiedAccessConditions setIfModifiedSince(OffsetDateTime ifModifiedSince) {
        if (ifModifiedSince == null) {
            this.ifModifiedSince = null;
        } else {
            this.ifModifiedSince = new DateTimeRfc1123(ifModifiedSince);
        }
        return this;
    }

    /**
     * Get the ifUnmodifiedSince property: Specify this header value to operate
     * only on a blob if it has not been modified since the specified
     * date/time.
     *
     * @return the ifUnmodifiedSince value.
     */
    public OffsetDateTime getIfUnmodifiedSince() {
        if (this.ifUnmodifiedSince == null) {
            return null;
        }
        return this.ifUnmodifiedSince.getDateTime();
    }

    /**
     * Set the ifUnmodifiedSince property: Specify this header value to operate
     * only on a blob if it has not been modified since the specified
     * date/time.
     *
     * @param ifUnmodifiedSince the ifUnmodifiedSince value to set.
     * @return the ModifiedAccessConditions object itself.
     */
    public ModifiedAccessConditions setIfUnmodifiedSince(OffsetDateTime ifUnmodifiedSince) {
        if (ifUnmodifiedSince == null) {
            this.ifUnmodifiedSince = null;
        } else {
            this.ifUnmodifiedSince = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return this;
    }

    /**
     * Get the ifMatch property: Specify an ETag value to operate only on blobs
     * with a matching value.
     *
     * @return the ifMatch value.
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * Set the ifMatch property: Specify an ETag value to operate only on blobs
     * with a matching value.
     *
     * @param ifMatch the ifMatch value to set.
     * @return the ModifiedAccessConditions object itself.
     */
    public ModifiedAccessConditions setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * Get the ifNoneMatch property: Specify an ETag value to operate only on
     * blobs without a matching value.
     *
     * @return the ifNoneMatch value.
     */
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * Set the ifNoneMatch property: Specify an ETag value to operate only on
     * blobs without a matching value.
     *
     * @param ifNoneMatch the ifNoneMatch value to set.
     * @return the ModifiedAccessConditions object itself.
     */
    public ModifiedAccessConditions setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}
