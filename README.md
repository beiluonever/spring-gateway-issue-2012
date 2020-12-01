# spring-gateway-issue-2012

Own or create a consul environment,Change setting

Start gateway
Start service-a
Start service-b

Visit http://localhost:8081/serviceb,The expected result is "this is service A",But in fact the result is"this is service B"
