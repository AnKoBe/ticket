package cn.go.buy.ticket.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/TicketController")
@Api(value = "API - TicketController", description = "测试接口")
public class TicketController {


    @ApiOperation(value = "测试")
    @GetMapping("/test")
    public String test() {

        return "halo";
    }
}
