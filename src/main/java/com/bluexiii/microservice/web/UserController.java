package com.bluexiii.microservice.web;

import com.bluexiii.microservice.domain.TfFUser;
import com.bluexiii.microservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "users", description = "用户信息")
@RequestMapping("/foo/bar/users")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "按号码查询用户", notes = "")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public TfFUser findUserByNumber(@ApiParam(value = "号码", required = true) @RequestParam String serialNumber) {
        return userService.findUserBySerialNumber(serialNumber);
    }

    @ApiOperation(value = "按ID查询用户", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TfFUser findUserById(@ApiParam(value = "用户编码", required = true) @PathVariable Long id) {
        return userService.findUserById(id);
    }
}
