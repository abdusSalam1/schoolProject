(function (app) {
    function loginController(loginService, $q, $scope, $rootScope) {
        var self = this;
        $rootScope.isLoginPage        = true;
        $rootScope.isMainPage         = false;
        $scope.credentials = {email: '', password: ''};
        self.message = "";

       self.authenticateUser = function (credentials) {
           isValid = $scope.loginForm.$valid;
           if (isValid) {
               loginService.authenticateUser(credentials).then(function (res) {
                   console.log(res);

                   valid = res(credentials);
                   if(valid){
                       window.location.href = '#/app/dashboard-variant-4';
                       return true;
                   }
                   else{
                       res.alert( "Invalid email or password");
                       return false;
                   }
               });
           }
       }

    }
    app.controller("loginController", ['loginService', '$q', '$scope', '$rootScope', loginController]);
}(smsApp));