#Readme
This is a Custom Policy SPI for Keycloak. To build this into a jar, use `mvn clean package`.

## Start keycloak with the new custom SPI
This is how you start keycloak with the new custom SPI added `./bin/kc.sh --verbose build --spi-policy-provider=custompolicy`. 
Since this is a new policy provider, the naming convention for the attribute is --<spi>-<spi-id>-provider=<name>
This will also add the SPI provider to the dropdown list. 

Note: You'll have to ensure that your client has access to make this change. 

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

