package rs.edu.raf.si.bank2.main.repositories.mariadb;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.edu.raf.si.bank2.main.models.mariadb.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

    List<Option> findAllByStockSymbol(String symbol);

    List<Option> findAllByStockSymbolAndExpirationDate(String symbol, LocalDate expirationDate);
}
