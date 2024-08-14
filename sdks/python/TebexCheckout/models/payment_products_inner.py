# coding: utf-8

"""
    Tebex Checkout API

    The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

    The version of the OpenAPI document: 1.1.2
    Contact: tebex-integrations@overwolf.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from TebexCheckout.models.payment_products_inner_base_price import PaymentProductsInnerBasePrice
from TebexCheckout.models.payment_products_inner_paid_price import PaymentProductsInnerPaidPrice
from typing import Optional, Set
from typing_extensions import Self

class PaymentProductsInner(BaseModel):
    """
    PaymentProductsInner
    """ # noqa: E501
    id: Optional[StrictStr] = None
    name: Optional[StrictStr] = None
    quantity: Optional[StrictInt] = None
    base_price: Optional[PaymentProductsInnerBasePrice] = None
    paid_price: Optional[PaymentProductsInnerPaidPrice] = None
    variables: Optional[List[StrictStr]] = None
    expires_at: Optional[datetime] = None
    custom: Optional[Dict[str, Any]] = Field(default=None, description="Any custom data associated with the payment")
    username: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["id", "name", "quantity", "base_price", "paid_price", "variables", "expires_at", "custom", "username"]

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
        """Create an instance of PaymentProductsInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of base_price
        if self.base_price:
            _dict['base_price'] = self.base_price.to_dict()
        # override the default output from pydantic by calling `to_dict()` of paid_price
        if self.paid_price:
            _dict['paid_price'] = self.paid_price.to_dict()
        # set to None if id (nullable) is None
        # and model_fields_set contains the field
        if self.id is None and "id" in self.model_fields_set:
            _dict['id'] = None

        # set to None if expires_at (nullable) is None
        # and model_fields_set contains the field
        if self.expires_at is None and "expires_at" in self.model_fields_set:
            _dict['expires_at'] = None

        # set to None if username (nullable) is None
        # and model_fields_set contains the field
        if self.username is None and "username" in self.model_fields_set:
            _dict['username'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PaymentProductsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "quantity": obj.get("quantity"),
            "base_price": PaymentProductsInnerBasePrice.from_dict(obj["base_price"]) if obj.get("base_price") is not None else None,
            "paid_price": PaymentProductsInnerPaidPrice.from_dict(obj["paid_price"]) if obj.get("paid_price") is not None else None,
            "variables": obj.get("variables"),
            "expires_at": obj.get("expires_at"),
            "custom": obj.get("custom"),
            "username": obj.get("username")
        })
        return _obj


