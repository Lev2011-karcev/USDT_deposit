package ligfi.USDT_invest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "usdt_deposit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsdtDeposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "percent")
    private float percent;

    @Column(name = "deposit sum")
    private float deposit;

    @Column(name = "wallet adress")
    private String wallet;

    @Column(name = "final_sum")
    private float final_sum;// deposit * percent/100 * days/365

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "days passed")
    private Integer daysPassed;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        daysPassed = 0;
    }
}
