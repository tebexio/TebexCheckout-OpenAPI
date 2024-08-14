# coding: utf-8

"""
    Tebex Checkout API

    The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

    The version of the OpenAPI document: 1.1.2
    Contact: tebex-integrations@overwolf.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from TebexCheckout.models.payment_subject import PaymentSubject

class TestPaymentSubject(unittest.TestCase):
    """PaymentSubject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PaymentSubject:
        """Test PaymentSubject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PaymentSubject`
        """
        model = PaymentSubject()
        if include_optional:
            return PaymentSubject(
                transaction_id = 'tbx-40514024a64636-f9a1ea',
                status = TebexCheckout.models.payment_status.Payment_status(
                    id = 1, 
                    description = 'Complete', ),
                payment_sequence = 'recurring',
                created_at = '2024-05-20T17:57:16Z',
                price = TebexCheckout.models.payment_subject_price.PaymentSubject_price(
                    amount = 0, 
                    currency = 'USD', ),
                price_paid = TebexCheckout.models.payment_subject_price.PaymentSubject_price(
                    amount = 0, 
                    currency = 'USD', ),
                payment_method = TebexCheckout.models.payment_subject_payment_method.PaymentSubject_payment_method(
                    name = 'Free: No Payment Required', 
                    refundable = False, ),
                fees = TebexCheckout.models.payment_subject_fees.PaymentSubject_fees(
                    tax = TebexCheckout.models.payment_subject_price.PaymentSubject_price(
                        amount = 0, 
                        currency = 'USD', ), 
                    gateway = TebexCheckout.models.payment_subject_price.PaymentSubject_price(
                        amount = 0, 
                        currency = 'USD', ), ),
                customer = TebexCheckout.models.payment_subject_customer.PaymentSubject_customer(
                    first_name = 'Ted', 
                    last_name = 'Tebex', 
                    email = 'tebex-integrations@overwolf.com', 
                    ip = '127.0.0.1', 
                    username = '', 
                    marketing_consent = False, 
                    country = 'US', 
                    postal_code = '', ),
                products = [
                    TebexCheckout.models.payment_subject_products_inner.PaymentSubject_products_inner(
                        id = 127, 
                        name = '100 Gold', 
                        quantity = 1, 
                        base_price = TebexCheckout.models.payment_subject_price.PaymentSubject_price(
                            amount = 0, 
                            currency = 'USD', ), 
                        paid_price = TebexCheckout.models.payment_fees_tax.Payment_fees_tax(
                            amount = 0.0, 
                            currency = 'USD', ), 
                        variables = [
                            None
                            ], 
                        expires_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        custom = TebexCheckout.models.custom.custom(), 
                        username = '', )
                    ],
                coupons = [
                    TebexCheckout.models.coupon.Coupon()
                    ],
                gift_cards = [
                    TebexCheckout.models.gift_card.GiftCard()
                    ],
                recurring_payment_reference = 'tbx-r-713419703',
                custom = None,
                revenue_share = [
                    TebexCheckout.models.revenue_share.RevenueShare(
                        wallet_ref = 'centralised_404244_127', 
                        amount = 0.5, 
                        gateway_fee_percent = 50.0, )
                    ],
                decline_reason = ''
            )
        else:
            return PaymentSubject(
        )
        """

    def testPaymentSubject(self):
        """Test PaymentSubject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
