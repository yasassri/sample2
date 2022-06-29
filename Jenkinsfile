pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                  echo "Hello ${REF_YCR}"
                    script {
                        echo "${scm.branches[0].name}"
                         String envName = "${scm.branches[0].name}"
                        String envNameOnly = envName.substring(2, envName.length()-1)
                        echo "XXX: $envNameOnly"
                        def env = System.getenv()
                        println(env[envNameOnly])
                    }
                   
                }
            }
        }
   }
}
