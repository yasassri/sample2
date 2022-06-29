pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                  echo "Hello ${REF_YCR}"
                    script {
                        echo "${scm.branches[0].name}"
                        String envName = "${scm.branches[0].name}".substring(2, envName.length()-1)
                        echo "$envName envName"
                        def env = System.getenv()
                        println(env[envName])
                    }
                   
                }
            }
        }
   }
}
