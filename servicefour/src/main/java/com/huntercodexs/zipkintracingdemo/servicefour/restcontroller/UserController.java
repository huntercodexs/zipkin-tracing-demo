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
        System.out.println("ServiceFour - zipkinFlowStart && Finish");
        LOG.info("ServiceFour - zipkinFlowStart && Finish");
        return zipkinFlowService.start();
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceFour - zipkinFlowFinish");
        LOG.info("ServiceFour - zipkinFlowFinish");
        return ResponseEntity.ok().body("ServiceFour - zipkinFlowFinish");
    }

}
