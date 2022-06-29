pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                  echo "Hello ${REF_YCR}"
                    script {
                        echo "${scm.branches[0].name}"
                        def envName = "${scm.branches[0].name}"
                        echo "$envName"
                        echo envName
                    }
                   
                }
            }
        }
   }
}
