#!/bin/bash

# Configuration
API_URL="http://localhost:8080/statement/pdf?accountNumber=1234567890"
ITERATIONS=10

# Loop to call API
for i in $(seq 1 $ITERATIONS); do
#    echo "Call $i: $(date)"
#    curl -s -o /dev/null -w "Status: %{http_code}, Time: %{time_total}s\n" "$API_URL"
    curl -s -o /dev/null -w "%{time_total}s\n" "$API_URL"
done

echo "Completed $ITERATIONS API calls"