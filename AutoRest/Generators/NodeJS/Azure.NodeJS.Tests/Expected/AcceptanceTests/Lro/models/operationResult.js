/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the OperationResult class.
 * @constructor
 * @member {string} [status] The status of the request. Possible values for
 * this property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 * @member {object} [error]
 * 
 * @member {number} [error.code] The error code for an operation failure
 * 
 * @member {string} [error.message] The detailed arror message
 * 
 */
function OperationResult() {
}

/**
 * Defines the metadata of OperationResult
 *
 * @returns {object} metadata of OperationResult
 *
 */
OperationResult.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'OperationResult',
    type: {
      name: 'Composite',
      className: 'OperationResult',
      modelProperties: {
        status: {
          required: false,
          serializedName: 'status',
          type: {
            name: 'String'
          }
        },
        error: {
          required: false,
          serializedName: 'error',
          type: {
            name: 'Composite',
            className: 'OperationResultError'
          }
        }
      }
    }
  };
};

/**
 * Validate the payload against the OperationResult schema
 *
 * @param {JSON} payload
 *
 */
OperationResult.prototype.serialize = function () {
  var payload = {};
  if (this['status'] !== null && this['status'] !== undefined) {
    if (typeof this['status'].valueOf() !== 'string') {
      throw new Error('this[\'status\'] must be of type string.');
    }
    payload['status'] = this['status'];
  }

  if (this['error']) {
    payload['error'] = this['error'].serialize();
  }

  return payload;
};

/**
 * Deserialize the instance to OperationResult schema
 *
 * @param {JSON} instance
 *
 */
OperationResult.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['status'] !== undefined) {
      this['status'] = instance['status'];
    }

    if (instance['error']) {
      this['error'] = new models['OperationResultError']().deserialize(instance['error']);
    }
  }

  return this;
};

module.exports = OperationResult;
