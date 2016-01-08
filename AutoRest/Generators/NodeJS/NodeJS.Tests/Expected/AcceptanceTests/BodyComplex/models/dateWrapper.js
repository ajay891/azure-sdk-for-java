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
 * Initializes a new instance of the DateWrapper class.
 * @constructor
 * @member {date} [field]
 * 
 * @member {date} [leap]
 * 
 */
function DateWrapper() {
}

/**
 * Defines the metadata of DateWrapper
 *
 * @returns {object} metadata of DateWrapper
 *
 */
DateWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'date-wrapper',
    type: {
      name: 'Composite',
      className: 'DateWrapper',
      modelProperties: {
        field: {
          required: false,
          serializedName: 'field',
          type: {
            name: 'Date'
          }
        },
        leap: {
          required: false,
          serializedName: 'leap',
          type: {
            name: 'Date'
          }
        }
      }
    }
  };
};

/**
 * Validate the payload against the DateWrapper schema
 *
 * @param {JSON} payload
 *
 */
DateWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['field']) {
    if (!(this['field'] instanceof Date || typeof this['field'].valueOf() === 'string' && !isNaN(Date.parse(this['field'])))) {
      throw new Error('this[\'field\'] must be of type date.');
    }
    payload['field'] = (this['field'] instanceof Date) ? this['field'].toISOString().substring(0,10) : this['field'];
  }

  if (this['leap']) {
    if (!(this['leap'] instanceof Date || typeof this['leap'].valueOf() === 'string' && !isNaN(Date.parse(this['leap'])))) {
      throw new Error('this[\'leap\'] must be of type date.');
    }
    payload['leap'] = (this['leap'] instanceof Date) ? this['leap'].toISOString().substring(0,10) : this['leap'];
  }

  return payload;
};

/**
 * Deserialize the instance to DateWrapper schema
 *
 * @param {JSON} instance
 *
 */
DateWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['field']) {
      this['field'] = new Date(instance['field']);
    }
    else if (instance['field'] !== undefined) {
      this['field'] = instance['field'];
    }

    if (instance['leap']) {
      this['leap'] = new Date(instance['leap']);
    }
    else if (instance['leap'] !== undefined) {
      this['leap'] = instance['leap'];
    }
  }

  return this;
};

module.exports = DateWrapper;
