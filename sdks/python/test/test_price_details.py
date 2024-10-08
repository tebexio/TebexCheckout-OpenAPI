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

from TebexCheckout.models.price_details import PriceDetails

class TestPriceDetails(unittest.TestCase):
    """PriceDetails unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PriceDetails:
        """Test PriceDetails
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PriceDetails`
        """
        model = PriceDetails()
        if include_optional:
            return PriceDetails(
                full_price = 1.337,
                sub_total = 1.337,
                discounts = [
                    None
                    ],
                total = 1.337,
                tax = 1.337,
                balance = 1.337,
                sales = [
                    TebexCheckout.models.sale.Sale(
                        name = 'Test Sale', 
                        discount_type = 'amount', 
                        amount = 4.99, )
                    ],
                giftcards = [
                    TebexCheckout.models.gift_card.GiftCard()
                    ],
                recurring = True,
                username = '',
                round_up = 1.337
            )
        else:
            return PriceDetails(
        )
        """

    def testPriceDetails(self):
        """Test PriceDetails"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
