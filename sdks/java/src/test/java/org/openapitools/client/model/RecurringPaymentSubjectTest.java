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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.PaymentSubject;
import org.openapitools.client.model.RecurringPaymentSubjectPrice;
import org.openapitools.client.model.RecurringPaymentSubjectStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for RecurringPaymentSubject
 */
public class RecurringPaymentSubjectTest {
    private final RecurringPaymentSubject model = new RecurringPaymentSubject();

    /**
     * Model tests for RecurringPaymentSubject
     */
    @Test
    public void testRecurringPaymentSubject() {
        // TODO: test RecurringPaymentSubject
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'pausedAt'
     */
    @Test
    public void pausedAtTest() {
        // TODO: test pausedAt
    }

    /**
     * Test the property 'pausedUntil'
     */
    @Test
    public void pausedUntilTest() {
        // TODO: test pausedUntil
    }

    /**
     * Test the property 'nextPaymentAt'
     */
    @Test
    public void nextPaymentAtTest() {
        // TODO: test nextPaymentAt
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'initialPayment'
     */
    @Test
    public void initialPaymentTest() {
        // TODO: test initialPayment
    }

    /**
     * Test the property 'lastPayment'
     */
    @Test
    public void lastPaymentTest() {
        // TODO: test lastPayment
    }

    /**
     * Test the property 'failCount'
     */
    @Test
    public void failCountTest() {
        // TODO: test failCount
    }

    /**
     * Test the property 'price'
     */
    @Test
    public void priceTest() {
        // TODO: test price
    }

    /**
     * Test the property 'cancelledAt'
     */
    @Test
    public void cancelledAtTest() {
        // TODO: test cancelledAt
    }

    /**
     * Test the property 'cancelReason'
     */
    @Test
    public void cancelReasonTest() {
        // TODO: test cancelReason
    }

}