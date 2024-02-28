package com.nayoon.payment_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "purchaseClient", url = "${feign.purchaseClient.url}")
public interface PurchaseClient {

  /**
   * 주문 삭제 요청
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/internal/purchases", consumes = "application/json")
  void delete(@RequestParam(name = "id") Long purchaseId);

}
