
pipeline{	
    agent any	
    //options { 
	//	skipStagesAfterUnstable() 
	//} 	
    stages{	
        stage('Build'){	
            steps{	
                echo "setting current build to unstable"	
                script {	
                    currentBuild.result = 'UNSTABLE'	
                }	
            }	
        }	
        stage('Deploy'){	
            steps{	
                echo "deploy is running"	
            }	
        }
	stage('Delivery') {
	    steps{
	        echo "this is delivery"
	    }
	}
    }	
}	
