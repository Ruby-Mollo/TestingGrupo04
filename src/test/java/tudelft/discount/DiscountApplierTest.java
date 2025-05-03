package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    // Test 1: Producto homr debe recibir 10% de descuento
    @Test
    public void testHomeCategoryGets10PercentDiscount() {
        Product homeProduct = new Product("Lamp", 100.0, "HOME");
        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
    }

    // Test 2: Producto BUSINESS debe recibir 10% de aumento
    @Test
    public void testBusinessCategoryGets10PercentIncrease() {
        Product businessProduct = new Product("Printer", 200.0, "BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }

    // Test 3: Producto de otra categoría no cambia su precio
    @Test
    public void testOtherCategoryNoChange() {
        Product otherProduct = new Product("Toy", 50.0, "TOYS");
        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(otherProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(50.0, otherProduct.getPrice(), 0.001);
    }

    // Test 4: Lista mixta de productos
    @Test
    public void testMixedProducts() {
        Product home = new Product("Sofa", 100.0, "HOME");
        Product business = new Product("Desk", 100.0, "BUSINESS");
        Product other = new Product("Ball", 100.0, "SPORT");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(home, business, other));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, home.getPrice(), 0.001);     // 10% menos
        assertEquals(110.0, business.getPrice(), 0.001); // 10% más
        assertEquals(100.0, other.getPrice(), 0.001);    // sin cambio
    }
}
