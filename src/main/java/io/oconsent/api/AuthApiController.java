package io.oconsent.api;

import io.oconsent.model.Body2;
import io.oconsent.model.Body3;
import io.oconsent.model.Body4;
import io.oconsent.model.Body5;
import io.oconsent.model.NewUsersPermissionsUser;
import io.oconsent.model.UsersPermissionsUser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")
@RestController
public class AuthApiController implements AuthApi {

    private static final Logger log = LoggerFactory.getLogger(AuthApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Body4> authEmailConfirmationGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body4>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body4.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body4>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body4>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body3> authForgotPasswordPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body3 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body3>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body3.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body3>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body3>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body2> authLocalPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body2 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body2>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body2.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body2>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body2>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsersPermissionsUser> authLocalRegisterPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewUsersPermissionsUser body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsersPermissionsUser>(objectMapper.readValue("{\n  \"role\" : {\n    \"permissions\" : [ \"permissions\", \"permissions\" ],\n    \"name\" : \"name\",\n    \"updated_by\" : \"updated_by\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"users\" : [ \"users\", \"users\" ]\n  },\n  \"blocked\" : false,\n  \"provider\" : \"provider\",\n  \"id\" : \"id\",\n  \"confirmed\" : false,\n  \"email\" : \"email\",\n  \"username\" : \"username\"\n}", UsersPermissionsUser.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsersPermissionsUser>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsersPermissionsUser>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body2> authProviderCallbackGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("provider") String provider) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body2>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body2.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body2>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body2>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body4> authResetPasswordPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body4 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body4>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body4.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body4>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body4>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body5> authSendEmailConfirmationPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Body5 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body5>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body5.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body5>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body5>(HttpStatus.NOT_IMPLEMENTED);
    }

}
