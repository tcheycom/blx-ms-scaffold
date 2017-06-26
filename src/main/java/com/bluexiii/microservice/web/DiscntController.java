package com.bluexiii.microservice.web;

import com.bluexiii.microservice.domain.TfFUserDiscnt;
import com.bluexiii.microservice.service.DiscntService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(value = "discnts", description = "资费信息")
@RequestMapping("/foo/bar/discnts")
public class DiscntController {
    @Autowired
    private DiscntService discntService;

    @ApiOperation(value = "按ITEM_ID查询资费", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TfFUserDiscnt findDiscntByItemId(@ApiParam(value = "资费ITEM_ID", required = true) @PathVariable Long id) {
        return discntService.findDiscntByItemId(id);
    }

    @ApiOperation(value = "按USER_ID查询资费", notes = "")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<TfFUserDiscnt> findDiscntsByUserId(@ApiParam(value = "用户ID", required = true) @RequestParam Long userId) {
        return discntService.findDiscntsByUserId(userId);
    }

    @ApiOperation(value = "按ITEM_ID修改资费", notes = "")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDiscntByItemId(@ApiParam(value = "资费ITEM_ID", required = true) @PathVariable Long id,
                                     @ApiParam(value = "资费") @RequestBody TfFUserDiscnt discnt) {
        discntService.updateDiscntByItemId(id, discnt);
    }
}
