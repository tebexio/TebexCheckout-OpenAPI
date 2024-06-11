#!/bin/bash

rm -rf ../sdks
mkdir -p ../sdks
openapi-generator-cli validate -i ../checkout-api.yaml

echo "Generating SDKs..."
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/python --api-package TebexCheckout --package-name TebexCheckout -g python &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/php --api-package TebexCheckout --package-name TebexCheckout -g php --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/python --api-package TebexCheckout --package-name TebexCheckout -g python --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/markdown --api-package TebexCheckout --package-name TebexCheckout -g markdown --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/java --api-package TebexCheckout --package-name TebexCheckout -g java --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/nodejs --api-package TebexCheckout --package-name TebexCheckout -g javascript --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/csharp --api-package TebexCheckout --package-name TebexCheckout -g csharp --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/openapi --api-package TebexCheckout --package-name TebexCheckout -g openapi --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/openapi-yaml --api-package TebexCheckout --package-name TebexCheckout -g openapi-yaml --invoker-package TebexCheckout &
openapi-generator-cli generate -i ../checkout-api.yaml -o ../sdks/postman --api-package TebexCheckout --package-name TebexCheckout -g postman-collection --invoker-package TebexCheckout &

wait
echo "---------------------"
echo "Generation completed."