package tudelft.invoicemocked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        Invoice mauricio = new Invoice("Mauricio", 20.0);
        Invoice arie = new Invoice("Arie", 300.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);

        List<Invoice> results = Arrays.asList(mauricio, arie);
        Mockito.when(dao.all()).thenReturn(results);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());
    }

    // Test: todas las facturas tienen valores < 100.
    @Test
    void filterInvoices_allBelowThreshold_returnsAll() {
        Invoice one = new Invoice("One", 10.0);
        Invoice two = new Invoice("Two", 50.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(one, two));

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.contains(one));
        Assertions.assertTrue(result.contains(two));
    }

    // Test: la lista de facturas está vacía.
    @Test
    void filterInvoices_emptyList_returnsEmpty() {
        InvoiceDao dao = Mockito.mock(InvoiceDao.class);
        Mockito.when(dao.all()).thenReturn(Collections.emptyList());

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        Assertions.assertTrue(result.isEmpty());
    }

}
