node {
   stage('SCM Checkout'){
     git 'https://github.com/ismehene/ticket'
   }
   stage('Compile-Package'){
      //Get maven home path
      def mvnHome = tool name: 'maven 3.3.9', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
}
