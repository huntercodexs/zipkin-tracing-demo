package com.huntercodexs.zipkintracingdemo.serviceone.restcontroller;

import com.huntercodexs.zipkintracingdemo.serviceone.service.ZipkinFlowService;
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
        System.out.println("ServiceOne One - zipkinFlowStart");
        LOG.info("ServiceOne One - zipkinFlowStart");
        zipkinFlowService.start();
        return ResponseEntity.ok().body("ServiceOne One - zipkinFlowStart");
    }

    /**
     * Zipkin Flow Finish
     */
    @GetMapping(path = "/zipkin-flow/finish")
    public ResponseEntity<?> finish() {
        System.out.println("ServiceOne One - zipkinFlowFinish");
        LOG.info("ServiceOne One - zipkinFlowFinish");
        return ResponseEntity.ok().body("ServiceOne One - zipkinFlowFinish");
    }

}
