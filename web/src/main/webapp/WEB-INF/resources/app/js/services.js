'use strict';

angular.module('xenon.services', []).
	service('$menuItems', function()
	{
		this.menuItems = [];

		var $menuItemsRef = this;

		var menuItemObj = {
			parent: null,

			title: '',
			link: '', // starting with "./" will refer to parent link concatenation
			state: '', // will be generated from link automatically where "/" (forward slashes) are replaced with "."
			icon: '',

			isActive: false,
			label: null,

			menuItems: [],

			setLabel: function(label, color, hideWhenCollapsed)
			{
				if(typeof hideWhenCollapsed == 'undefined')
					hideWhenCollapsed = true;

				this.label = {
					text: label,
					classname: color,
					collapsedHide: hideWhenCollapsed
				};

				return this;
			},

			addItem: function(title, link, icon)
			{
				var parent = this,
					item = angular.extend(angular.copy(menuItemObj), {
						parent: parent,

						title: title,
						link: link,
						icon: icon
					});

				if(item.link)
				{
					if(item.link.match(/^\./))
						item.link = parent.link + item.link.substring(1, link.length);

					if(item.link.match(/^-/))
						item.link = parent.link + '-' + item.link.substring(2, link.length);

					item.state = $menuItemsRef.toStatePath(item.link);
				}

				this.menuItems.push(item);

				return item;
			}
		};

		this.addItem = function(title, link, icon)
		{
			var item = angular.extend(angular.copy(menuItemObj), {
				title: title,
				link: link,
				state: this.toStatePath(link),
				icon: icon
			});

			this.menuItems.push(item);

			return item;
		};

		this.getAll = function()
		{
			return this.menuItems;
		};

		this.prepareSidebarMenu = function() {
			var dashboard    = this.addItem('Dashboard', 		'/app/dashboard-/variant-4', 			'linecons-cog');
			var students      = this.addItem('Student',	'/app/student',	'fa-graduation-cap');
			// var ui_elements  = this.addItem('UI Elements', 		'/app/ui', 					'linecons-note');
			// var widgets  	 = this.addItem('Widgets', 			'/app/widgets', 			'linecons-star');
		//	var mailbox  	 = this.addItem('Mailbox', 			'/app/mailbox', 			'linecons-mail').setLabel('5', 'secondary', false);
		//	var tables  	 = this.addItem('Tables', 			'/app/tables', 				'linecons-database');
			//var forms  	 	 = this.addItem('Forms', 			'/app/forms', 				'linecons-params');
		//	var extra  	 	 = this.addItem('Extra', 			'/app/extra', 				'linecons-beaker').setLabel('New Items', 'purple');
		//	var charts  	 = this.addItem('Charts', 			'/app/charts', 				'linecons-globe');
		//	var menu_lvls  	 = this.addItem('Menu Levels', 		'', 						'linecons-cloud');


				// Subitems of Dashboard
				// dashboard.addItem('Dashboard 1', 	'-/variant-1'); // "-/" will append parents link
				// dashboard.addItem('Dashboard 2', 	'-/variant-2');
				// dashboard.addItem('Dashboard 3', 	'-/variant-3');
				// dashboard.addItem('Dashboard 4', 	'-/variant-4');
				// dashboard.addItem('Update Hightlights', '/app/update-highlights').setLabel('v1.3', 'pink');


				// Subitems of UI Elements
				// ui_elements.addItem('Panels', 				'-/panels');
				// ui_elements.addItem('Buttons', 				'-/buttons');
				// ui_elements.addItem('Tabs & Accordions', 	'-/tabs-accordions');
				// ui_elements.addItem('Modals', 				'-/modals');
				// ui_elements.addItem('Breadcrumbs', 			'-/breadcrumbs');
				// ui_elements.addItem('Blockquotes', 			'-/blockquotes');
				// ui_elements.addItem('Progress Bars', 		'-/progress-bars');
				// ui_elements.addItem('Navbars', 				'-/navbars');
				// ui_elements.addItem('Alerts', 				'-/alerts');
				// ui_elements.addItem('Pagination', 			'-/pagination');
				// ui_elements.addItem('Typography', 			'-/typography');
				// ui_elements.addItem('Other Elements', 		'-/other-elements');


				// Subitems of Mailbox
				// mailbox.addItem('Inbox', 			'-/inbox');
				// mailbox.addItem('Compose Message', 	'-/compose');
				// mailbox.addItem('View Message', 	'-/message');


				// Subitems of Tables
				// tables.addItem('Basic Tables',		'-/basic');
				// tables.addItem('Responsive Tables',	'-/responsive');
				// tables.addItem('Data Tables',		'-/datatables');


				// Subitems of Forms
				// forms.addItem('Native Elements',		'-/native');
				// forms.addItem('Advanced Plugins',		'-/advanced');
				// forms.addItem('Form Wizard',			'-/wizard');
				// forms.addItem('Form Validation',		'-/validation');
				// forms.addItem('Input Masks',			'-/input-masks');
				// forms.addItem('File Upload',			'-/file-upload');
				// forms.addItem('Editors',				'-/wysiwyg');
				// forms.addItem('Sliders',				'-/sliders');


				// Subitems of Extra
				// var extra_icons = extra.addItem('Icons', 	'-/icons');
				// var extra_maps  = extra.addItem('Maps', 	'-/maps');
				// var members 	= extra.addItem('Members', 	'-/members').setLabel('New', 'warning');
				// extra.addItem('Gallery', 					'-/gallery');
				// extra.addItem('Calendar', 					'-/calendar');
				// extra.addItem('Profile', 					'-/profile');
				// extra.addItem('Login', 						'/login');
				// extra.addItem('Lockscreen', 				'/lockscreen');
				// extra.addItem('Login Light', 				'/login-light');
				// extra.addItem('Timeline', 					'-/timeline');
				// extra.addItem('Timeline Centered', 			'-/timeline-centered');
				// extra.addItem('Notes', 						'-/notes');
				// extra.addItem('Image Crop', 				'-/image-crop');
				// extra.addItem('Portlets', 					'-/portlets');
				// extra.addItem('Blank Page', 				'-/blank-page');
				// extra.addItem('Search', 					'-/search');
				// extra.addItem('Invoice', 					'-/invoice');
				// extra.addItem('404 Page', 					'-/page-404');
				// extra.addItem('Tocify', 					'-/tocify');
				// extra.addItem('Loading Progress', 			'-/loading-progress');
				// //extra.addItem('Page Loading Overlay', 		'-/page-loading-overlay'); NOT SUPPORTED IN ANGULAR
				// extra.addItem('Notifications', 				'-/notifications');
				// extra.addItem('Nestable Lists', 			'-/nestable-lists');
				// extra.addItem('Scrollable', 				'-/scrollable');
                //
				// 	// Submenu of Members
				// 	members.addItem('Members List', '-/list');
				// 	members.addItem('Add Member', '-/add');

			return this;
		};

		this.instantiate = function()
		{
			return angular.copy( this );
		}

		this.toStatePath = function(path)
		{
			return path.replace(/\//g, '.').replace(/^\./, '');
		};

		this.setActive = function(path)
		{
			this.iterateCheck(this.menuItems, this.toStatePath(path));
		};

		this.setActiveParent = function(item)
		{
			item.isActive = true;
			item.isOpen = true;

			if(item.parent)
				this.setActiveParent(item.parent);
		};

		this.iterateCheck = function(menuItems, currentState)
		{
			angular.forEach(menuItems, function(item)
			{
				if(item.state == currentState)
				{
					item.isActive = true;

					if(item.parent != null)
						$menuItemsRef.setActiveParent(item.parent);
				}
				else
				{
					item.isActive = false;
					item.isOpen = false;

					if(item.menuItems.length)
					{
						$menuItemsRef.iterateCheck(item.menuItems, currentState);
					}
				}
			});
		}
	});