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

from TebexCheckout.models.basket import Basket

class TestBasket(unittest.TestCase):
    """Basket unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Basket:
        """Test Basket
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Basket`
        """
        model = Basket()
        if include_optional:
            return Basket(
                ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3',
                expire = '2022-10-25 15:15:40',
                price = 1.27,
                price_details = {"fullPrice":1.4,"subTotal":1.27,"discounts":[],"total":1.4,"surcharges":[],"tax":0.13,"balance":0,"sales":[],"giftcards":[],"roundUp":null},
                is_payment_method_update = False,
                return_url = '',
                complete = False,
                tax = 1.337,
                username = '',
                discounts = [
                    TebexCheckout.models.discount.Discount()
                    ],
                coupons = [
                    TebexCheckout.models.coupon.Coupon()
                    ],
                giftcards = [
                    TebexCheckout.models.gift_card.GiftCard()
                    ],
                address = {"name":"Ted Tebex","first_name":"Ted","last_name":"Tebex","address":"37 Broadhurst Gardens, London, United Kingdom, NW6 3QT","email":"example@tebex.io","state_id":null,"country":"UK","postal_code":"NW6 3QT"},
                rows = [
                    TebexCheckout.models.basket_row.BasketRow(
                        id = 173125385, 
                        basket = 725572301, 
                        package = 56, 
                        override = 0, 
                        quantity = 2, 
                        server = 56, 
                        price = 1.27, 
                        gift_username_id = 56, 
                        options = TebexCheckout.models.options.options(), 
                        recurring = False, 
                        recurring_period = '', 
                        recurring_next_payment_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        meta = TebexCheckout.models.basket_row_meta.BasketRow_meta(
                            name = '1000 Gold', 
                            rowprice = 2.54, 
                            initialprice = 1.27, 
                            is_cumulative = False, 
                            required_packages = [], 
                            requires_any = False, 
                            category = False, 
                            produces_gift_card = False, 
                            allows_gift_cards = True, 
                            servers = [], 
                            limits = TebexCheckout.models.basket_row_meta_limits.BasketRow_meta_limits(
                                user = TebexCheckout.models.basket_row_meta_limits_user.BasketRow_meta_limits_user(
                                    enabled = False, 
                                    timestamp = 0, 
                                    limit = False, ), 
                                global = TebexCheckout.models.basket_row_meta_limits_user.BasketRow_meta_limits_user(
                                    enabled = False, 
                                    timestamp = 0, 
                                    limit = False, ), 
                                package_expiry_time = 0, ), 
                            has_deliverables = False, 
                            deliverable_types = [], 
                            download_link = '', 
                            has_seller_protection = True, 
                            item_type = '', 
                            revenue_share = [], 
                            image = '', 
                            realprice = 1.27, ), 
                        custom = TebexCheckout.models.custom.custom(), 
                        image_url = '', 
                        recurring_price = 1.337, )
                    ],
                fingerprint = '',
                creator_code = '',
                roundup = False,
                cancel_url = 'https://tebex.io',
                complete_url = '',
                complete_auto_redirect = False,
                custom = {"foo":"bar","ref":1234},
                links = TebexCheckout.models.basket_links.BasketLinks(
                    payment = 'https://checkout.tebex.io/api/payments/tbx-12345', 
                    checkout = 'https://checkout.tebex.io/checkout/1a-55fff4107740a1f40d844ff89607557f45bfafb3', )
            )
        else:
            return Basket(
        )
        """

    def testBasket(self):
        """Test Basket"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
