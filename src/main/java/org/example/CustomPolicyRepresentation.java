package org.example;
import org.jboss.logging.Logger;
import org.keycloak.representations.idm.authorization.GroupPolicyRepresentation;

public class CustomPolicyRepresentation extends GroupPolicyRepresentation {
    private static final Logger log = Logger.getLogger(CustomPolicyRepresentation.class);

    public CustomPolicyRepresentation() {
        System.out.println("a custom policy is being created");
        log.infof("A %s is being created", this.getClass().getSimpleName());
    }

    public String getType() {
        log.infof("Getting the type of %s", this.getClass().getSimpleName());
        return "custompolicy";
    }
}