(function (app) {

    app.config(function ($httpProvider) {
        $httpProvider.defaults.headers.common['Content-Type'] = 'application/json';
    });

    app.service('$communicationService', function ($http) {


        this.get = function (url, data, config) {
            config = angular.extend({}, config, {params: data});
            return $http.get(url, config);
        };

        this.post = function (url, data, config) {
            return $http.post(url, data, config);
        };

        this.put = function (url, data, config) {
            return $http.put(url, data, config);
        };

        this.patch = function (url, data, config) {
            return $http.patch(url, data, config);
        };

        this.delete = function (url, data, config) {
            return $http.delete(url, data, config);
        };

    });

})(smsApp);