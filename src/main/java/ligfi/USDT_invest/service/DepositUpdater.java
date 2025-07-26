package ligfi.USDT_invest.service;

import ligfi.USDT_invest.model.UsdtDeposit;
import ligfi.USDT_invest.repository.UsdtDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class DepositUpdater {

    @Autowired
    private UsdtDepositRepository depositRepository;

    @Scheduled(cron = "0 0 0 * * *") // каждый день в полночь
    public void updateDepositDays() {
        List<UsdtDeposit> deposits = depositRepository.findAll();
        for (UsdtDeposit deposit : deposits) {
            long daysPassed = ChronoUnit.DAYS.between(deposit.getCreatedAt(), LocalDateTime.now());
            deposit.setDaysPassed((int) daysPassed);
            depositRepository.save(deposit);
        }
    }
}

