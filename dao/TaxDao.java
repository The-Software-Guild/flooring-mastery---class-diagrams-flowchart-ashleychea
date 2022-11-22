package dao;

import dto.Tax;
import java.util.List;

public interface TaxDao {

    List<Tax> loadTaxRates() throws Exception;
}
