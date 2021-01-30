/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.oconsent.api;

import io.oconsent.model.Error;
import io.oconsent.model.Body2;
import io.oconsent.model.Body3;
import io.oconsent.model.Body4;
import io.oconsent.model.Body5;
import io.oconsent.model.NewUsersPermissionsUser;
import io.oconsent.model.UsersPermissionsUser;
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

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")
public interface AuthApi {

    @Operation(summary = "", description = "Validate a user account", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body4.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/email-confirmation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Body4> authEmailConfirmationGet();


    @Operation(summary = "", description = "Send the reset password email link", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body3.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/forgot-password",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Body3> authForgotPasswordPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body3 body);


    @Operation(summary = "", description = "Login a user using the identifiers email and password", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body2.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/local",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Body2> authLocalPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body2 body);


    @Operation(summary = "", description = "Register a new user with the default role", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = UsersPermissionsUser.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/local/register",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<UsersPermissionsUser> authLocalRegisterPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewUsersPermissionsUser body);


    @Operation(summary = "", description = "Successfull redirection after approving a provider", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body2.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/{provider}/callback",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Body2> authProviderCallbackGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("provider") String provider);


    @Operation(summary = "", description = "Reset user password with a code (resetToken)", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body4.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/reset-password",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Body4> authResetPasswordPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body4 body);


    @Operation(summary = "", description = "Send a confirmation email to user", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "UsersPermissions - User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "response", content = @Content(schema = @Schema(implementation = Body5.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/auth/send-email-confirmation",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Body5> authSendEmailConfirmationPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body5 body);

}

