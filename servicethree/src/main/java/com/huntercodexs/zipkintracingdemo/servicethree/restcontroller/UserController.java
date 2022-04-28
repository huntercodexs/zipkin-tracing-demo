package com.huntercodexs.zipkintracingdemo.servicethree.restcontroller;

import com.huntercodexs.zipkintracingdemo.servicethree.service.ZipkinFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@ControllerAdvice
@RestController
@RequestMapping("${api.prefix}")
@CrossOrigin(origins = "*")
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @Autowired
    ZipkinFlowService zipkinFlowService;

    /**
     * Zipkin Flow Start
     */
    @GetMapping(path = "/zipkin-flow/start")
    public ResponseEntity<?> start() {
        System.out.println("ServiceThree Three - zipkinFlowStart");
        LOG.info("ServiceThree Three - zipkinFlowStart");
        zipkinFlowService.start();
        return ResponseEntity.ok().body("ServiceThree Three - zipkinFlowStart");
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceThree Three - zipkinFlowFinish");
        LOG.info("ServiceThree Three - zipkinFlowFinish");
        zipkinFlowService.finish();
        return ResponseEntity.ok().body("ServiceThree Three - zipkinFlowFinish");
    }

}
