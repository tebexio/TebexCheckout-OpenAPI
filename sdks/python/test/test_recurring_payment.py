# coding: utf-8

"""
    Tebex Checkout API

    The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

    The version of the OpenAPI document: 1.1.0
    Contact: tebex-integrations@overwolf.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from TebexCheckout.models.recurring_payment import RecurringPayment

class TestRecurringPayment(unittest.TestCase):
    """RecurringPayment unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RecurringPayment:
        """Test RecurringPayment
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RecurringPayment`
        """
        model = RecurringPayment()
        if include_optional:
            return RecurringPayment(
                id = 5000,
                created_at = '2022-12-16T16:43:06Z',
                updated_at = '2022-12-16T16:43:06Z',
                paused_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                paused_until = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                next_payment_date = '2022-12-30T16:43:06',
                reference = '88',
                account_id = 1,
                interval = 'P2W',
                cancelled_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                cancellation_requested_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                status = TebexCheckout.models.recurring_payment_status.RecurringPayment_status(
                    id = 2, 
                    class = 'success', 
                    description = 'Active', 
                    active = 1, ),
                amount = TebexCheckout.models.recurring_payment_amount.RecurringPayment_amount(
                    amount = 7, 
                    tax = 1.4, 
                    period = 'P2W', ),
                cancel_reason = '',
                links = TebexCheckout.models.recurring_payment_links.RecurringPayment_links(
                    initial_payment = 'https://checkout.tebex.io/api/payments/tbx-123123aabccd123-bf71ad?type=txn_id', 
                    payment_history = [
                        'https://checkout.tebex.io/api/payments/tbx-123123aabccd123-bf71ad?type=txn_id'
                        ], )
            )
        else:
            return RecurringPayment(
        )
        """

    def testRecurringPayment(self):
        """Test RecurringPayment"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
