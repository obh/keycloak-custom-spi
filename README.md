#Readme
This is a Custom Policy SPI for Keycloak. To build this into a jar, use `mvn clean package`.

## Adding this Policy to a client

```bash
curl --request POST \
  --url http://localhost:8080/admin/realms/<REALM>/clients/<UUID OF CLIENT>/authz/resource-server/policy \
  --header 'Authorization: Bearer <TOKEN>' \
  --header 'Content-Type: application/json' \
  --data '{
	"name": "My custom policy enforcer",
	"type": "custompolicy"
}'
```

## To evaluate a user

