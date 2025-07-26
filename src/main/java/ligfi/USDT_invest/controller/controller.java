package ligfi.USDT_invest.controller;

import ligfi.USDT_invest.model.UsdtDeposit;
import ligfi.USDT_invest.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private service depositService;
    @PostMapping("new earn")
    public void USDT_earn(@RequestBody UsdtDeposit deposit){
        depositService.createDeposit(deposit);
    }
}
