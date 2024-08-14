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
from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from TebexCheckout.models.recurring_payment_amount import RecurringPaymentAmount
from TebexCheckout.models.recurring_payment_links import RecurringPaymentLinks
from TebexCheckout.models.recurring_payment_status import RecurringPaymentStatus
from typing import Optional, Set
from typing_extensions import Self

class RecurringPayment(BaseModel):
    """
    RecurringPayment
    """ # noqa: E501
    id: Optional[StrictInt] = None
    created_at: Optional[datetime] = None
    updated_at: Optional[datetime] = None
    paused_at: Optional[datetime] = None
    paused_until: Optional[datetime] = None
    next_payment_date: Optional[StrictStr] = None
    reference: Optional[StrictStr] = None
    account_id: Optional[StrictInt] = None
    interval: Optional[StrictStr] = None
    cancelled_at: Optional[datetime] = None
    cancellation_requested_at: Optional[datetime] = None
    status: Optional[RecurringPaymentStatus] = None
    amount: Optional[RecurringPaymentAmount] = None
    cancel_reason: Optional[StrictStr] = None
    links: Optional[RecurringPaymentLinks] = None
    __properties: ClassVar[List[str]] = ["id", "created_at", "updated_at", "paused_at", "paused_until", "next_payment_date", "reference", "account_id", "interval", "cancelled_at", "cancellation_requested_at", "status", "amount", "cancel_reason", "links"]

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
        """Create an instance of RecurringPayment from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of amount
        if self.amount:
            _dict['amount'] = self.amount.to_dict()
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['links'] = self.links.to_dict()
        # set to None if paused_at (nullable) is None
        # and model_fields_set contains the field
        if self.paused_at is None and "paused_at" in self.model_fields_set:
            _dict['paused_at'] = None

        # set to None if paused_until (nullable) is None
        # and model_fields_set contains the field
        if self.paused_until is None and "paused_until" in self.model_fields_set:
            _dict['paused_until'] = None

        # set to None if cancelled_at (nullable) is None
        # and model_fields_set contains the field
        if self.cancelled_at is None and "cancelled_at" in self.model_fields_set:
            _dict['cancelled_at'] = None

        # set to None if cancellation_requested_at (nullable) is None
        # and model_fields_set contains the field
        if self.cancellation_requested_at is None and "cancellation_requested_at" in self.model_fields_set:
            _dict['cancellation_requested_at'] = None

        # set to None if cancel_reason (nullable) is None
        # and model_fields_set contains the field
        if self.cancel_reason is None and "cancel_reason" in self.model_fields_set:
            _dict['cancel_reason'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of RecurringPayment from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "created_at": obj.get("created_at"),
            "updated_at": obj.get("updated_at"),
            "paused_at": obj.get("paused_at"),
            "paused_until": obj.get("paused_until"),
            "next_payment_date": obj.get("next_payment_date"),
            "reference": obj.get("reference"),
            "account_id": obj.get("account_id"),
            "interval": obj.get("interval"),
            "cancelled_at": obj.get("cancelled_at"),
            "cancellation_requested_at": obj.get("cancellation_requested_at"),
            "status": RecurringPaymentStatus.from_dict(obj["status"]) if obj.get("status") is not None else None,
            "amount": RecurringPaymentAmount.from_dict(obj["amount"]) if obj.get("amount") is not None else None,
            "cancel_reason": obj.get("cancel_reason"),
            "links": RecurringPaymentLinks.from_dict(obj["links"]) if obj.get("links") is not None else None
        })
        return _obj


