package ligfi.USDT_invest.repository;

import ligfi.USDT_invest.model.UsdtDeposit;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsdtDepositRepository extends JpaRepository<UsdtDeposit, Long> {
}

