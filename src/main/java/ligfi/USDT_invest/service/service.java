package ligfi.USDT_invest.service;

import ligfi.USDT_invest.model.UsdtDeposit;
import ligfi.USDT_invest.repository.UsdtDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private UsdtDepositRepository depositRepository;
    public void createDeposit(UsdtDeposit deposit){
        deposit.setFinal_sum(deposit.getDeposit()*(deposit.getPercent()/100)*((float) deposit.getDaysPassed() /365));
        depositRepository.save(deposit);
    }
}
