/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.oconsent.api;

import io.oconsent.model.Error;
import io.oconsent.model.InlineResponse200;
import io.oconsent.model.NewOcDatasetTypes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")
public interface OcDatasetTypesApi {

    @Operation(summary = "", description = "Retrieve the numver of oc-dataset-types documents", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Retrieve oc-dataset-types document(s)", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types/count",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> ocDatasetTypesCountGet();


    @Operation(summary = "", description = "Find all the oc-dataset-types's records", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Retrieve oc-dataset-types document(s)", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> ocDatasetTypesGet(@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results possible" ,schema=@Schema()) @Valid @RequestParam(value = "_limit", required = false) Integer _limit, @Parameter(in = ParameterIn.QUERY, description = "Sort according to a specific field." ,schema=@Schema()) @Valid @RequestParam(value = "_sort", required = false) String _sort, @Parameter(in = ParameterIn.QUERY, description = "Skip a specific number of entries (especially useful for pagination)" ,schema=@Schema()) @Valid @RequestParam(value = "_start", required = false) Integer _start, @Parameter(in = ParameterIn.QUERY, description = "Get entries that matches exactly your input" ,schema=@Schema()) @Valid @RequestParam(value = "&#x3D;", required = false) String , @Parameter(in = ParameterIn.QUERY, description = "Get records that are not equals to something" ,schema=@Schema()) @Valid @RequestParam(value = "_ne", required = false) String _ne, @Parameter(in = ParameterIn.QUERY, description = "Get record that are lower than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lt", required = false) String _lt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are lower than or equal to a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lte", required = false) String _lte, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gt", required = false) String _gt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than  or equal a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gte", required = false) String _gte, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains a value" ,schema=@Schema()) @Valid @RequestParam(value = "_contains", required = false) String _contains, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains (case sensitive) a value" ,schema=@Schema()) @Valid @RequestParam(value = "_containss", required = false) String _containss, @Parameter(in = ParameterIn.QUERY, description = "Get records that matches any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_in", required = false) List<String> _in, @Parameter(in = ParameterIn.QUERY, description = "Get records that doesn't match any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_nin", required = false) List<String> _nin);


    @Operation(summary = "", description = "Delete a single oc-dataset-types record", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "deletes a single oc-dataset-types based on the ID supplied", content = @Content(schema = @Schema(implementation = Long.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Long> ocDatasetTypesIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "", description = "Find one oc-dataset-types record", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Retrieve oc-dataset-types document(s)", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> ocDatasetTypesIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "", description = "Update a single oc-dataset-types record", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Retrieve oc-dataset-types document(s)", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200> ocDatasetTypesIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewOcDatasetTypes body);


    @Operation(summary = "", description = "Create a new oc-dataset-types record", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Oc-dataset-types" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Retrieve oc-dataset-types document(s)", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/oc-dataset-types",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> ocDatasetTypesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewOcDatasetTypes body);

}

