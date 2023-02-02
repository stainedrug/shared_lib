import groovy.transform.Field
vars/vcCredentials.groovy

@Field credentialsId = 'ecurity-API-user'
@Field usernameVariable = "'security_API_user'"



//these dont work
def credentialsId() {
    echo "ecurity-API-user"
}

def usernameVariable() {
    echo "security_API_user"
}

def passwordVariable() {
    echo "security_API_pass"
}
