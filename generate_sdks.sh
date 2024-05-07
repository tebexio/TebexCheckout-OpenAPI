#!/bin/bash

rm -rf _generated
mkdir -p _generated
openapi-generator-cli validate -i openapi.yaml

echo "Generating SDKs..."
openapi-generator-cli generate -i openapi.yaml -o _generated/python --api-package TebexCheckout --package-name TebexCheckout -g python &
openapi-generator-cli generate -i openapi.yaml -o _generated/php --api-package TebexCheckout --package-name TebexCheckout -g php --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/typescript --api-package TebexCheckout --package-name TebexCheckout -g typescript --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/ruby --api-package TebexCheckout --package-name TebexCheckout -g ruby --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/python --api-package TebexCheckout --package-name TebexCheckout -g python --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/markdown --api-package TebexCheckout --package-name TebexCheckout -g markdown --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/java --api-package TebexCheckout --package-name TebexCheckout -g java --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/go --api-package TebexCheckout --package-name TebexCheckout -g go --invoker-package TebexCheckout &
openapi-generator-cli generate -i openapi.yaml -o _generated/csharp --api-package TebexCheckout --package-name TebexCheckout -g csharp --invoker-package TebexCheckout &

wait
echo "---------------------"
echo "Generation completed."