node {
   stage('SCM Checkout'){
     git 'https://github.com/ismehene/ticket'
   }
   stage('Compile-Package'){
      //Get maven home path
      def mvnHome = tool name: 'C:\\Program Files\\maven 3.3.9', type: 'maven'
      bat "${mvnHome}/bin/mvn package"
   }
}
