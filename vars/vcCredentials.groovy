import groovy.transform.Field
vars/vcCredentials.groovy

//These work as properties and can be accessed via vcCredentials.propertyName
@Field credentialsId = "'security-API-user'";
@Field usernameVariable = "'security_API_user'";
@Field passwordVariable = "'security_API_pass'";


//these dont work as properties
def credentialsId() {
    echo "ecurity-API-user"
}

def usernameVariable() {
    echo "security_API_user"
}

def passwordVariable() {
    echo "security_API_pass"
}
