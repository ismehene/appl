node {
	   environment {
	     PATH = 'C:\\Program Files\\Git\\bin'
	   stage('SCM Checkout'){
	     git 'https://github.com/ismehene/ticket'
	   }
           agent any triggers { pollSCM('* * * * *') }
	   stage('Compile-Package'){
	      //Get maven home path
	      def mvnHome = tool name: 'C:\\Program Files\\maven 3.3.9', type: 'maven'
	      bat "${mvnHome}/bin/mvn package"
	   }post { success { echo 'Now Archiving...' archiveArtifacts artifacts : '**/target/*.war'
}
} }        stage ('Deployments_test'){ steps { sh "cp **/target/*.war C:\\Program Files (x86)\\Jenkins\\workspace"
	 } } stage ('Deployments_Prod'){ steps { 
           timeout(time :3, unit :'DAYS'){ input message :'Approve PRODUCTION Deployment?' }
	   sh "cp **/target/*.war C:\\Program Files (x86)\\Jenkins\\workspace" } } } 

