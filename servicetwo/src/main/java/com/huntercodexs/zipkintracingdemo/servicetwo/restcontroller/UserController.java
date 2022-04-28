package com.huntercodexs.zipkintracingdemo.servicetwo.restcontroller;

import com.huntercodexs.zipkintracingdemo.servicetwo.service.ZipkinFlowService;
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
        System.out.println("ServiceTwo Two - zipkinFlowStart");
        LOG.info("ServiceTwo Two - zipkinFlowStart");
        zipkinFlowService.start();
        return ResponseEntity.ok().body("ServiceTwo Two - zipkinFlowStart");
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceTwo Two - zipkinFlowFinish");
        LOG.info("ServiceTwo Two - zipkinFlowFinish");
        zipkinFlowService.finish();
        return ResponseEntity.ok().body("ServiceTwo Two - zipkinFlowFinish");
    }

}
