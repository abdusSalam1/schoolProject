'use strict';

var smsApp = angular.module('sms-app', [
	'ngCookies',
	'ui.router',
	'ui.bootstrap',
	'oc.lazyLoad',
	'xenon.controllers',
	'xenon.directives',
	'xenon.factory',
	'xenon.services',
	'FBAngular'
]);

smsApp.run(function() {
	// Page Loading Overlay
	public_vars.$pageLoadingOverlay = jQuery('.page-loading-overlay');
	jQuery(window).load(function() {
		public_vars.$pageLoadingOverlay.addClass('loaded');
	})
});


smsApp.config(function($stateProvider, $urlRouterProvider, $ocLazyLoadProvider, ASSETS, $controllerProvider, $provide){
    smsApp.controller = $controllerProvider.register;
    smsApp.service = $provide.service;
	$urlRouterProvider.otherwise('/app/dashboard-variant-4');
	$stateProvider.
		// Main Layout Structure
		state('app', {
			abstract: true,
			url: '/app',
			templateUrl: appHelper.templatePath('layout/app-body'),
			controller: function($rootScope){
				$rootScope.isLoginPage        = false;
				$rootScope.isMainPage         = true;
			}
		}).
		state('app.dashboard-variant-4', {
			url: '/dashboard-variant-4',
			templateUrl: appHelper.templatePath('dashboards/variant-4'),
			resolve: {
				resources: function($ocLazyLoad){
					return $ocLazyLoad.load([
						ASSETS.icons.meteocons,
						ASSETS.maps.vectorMaps
					]);
				}
			}
		}).
		// Logins and Lockscreen
		state('login', {
			url: '/login',
			templateUrl: appHelper.templatePath('login'),
			controller: 'loginController',
			resolve: {
				resources: function($ocLazyLoad){
					return $ocLazyLoad.load([
						appHelper.appPath("js/controllers/loginController.js"),
                        appHelper.appPath("js/service/loginService.js"),
						ASSETS.forms.jQueryValidate,
						ASSETS.extra.toastr
					]);
				}
			}
		}).
	state('app.student', {
        url: '/student',
        templateUrl: appHelper.templatePath('student'),
        controller: '',
        resolve: {
            resources: function($ocLazyLoad){
                return $ocLazyLoad.load([
                    ASSETS.forms.jQueryValidate,
                    ASSETS.extra.toastr
                ]);
            },
            jqui: function($ocLazyLoad){
                return $ocLazyLoad.load({
                    files: ASSETS.core.jQueryUI
                });
            },
            datepicker: function($ocLazyLoad){
                return $ocLazyLoad.load([
                    ASSETS.forms.datepicker
                ]);
            },inputmask: function($ocLazyLoad){
                return $ocLazyLoad.load([
                    ASSETS.forms.inputmask
                ]);
            }
        }
    });
});


