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
                        echo "$envName envName"
                        echo envName
                        def env = System.getenv()
                        println(env['REF_YCR'])
                    }
                   
                }
            }
        }
   }
}
