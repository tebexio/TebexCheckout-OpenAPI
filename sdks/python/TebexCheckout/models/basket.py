# coding: utf-8

"""
    Tebex Checkout API

    The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

    The version of the OpenAPI document: 1.0.0
    Contact: tebex-integrations@overwolf.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from TebexCheckout.models.address import Address
from TebexCheckout.models.basket_item import BasketItem
from TebexCheckout.models.basket_links import BasketLinks
from TebexCheckout.models.price_details import PriceDetails
from typing import Optional, Set
from typing_extensions import Self

class Basket(BaseModel):
    """
    Basket
    """ # noqa: E501
    ident: Optional[StrictStr] = None
    expire: Optional[StrictStr] = None
    price: Optional[Union[StrictFloat, StrictInt]] = None
    price_details: Optional[PriceDetails] = Field(default=None, alias="priceDetails")
    type: Optional[StrictStr] = None
    recurring: Optional[StrictBool] = None
    recurring_period: Optional[Dict[str, Any]] = Field(default=None, alias="recurringPeriod")
    recurring_next_payment_date: Optional[StrictStr] = Field(default=None, alias="recurringNextPaymentDate")
    is_payment_method_update: Optional[StrictBool] = Field(default=None, alias="isPaymentMethodUpdate")
    return_url: Optional[StrictStr] = Field(default=None, alias="returnUrl")
    complete: Optional[StrictBool] = None
    tax: Optional[Dict[str, Any]] = None
    username: Optional[StrictStr] = None
    discounts: Optional[List[Dict[str, Any]]] = None
    coupons: Optional[List[Dict[str, Any]]] = None
    giftcards: Optional[List[Dict[str, Any]]] = None
    address: Optional[Address] = None
    rows: Optional[List[BasketItem]] = None
    fingerprint: Optional[StrictStr] = Field(default=None, description="Browser fingerprint to identify the user")
    creator_code: Optional[StrictStr] = Field(default=None, description="The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes")
    roundup: Optional[StrictBool] = None
    cancel_url: Optional[StrictStr] = None
    complete_url: Optional[StrictStr] = None
    complete_auto_redirect: Optional[StrictBool] = None
    custom: Optional[Dict[str, Any]] = None
    links: Optional[BasketLinks] = None
    __properties: ClassVar[List[str]] = ["ident", "expire", "price", "priceDetails", "type", "recurring", "recurringPeriod", "recurringNextPaymentDate", "isPaymentMethodUpdate", "returnUrl", "complete", "tax", "username", "discounts", "coupons", "giftcards", "address", "rows", "fingerprint", "creator_code", "roundup", "cancel_url", "complete_url", "complete_auto_redirect", "custom", "links"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Basket from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of price_details
        if self.price_details:
            _dict['priceDetails'] = self.price_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of address
        if self.address:
            _dict['address'] = self.address.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in rows (list)
        _items = []
        if self.rows:
            for _item in self.rows:
                if _item:
                    _items.append(_item.to_dict())
            _dict['rows'] = _items
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['links'] = self.links.to_dict()
        # set to None if recurring_next_payment_date (nullable) is None
        # and model_fields_set contains the field
        if self.recurring_next_payment_date is None and "recurring_next_payment_date" in self.model_fields_set:
            _dict['recurringNextPaymentDate'] = None

        # set to None if return_url (nullable) is None
        # and model_fields_set contains the field
        if self.return_url is None and "return_url" in self.model_fields_set:
            _dict['returnUrl'] = None

        # set to None if username (nullable) is None
        # and model_fields_set contains the field
        if self.username is None and "username" in self.model_fields_set:
            _dict['username'] = None

        # set to None if fingerprint (nullable) is None
        # and model_fields_set contains the field
        if self.fingerprint is None and "fingerprint" in self.model_fields_set:
            _dict['fingerprint'] = None

        # set to None if roundup (nullable) is None
        # and model_fields_set contains the field
        if self.roundup is None and "roundup" in self.model_fields_set:
            _dict['roundup'] = None

        # set to None if complete_url (nullable) is None
        # and model_fields_set contains the field
        if self.complete_url is None and "complete_url" in self.model_fields_set:
            _dict['complete_url'] = None

        # set to None if custom (nullable) is None
        # and model_fields_set contains the field
        if self.custom is None and "custom" in self.model_fields_set:
            _dict['custom'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Basket from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ident": obj.get("ident"),
            "expire": obj.get("expire"),
            "price": obj.get("price"),
            "priceDetails": PriceDetails.from_dict(obj["priceDetails"]) if obj.get("priceDetails") is not None else None,
            "type": obj.get("type"),
            "recurring": obj.get("recurring"),
            "recurringPeriod": obj.get("recurringPeriod"),
            "recurringNextPaymentDate": obj.get("recurringNextPaymentDate"),
            "isPaymentMethodUpdate": obj.get("isPaymentMethodUpdate"),
            "returnUrl": obj.get("returnUrl"),
            "complete": obj.get("complete"),
            "tax": obj.get("tax"),
            "username": obj.get("username"),
            "discounts": obj.get("discounts"),
            "coupons": obj.get("coupons"),
            "giftcards": obj.get("giftcards"),
            "address": Address.from_dict(obj["address"]) if obj.get("address") is not None else None,
            "rows": [BasketItem.from_dict(_item) for _item in obj["rows"]] if obj.get("rows") is not None else None,
            "fingerprint": obj.get("fingerprint"),
            "creator_code": obj.get("creator_code"),
            "roundup": obj.get("roundup"),
            "cancel_url": obj.get("cancel_url"),
            "complete_url": obj.get("complete_url"),
            "complete_auto_redirect": obj.get("complete_auto_redirect"),
            "custom": obj.get("custom"),
            "links": BasketLinks.from_dict(obj["links"]) if obj.get("links") is not None else None
        })
        return _obj