smsApp.constant('ASSETS', {
	'core': {
		'bootstrap': appHelper.assetPath('js/bootstrap.min.js'), // Some plugins which do not support angular needs this
		'jQueryUI': [
			appHelper.assetPath('js/jquery-ui/jquery-ui.min.js'),
			appHelper.assetPath('js/jquery-ui/jquery-ui.structure.min.css')
		],
		'moment': appHelper.assetPath('js/moment.min.js'),
		'googleMapsLoader': appHelper.assetPath('app/js/angular-google-maps/load-google-maps.js')
	},

	'charts': {
		'dxGlobalize': appHelper.assetPath('js/devexpress-web-14.1/js/globalize.min.js'),
		'dxCharts': appHelper.assetPath('js/devexpress-web-14.1/js/dx.chartjs.js'),
		'dxVMWorld': appHelper.assetPath('js/devexpress-web-14.1/js/vectormap-data/world.js')
	},

	'xenonLib': {
		notes: appHelper.assetPath('js/xenon-notes.js')
	},

	'maps': {
		'vectorMaps': [
			appHelper.assetPath('js/jvectormap/jquery-jvectormap-1.2.2.min.js'),
			appHelper.assetPath('js/jvectormap/regions/jquery-jvectormap-world-mill-en.js'),
			appHelper.assetPath('js/jvectormap/regions/jquery-jvectormap-it-mill-en.js')
		]
	},

	'icons': {
		'meteocons': appHelper.assetPath('css/fonts/meteocons/css/meteocons.css'),
		'elusive': appHelper.assetPath('css/fonts/elusive/css/elusive.css')
	},

	'tables': {
		'rwd': appHelper.assetPath('js/rwd-table/js/rwd-table.min.js'),

		'datatables': [
			appHelper.assetPath('js/datatables/dataTables.bootstrap.css'),
			appHelper.assetPath('js/datatables/datatables-angular.js')
		]
	},

	'forms': {
		'select2': [
			appHelper.assetPath('js/select2/select2.css'),
			appHelper.assetPath('js/select2/select2-bootstrap.css'),
			appHelper.assetPath('js/select2/select2.min.js')
		],
		'daterangepicker': [
			appHelper.assetPath('js/daterangepicker/daterangepicker-bs3.css'),
			appHelper.assetPath('js/daterangepicker/daterangepicker.js')
		],

		'colorpicker': appHelper.assetPath('js/colorpicker/bootstrap-colorpicker.min.js'),
		'selectboxit': appHelper.assetPath('js/selectboxit/jquery.selectBoxIt.js'),
		'tagsinput': appHelper.assetPath('js/tagsinput/bootstrap-tagsinput.min.js'),
		'datepicker': appHelper.assetPath('js/datepicker/bootstrap-datepicker.js'),
		'timepicker': appHelper.assetPath('js/timepicker/bootstrap-timepicker.min.js'),
		'inputmask': appHelper.assetPath('js/inputmask/jquery.inputmask.bundle.js'),
		'formWizard': appHelper.assetPath('js/formwizard/jquery.bootstrap.wizard.min.js'),
		'jQueryValidate': appHelper.assetPath('js/jquery-validate/jquery.validate.min.js'),

		'dropzone': [
			appHelper.assetPath('js/dropzone/css/dropzone.css'),
			appHelper.assetPath('js/dropzone/dropzone.min.js')
		],

		'typeahead': [
			appHelper.assetPath('js/typeahead.bundle.js'),
			appHelper.assetPath('js/handlebars.min.js')
		],

		'multiSelect': [
			appHelper.assetPath('js/multiselect/css/multi-select.css'),
			appHelper.assetPath('js/multiselect/js/jquery.multi-select.js')
		],

		'icheck': [
			appHelper.assetPath('js/icheck/skins/all.css'),
			appHelper.assetPath('js/icheck/icheck.min.js')
		],

		'bootstrapWysihtml5': [
			appHelper.assetPath('js/wysihtml5/src/bootstrap-wysihtml5.css'),
			appHelper.assetPath('js/wysihtml5/wysihtml5-angular.js')
		]
	},

	'uikit': {
		'base': [
			appHelper.assetPath('js/uikit/uikit.css'),
			appHelper.assetPath('js/uikit/css/addons/uikit.almost-flat.addons.min.css'),
			appHelper.assetPath('js/uikit/js/uikit.min.js')
		],

		'codemirror': [
			appHelper.assetPath('js/uikit/vendor/codemirror/codemirror.js'),
			appHelper.assetPath('js/uikit/vendor/codemirror/codemirror.css')
		],

		'marked': appHelper.assetPath('js/uikit/vendor/marked.js'),
		'htmleditor': appHelper.assetPath('js/uikit/js/addons/htmleditor.min.js'),
		'nestable': appHelper.assetPath('js/uikit/js/addons/nestable.min.js')
	},

	'extra': {
		'tocify': appHelper.assetPath('js/tocify/jquery.tocify.min.js'),
		'toastr': appHelper.assetPath('js/toastr/toastr.min.js'),

		'fullCalendar': [
			appHelper.assetPath('js/fullcalendar/fullcalendar.min.css'),
			appHelper.assetPath('js/fullcalendar/fullcalendar.min.js')
		],

		'cropper': [
			appHelper.assetPath('js/cropper/cropper.min.js'),
			appHelper.assetPath('js/cropper/cropper.min.css')
		]
	}
});