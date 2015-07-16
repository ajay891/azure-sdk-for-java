namespace Fixtures.MirrorSequences
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// A sample API that uses a petstore as an example to demonstrate
    /// features in the swagger-2.0 specification
    /// </summary>
    public partial interface ISequenceRequestResponseTest
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        Uri BaseUri { get; set; }

        /// <summary>
        /// Gets or sets json serialization settings.
        /// </summary>
        JsonSerializerSettings SerializationSettings { get; }

        /// <summary>
        /// Gets or sets json deserialization settings.
        /// </summary>
        JsonSerializerSettings DeserializationSettings { get; }        


        /// <summary>
        /// Creates a new pet in the store.  Duplicates are allowed
        /// </summary>
        /// <param name='pets'>
        /// Pets to add to the store
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>        
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IList<Pet>>> AddPetWithHttpMessagesAsync(IList<Pet> pets, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Adds new pet stylesin the store.  Duplicates are allowed
        /// </summary>
        /// <param name='petStyle'>
        /// Pet style to add to the store
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>        
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IList<int?>>> AddPetStylesWithHttpMessagesAsync(IList<int?> petStyle, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

        /// <summary>
        /// Updates new pet stylesin the store.  Duplicates are allowed
        /// </summary>
        /// <param name='petStyle'>
        /// Pet style to add to the store
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>        
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<HttpOperationResponse<IList<int?>>> UpdatePetStylesWithHttpMessagesAsync(IList<int?> petStyle, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));

    }
}
