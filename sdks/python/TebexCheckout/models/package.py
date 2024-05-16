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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from TebexCheckout.models.package_meta_data import PackageMetaData
from typing import Optional, Set
from typing_extensions import Self

class Package(BaseModel):
    """
    Package
    """ # noqa: E501
    name: Optional[StrictStr] = Field(default=None, description="The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts.")
    price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="A float (decimal describing the price of the package in your account currency)")
    expiry_period: Optional[StrictStr] = Field(default=None, description="The renewal period of this item")
    expiry_length: Optional[StrictInt] = Field(default=None, description="An integer representing the number of `expiry_periods` that make up the renewal period.")
    meta_data: Optional[PackageMetaData] = Field(default=None, alias="metaData")
    __properties: ClassVar[List[str]] = ["name", "price", "expiry_period", "expiry_length", "metaData"]

    @field_validator('expiry_period')
    def expiry_period_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['day', 'month', 'year']):
            raise ValueError("must be one of enum values ('day', 'month', 'year')")
        return value

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
        """Create an instance of Package from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of meta_data
        if self.meta_data:
            _dict['metaData'] = self.meta_data.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Package from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "name": obj.get("name"),
            "price": obj.get("price"),
            "expiry_period": obj.get("expiry_period"),
            "expiry_length": obj.get("expiry_length"),
            "metaData": PackageMetaData.from_dict(obj["metaData"]) if obj.get("metaData") is not None else None
        })
        return _obj

