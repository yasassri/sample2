pipeline {
    agent any

    stages {
        stage('Hello3') {
            steps {
                script {
                  echo "Hello ${REF_YCR}"
                    script {
                        echo "${scm.branches[0].name}"
                         String branchName = "${scm.branches[0].name}"
                         String envNameOnly = branchName.substring(2, branchName.length()-1)
                         def env = System.getenv()[envNameOnly]
                         echo "$env"
                    }
                   
                }
            }
        }
   }
}
