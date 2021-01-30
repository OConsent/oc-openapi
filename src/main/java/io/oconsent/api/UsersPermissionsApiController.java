package io.oconsent.api;

import io.oconsent.model.Body1;
import io.oconsent.model.NewUsersPermissionsRole;
import io.oconsent.model.UsersPermissionsRole;
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
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")
@RestController
public class UsersPermissionsApiController implements UsersPermissionsApi {

    private static final Logger log = LoggerFactory.getLogger(UsersPermissionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersPermissionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<UsersPermissionsRole>> usersPermissionsRolesGet(@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results possible" ,schema=@Schema()) @Valid @RequestParam(value = "_limit", required = false) Integer _limit, @Parameter(in = ParameterIn.QUERY, description = "Sort according to a specific field." ,schema=@Schema()) @Valid @RequestParam(value = "_sort", required = false) String _sort, @Parameter(in = ParameterIn.QUERY, description = "Skip a specific number of entries (especially useful for pagination)" ,schema=@Schema()) @Valid @RequestParam(value = "_start", required = false) Integer _start, @Parameter(in = ParameterIn.QUERY, description = "Get entries that matches exactly your input" ,schema=@Schema()) @Valid @RequestParam(value = "&#x3D;", required = false)String , @Parameter(in = ParameterIn.QUERY, description = "Get records that are not equals to something" ,schema=@Schema()) @Valid @RequestParam(value = "_ne", required = false) String _ne, @Parameter(in = ParameterIn.QUERY, description = "Get record that are lower than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lt", required = false) String _lt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are lower than or equal to a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lte", required = false) String _lte, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gt", required = false) String _gt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than  or equal a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gte", required = false) String _gte, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains a value" ,schema=@Schema()) @Valid @RequestParam(value = "_contains", required = false) String _contains, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains (case sensitive) a value" ,schema=@Schema()) @Valid @RequestParam(value = "_containss", required = false) String _containss, @Parameter(in = ParameterIn.QUERY, description = "Get records that matches any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_in", required = false) List<String> _in, @Parameter(in = ParameterIn.QUERY, description = "Get records that doesn't match any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_nin", required = false) List<String> _nin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UsersPermissionsRole>>(objectMapper.readValue("[ {\n  \"permissions\" : [ {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  }, {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  } ],\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"type\",\n  \"users\" : [ {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  }, {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  } ]\n}, {\n  \"permissions\" : [ {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  }, {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  } ],\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"type\",\n  \"users\" : [ {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  }, {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UsersPermissionsRole>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UsersPermissionsRole>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsersPermissionsRole> usersPermissionsRolesIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsersPermissionsRole>(objectMapper.readValue("{\n  \"permissions\" : [ {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  }, {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  } ],\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"type\",\n  \"users\" : [ {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  }, {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  } ]\n}", UsersPermissionsRole.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsersPermissionsRole>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsersPermissionsRole>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsersPermissionsRole> usersPermissionsRolesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewUsersPermissionsRole body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsersPermissionsRole>(objectMapper.readValue("{\n  \"permissions\" : [ {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  }, {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  } ],\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"type\",\n  \"users\" : [ {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  }, {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  } ]\n}", UsersPermissionsRole.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsersPermissionsRole>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsersPermissionsRole>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body1> usersPermissionsRolesRoleDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("role") String role) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body1>(objectMapper.readValue("{\n  \"foo\" : \"foo\"\n}", Body1.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body1>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsersPermissionsRole> usersPermissionsRolesRolePut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("role") String role,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewUsersPermissionsRole body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsersPermissionsRole>(objectMapper.readValue("{\n  \"permissions\" : [ {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  }, {\n    \"controller\" : \"controller\",\n    \"role\" : \"role\",\n    \"updated_by\" : \"updated_by\",\n    \"action\" : \"action\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"enabled\" : true,\n    \"policy\" : \"policy\"\n  } ],\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"type\",\n  \"users\" : [ {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  }, {\n    \"resetPasswordToken\" : \"resetPasswordToken\",\n    \"password\" : \"password\",\n    \"role\" : \"role\",\n    \"blocked\" : true,\n    \"provider\" : \"provider\",\n    \"updated_by\" : \"updated_by\",\n    \"confirmationToken\" : \"confirmationToken\",\n    \"id\" : \"id\",\n    \"confirmed\" : true,\n    \"created_by\" : \"created_by\",\n    \"email\" : \"email\",\n    \"username\" : \"username\"\n  } ]\n}", UsersPermissionsRole.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsersPermissionsRole>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsersPermissionsRole>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UsersPermissionsUser>> usersPermissionsSearchIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Maximum number of results possible" ,schema=@Schema()) @Valid @RequestParam(value = "_limit", required = false) Integer _limit, @Parameter(in = ParameterIn.QUERY, description = "Sort according to a specific field." ,schema=@Schema()) @Valid @RequestParam(value = "_sort", required = false) String _sort, @Parameter(in = ParameterIn.QUERY, description = "Skip a specific number of entries (especially useful for pagination)" ,schema=@Schema()) @Valid @RequestParam(value = "_start", required = false) Integer _start, @Parameter(in = ParameterIn.QUERY, description = "Get entries that matches exactly your input" ,schema=@Schema()) @Valid @RequestParam(value = "&#x3D;", required = false)String , @Parameter(in = ParameterIn.QUERY, description = "Get records that are not equals to something" ,schema=@Schema()) @Valid @RequestParam(value = "_ne", required = false) String _ne, @Parameter(in = ParameterIn.QUERY, description = "Get record that are lower than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lt", required = false) String _lt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are lower than or equal to a value" ,schema=@Schema()) @Valid @RequestParam(value = "_lte", required = false) String _lte, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gt", required = false) String _gt, @Parameter(in = ParameterIn.QUERY, description = "Get records that are greater than  or equal a value" ,schema=@Schema()) @Valid @RequestParam(value = "_gte", required = false) String _gte, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains a value" ,schema=@Schema()) @Valid @RequestParam(value = "_contains", required = false) String _contains, @Parameter(in = ParameterIn.QUERY, description = "Get records that contains (case sensitive) a value" ,schema=@Schema()) @Valid @RequestParam(value = "_containss", required = false) String _containss, @Parameter(in = ParameterIn.QUERY, description = "Get records that matches any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_in", required = false) List<String> _in, @Parameter(in = ParameterIn.QUERY, description = "Get records that doesn't match any value in the array of values" ,schema=@Schema()) @Valid @RequestParam(value = "_nin", required = false) List<String> _nin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UsersPermissionsUser>>(objectMapper.readValue("[ {\n  \"role\" : {\n    \"permissions\" : [ \"permissions\", \"permissions\" ],\n    \"name\" : \"name\",\n    \"updated_by\" : \"updated_by\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"users\" : [ \"users\", \"users\" ]\n  },\n  \"blocked\" : false,\n  \"provider\" : \"provider\",\n  \"id\" : \"id\",\n  \"confirmed\" : false,\n  \"email\" : \"email\",\n  \"username\" : \"username\"\n}, {\n  \"role\" : {\n    \"permissions\" : [ \"permissions\", \"permissions\" ],\n    \"name\" : \"name\",\n    \"updated_by\" : \"updated_by\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"created_by\" : \"created_by\",\n    \"users\" : [ \"users\", \"users\" ]\n  },\n  \"blocked\" : false,\n  \"provider\" : \"provider\",\n  \"id\" : \"id\",\n  \"confirmed\" : false,\n  \"email\" : \"email\",\n  \"username\" : \"username\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UsersPermissionsUser>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UsersPermissionsUser>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
