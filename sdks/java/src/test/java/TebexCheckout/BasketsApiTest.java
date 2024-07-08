/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package TebexCheckout;

import TebexCheckout.ApiException;
import org.openapitools.client.model.AddPackageRequest;
import org.openapitools.client.model.Basket;
import org.openapitools.client.model.CreateBasketRequest;
import org.openapitools.client.model.Sale;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BasketsApi
 */
@Disabled
public class BasketsApiTest {

    private final BasketsApi api = new BasketsApi();

    /**
     * Add a package to the basket
     *
     * This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPackageTest() throws ApiException {
        String ident = null;
        AddPackageRequest addPackageRequest = null;
        Basket response = api.addPackage(ident, addPackageRequest);
        // TODO: test validations
    }

    /**
     * Add a sale to the basket
     *
     * Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSaleToBasketTest() throws ApiException {
        String ident = null;
        Sale sale = null;
        Basket response = api.addSaleToBasket(ident, sale);
        // TODO: test validations
    }

    /**
     * Create a basket that can be used to pay for items
     *
     * This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBasketTest() throws ApiException {
        CreateBasketRequest createBasketRequest = null;
        Basket response = api.createBasket(createBasketRequest);
        // TODO: test validations
    }

    /**
     * Fetch a basket by its identifier
     *
     * Gets the basket associated with the provided identifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBasketByIdTest() throws ApiException {
        String ident = null;
        Basket response = api.getBasketById(ident);
        // TODO: test validations
    }

    /**
     * Remove a row from the basket
     *
     * This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRowFromBasketTest() throws ApiException {
        String ident = null;
        Integer rowsId = null;
        api.removeRowFromBasket(ident, rowsId);
        // TODO: test validations
    }

}
