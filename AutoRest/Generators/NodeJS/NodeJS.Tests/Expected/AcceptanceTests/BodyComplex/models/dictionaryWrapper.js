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

/**
 * @class
 * Initializes a new instance of the DictionaryWrapper class.
 * @constructor
 * @member {object} [defaultProgram]
 * 
 */
function DictionaryWrapper() {
}

/**
 * Defines the metadata of DictionaryWrapper
 *
 * @returns {object} metadata of DictionaryWrapper
 *
 */
DictionaryWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'dictionary-wrapper',
    type: {
      name: 'Composite',
      className: 'DictionaryWrapper',
      modelProperties: {
        defaultProgram: {
          required: false,
          serializedName: 'defaultProgram',
          type: {
            name: 'Dictionary',
            value: {
                required: false,
                serializedName: 'StringElementType',
                type: {
                  name: 'String'
                }
            }
          }
        }
      }
    }
  };
};

/**
 * Validate the payload against the DictionaryWrapper schema
 *
 * @param {JSON} payload
 *
 */
DictionaryWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['defaultProgram'] && typeof this['defaultProgram'] === 'object') {
    payload['defaultProgram'] = {};
    for(var valueElement in this['defaultProgram']) {
      if (this['defaultProgram'][valueElement] !== null && this['defaultProgram'][valueElement] !== undefined) {
        if (typeof this['defaultProgram'][valueElement].valueOf() !== 'string') {
          throw new Error('this[\'defaultProgram\'][valueElement] must be of type string.');
        }
        payload['defaultProgram'][valueElement] = this['defaultProgram'][valueElement];
      }
      else {
        payload['defaultProgram'][valueElement] = this['defaultProgram'][valueElement];
      }
    }
  }

  return payload;
};

/**
 * Deserialize the instance to DictionaryWrapper schema
 *
 * @param {JSON} instance
 *
 */
DictionaryWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['defaultProgram']) {
      this['defaultProgram'] = {};
      for(var valueElement1 in instance['defaultProgram']) {
        if (instance['defaultProgram'] !== null && instance['defaultProgram'] !== undefined) {
          if (instance['defaultProgram'][valueElement1] !== undefined) {
            this['defaultProgram'][valueElement1] = instance['defaultProgram'][valueElement1];
          }
        }
      }
    }
  }

  return this;
};

module.exports = DictionaryWrapper;
