
#!/bin/bash

# Configuration
API_URL="http://localhost:8080/statement/pdf?accountNumber=1234567890"
ITERATIONS=10000

# Initialize total time
total_time=0

# Loop to call API
for i in $(seq 1 $ITERATIONS); do
    echo "Call $i: $(date)"
    time_taken=$(curl -s -o /dev/null -w "%{time_total}" "$API_URL")
    echo "Time: ${time_taken}s"
    total_time=$(echo "$total_time + $time_taken" | bc -l)
done

echo "Completed $ITERATIONS API calls"
echo "Total time: ${total_time}s"
echo "Average time: $(echo "scale=3; $total_time / $ITERATIONS" | bc -l)s"