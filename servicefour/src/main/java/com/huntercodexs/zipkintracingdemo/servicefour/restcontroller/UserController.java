package com.huntercodexs.zipkintracingdemo.servicefour.restcontroller;

import com.huntercodexs.zipkintracingdemo.servicefour.service.ZipkinFlowService;
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
        System.out.println("ServiceFour Four - zipkinFlowStart");
        LOG.info("ServiceFour Four - zipkinFlowStart");
        zipkinFlowService.start();
        return ResponseEntity.ok().body("ServiceFour Four - zipkinFlowStart");
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceFour Four - zipkinFlowFinish");
        LOG.info("ServiceFour Four - zipkinFlowFinish");
        return ResponseEntity.ok().body("ServiceFour Four - zipkinFlowFinish");
    }

}
