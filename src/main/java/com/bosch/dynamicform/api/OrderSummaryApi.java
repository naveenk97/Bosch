package com.bosch.dynamicform.api;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/api/v1/order")
@CrossOrigin
@RestController
public interface OrderSummaryApi {
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK. Fetch Order Summary", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = String.class)
    })
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {
            MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    // @PreAuthorize("permitAll")
    public ResponseEntity<String> fetchOrderSummary(@PathVariable String orderId);

}
