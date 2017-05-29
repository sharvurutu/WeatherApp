'use strict';

angular.module('openWeatherApp.directives', [])

.directive(
		'weatherPanel',
		[ function factory() {
			return {
				restrict : 'EA',

				scope : {
					useDayForecast : '=showEntry',
					forecast : '=weatherPanel'
				},

				templateUrl : 'WeaHtml/weather-panel-light.html',

				link : function(scope, element, attrs) {
					scope.getIconImageUrl = function(iconName) {
						return (iconName ? 'http://openweathermap.org/img/w/'
								+ iconName + '.png' : '');
					};

					scope.parseDate = function(time) {
						return new Date(time * 1000);
					};
				}
			}
		} ])

.directive(
		'weatherPanelWind',
		[ function factory() {
			return {
				restrict : 'EA',

				scope : {
					useDayForecast : '=showEntry',
					forecast : '=weatherPanel'
				},

				templateUrl : 'WeaHtml/weather-panel-wind.html',

				link : function(scope, element, attrs) {

					scope.getIconImageUrl = function(iconName) {
						return (iconName ? 'http://openweathermap.org/img/w/'
								+ iconName + '.png' : '');
					};

					scope.parseDate = function(time) {
						return new Date(time * 1000);
					};
				}
			}
		} ]);
