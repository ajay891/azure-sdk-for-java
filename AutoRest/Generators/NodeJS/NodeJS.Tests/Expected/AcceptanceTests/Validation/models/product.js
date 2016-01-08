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

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * The product documentation.
 * @member {array} [displayNames] Non required array of unique items from 0 to
 * 6 elements.
 * 
 * @member {number} [capacity] Non required int betwen 0 and 100 exclusive.
 * 
 * @member {string} [image] Image URL representing the product.
 * 
 */
function Product() {
}

/**
 * Defines the metadata of Product
 *
 * @returns {object} metadata of Product
 *
 */
Product.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'Product',
    type: {
      name: 'Composite',
      className: 'Product',
      modelProperties: {
        displayNames: {
          required: false,
          serializedName: 'display_names',
          constraints: {
            MaxItems: 6,
            MinItems: 0,
            UniqueItems: true
          },
          type: {
            name: 'Sequence',
            element: {
                required: false,
                serializedName: 'StringElementType',
                type: {
                  name: 'String'
                }
            }
          }
        },
        capacity: {
          required: false,
          serializedName: 'capacity',
          constraints: {
            ExclusiveMaximum: 100,
            ExclusiveMinimum: 0
          },
          type: {
            name: 'Number'
          }
        },
        image: {
          required: false,
          serializedName: 'image',
          constraints: {
            Pattern: 'http://\w+'
          },
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

/**
 * Validate the payload against the Product schema
 *
 * @param {JSON} payload
 *
 */
Product.prototype.serialize = function () {
  var payload = {};
  if (util.isArray(this['displayNames'])) {
    if (this['displayNames'].length > 6)
    {
      throw new Error('"this[\'displayNames\']" should satisfy the constraint - "MaxItems": 6');
    }
    if (this['displayNames'].length < 0)
    {
      throw new Error('"this[\'displayNames\']" should satisfy the constraint - "MinItems": 0');
    }
    if (this['displayNames'].length !== this['displayNames'].filter(function(item, i, ar) { return ar.indexOf(item) === i; }).length)
    {
      throw new Error('"this[\'displayNames\']" should satisfy the constraint - "UniqueItems"');
    }
    payload['display_names'] = [];
    for (var i = 0; i < this['displayNames'].length; i++) {
      if (this['displayNames'][i] !== null && this['displayNames'][i] !== undefined) {
        if (typeof this['displayNames'][i].valueOf() !== 'string') {
          throw new Error('this[\'displayNames\'][i] must be of type string.');
        }
        payload['display_names'][i] = this['displayNames'][i];
      }
    }
  }

  if (this['capacity'] !== null && this['capacity'] !== undefined) {
    if (typeof this['capacity'] !== 'number') {
      throw new Error('this[\'capacity\'] must be of type number.');
    }
    if (this['capacity'] >= 100)
    {
      throw new Error('"this[\'capacity\']" should satisfy the constraint - "ExclusiveMaximum": 100');
    }
    if (this['capacity'] <= 0)
    {
      throw new Error('"this[\'capacity\']" should satisfy the constraint - "ExclusiveMinimum": 0');
    }
    payload['capacity'] = this['capacity'];
  }

  if (this['image'] !== null && this['image'] !== undefined) {
    if (typeof this['image'].valueOf() !== 'string') {
      throw new Error('this[\'image\'] must be of type string.');
    }
    if (this['image'].match(/http:\/\/\w+/) === null)
    {
      throw new Error('"this[\'image\']" should satisfy the constraint - "Pattern": /http:\/\/\w+/');
    }
    payload['image'] = this['image'];
  }

  return payload;
};

/**
 * Deserialize the instance to Product schema
 *
 * @param {JSON} instance
 *
 */
Product.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['display_names']) {
      var tempInstancedisplayNames = [];
      instance['display_names'].forEach(function(element) {
        if (element !== undefined) {
          element = element;
        }
        tempInstancedisplayNames.push(element);
      });
      this['displayNames'] = tempInstancedisplayNames;
    }

    if (instance['capacity'] !== undefined) {
      this['capacity'] = instance['capacity'];
    }

    if (instance['image'] !== undefined) {
      this['image'] = instance['image'];
    }
  }

  return this;
};

module.exports = Product;
