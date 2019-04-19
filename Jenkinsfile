node {
   stage('SCM Checkout'){
     git 'https://github.com/ismehene/ticket'
   }
   stage('Compile-Package'){
     sh 'mvn package'
   }
}
