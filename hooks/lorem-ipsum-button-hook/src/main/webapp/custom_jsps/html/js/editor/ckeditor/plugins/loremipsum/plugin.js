/*
 * Copyright (C) 2014 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
CKEDITOR.plugins.add( 'loremipsum',
	{
		init: function( editor )
		{
			editor.addCommand( 'loremIpsumCommand1',
				{
					exec : function( editor )
					{
						var loremipsum = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et sem arcu, nec pretium odio. In ullamcorper, eros dapibus sollicitudin lacinia, ante turpis fringilla lectus, id dignissim nisi tellus ac tellus. Quisque a felis lacus, et euismod quam. Curabitur feugiat luctus euismod. In condimentum velit eu nulla mollis id vestibulum nisi rutrum. Morbi ut tellus augue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum et libero ut neque pulvinar egestas sit amet sed libero. Phasellus semper magna non risus accumsan id mollis lacus volutpat. Phasellus congue dapibus nisl eget rutrum. Phasellus elementum nulla non nisl dapibus vestibulum. In libero dui, pellentesque et aliquam sed, auctor nec ante. Morbi et risus sem, vel porta leo. Aenean nunc enim, aliquet ut euismod nec, fermentum nec orci.';

						var p = editor.document.createElement('p');

						p.setHtml(loremipsum);
						editor.insertElement(p);
					}
				});
			editor.addCommand( 'loremIpsumCommand3',
				{
					exec : function( editor )
					{
						var loremipsum = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et sem arcu, nec pretium odio. In ullamcorper, eros dapibus sollicitudin lacinia, ante turpis fringilla lectus, id dignissim nisi tellus ac tellus. Quisque a felis lacus, et euismod quam. Curabitur feugiat luctus euismod. In condimentum velit eu nulla mollis id vestibulum nisi rutrum. Morbi ut tellus augue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum et libero ut neque pulvinar egestas sit amet sed libero. Phasellus semper magna non risus accumsan id mollis lacus volutpat. Phasellus congue dapibus nisl eget rutrum. Phasellus elementum nulla non nisl dapibus vestibulum. In libero dui, pellentesque et aliquam sed, auctor nec ante. Morbi et risus sem, vel porta leo. Aenean nunc enim, aliquet ut euismod nec, fermentum nec orci.<p>Phasellus mauris lectus, mollis vel sollicitudin tristique, ultrices a turpis. Fusce sagittis ultricies enim vel mattis. Sed vel est at justo dapibus mattis. Suspendisse ut ante lorem. Aliquam erat volutpat. Donec mollis, justo vel eleifend porta, sem mi rutrum metus, mollis volutpat nibh nulla in enim. Quisque suscipit lobortis sem eu hendrerit. Proin sagittis vestibulum sem, vitae tincidunt libero blandit rutrum. Phasellus nec malesuada sem. Praesent sed fringilla lacus. Curabitur faucibus, sapien in luctus tempor, urna lacus dictum est, a bibendum ipsum quam ac eros.</p><p>Vestibulum est arcu, pharetra sit amet rutrum eu, sagittis eu lacus. Vivamus pellentesque mollis purus vitae mollis. Nullam tempus lobortis arcu, ac malesuada tortor pellentesque ut. Pellentesque facilisis imperdiet arcu id mollis. Phasellus et pretium ante. Aliquam elementum, neque ut porttitor euismod, leo augue fermentum metus, eget pretium purus velit commodo elit. Nulla magna massa, elementum ut sagittis sit amet, varius eu eros. Ut eleifend elementum massa id bibendum. Phasellus a mollis diam. Maecenas dignissim tortor et neque elementum vel facilisis sapien accumsan. Duis in velit turpis. Aliquam mollis, leo ut tempor suscipit, leo nisi imperdiet massa, at placerat velit enim a odio.</p>';

						var p = editor.document.createElement('p');

						p.setHtml(loremipsum);
						editor.insertElement(p);
					}
				});
			editor.addCommand( 'loremIpsumCommand5',
				{
					exec : function( editor )
					{
						var loremipsum = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et sem arcu, nec pretium odio. In ullamcorper, eros dapibus sollicitudin lacinia, ante turpis fringilla lectus, id dignissim nisi tellus ac tellus. Quisque a felis lacus, et euismod quam. Curabitur feugiat luctus euismod. In condimentum velit eu nulla mollis id vestibulum nisi rutrum. Morbi ut tellus augue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum et libero ut neque pulvinar egestas sit amet sed libero. Phasellus semper magna non risus accumsan id mollis lacus volutpat. Phasellus congue dapibus nisl eget rutrum. Phasellus elementum nulla non nisl dapibus vestibulum. In libero dui, pellentesque et aliquam sed, auctor nec ante. Morbi et risus sem, vel porta leo. Aenean nunc enim, aliquet ut euismod nec, fermentum nec orci.<p>Phasellus mauris lectus, mollis vel sollicitudin tristique, ultrices a turpis. Fusce sagittis ultricies enim vel mattis. Sed vel est at justo dapibus mattis. Suspendisse ut ante lorem. Aliquam erat volutpat. Donec mollis, justo vel eleifend porta, sem mi rutrum metus, mollis volutpat nibh nulla in enim. Quisque suscipit lobortis sem eu hendrerit. Proin sagittis vestibulum sem, vitae tincidunt libero blandit rutrum. Phasellus nec malesuada sem. Praesent sed fringilla lacus. Curabitur faucibus, sapien in luctus tempor, urna lacus dictum est, a bibendum ipsum quam ac eros.</p><p>Vestibulum est arcu, pharetra sit amet rutrum eu, sagittis eu lacus. Vivamus pellentesque mollis purus vitae mollis. Nullam tempus lobortis arcu, ac malesuada tortor pellentesque ut. Pellentesque facilisis imperdiet arcu id mollis. Phasellus et pretium ante. Aliquam elementum, neque ut porttitor euismod, leo augue fermentum metus, eget pretium purus velit commodo elit. Nulla magna massa, elementum ut sagittis sit amet, varius eu eros. Ut eleifend elementum massa id bibendum. Phasellus a mollis diam. Maecenas dignissim tortor et neque elementum vel facilisis sapien accumsan. Duis in velit turpis. Aliquam mollis, leo ut tempor suscipit, leo nisi imperdiet massa, at placerat velit enim a odio.</p><p>Proin in urna sapien. Integer sed enim diam, ut adipiscing mi. Mauris fringilla eleifend lorem, sit amet gravida urna vestibulum vel. Mauris interdum tempus quam, et aliquam lacus blandit vel. Maecenas sit amet elit ac elit placerat molestie. Nam pellentesque vestibulum sem ac malesuada. Vestibulum lacus turpis, scelerisque in rhoncus quis, ultricies ut tellus. Quisque eget enim leo, a elementum lacus. Integer feugiat, nunc pellentesque faucibus faucibus, sem augue dictum dui, vel venenatis nulla quam eget diam. Integer sit amet ligula mauris. Fusce quis vestibulum ante. Integer non lobortis nisl. Nulla consectetur nisi et metus lacinia auctor. Cras sit amet elit libero, iaculis ultricies odio. Donec in tellus sapien. Maecenas malesuada urna in diam mollis pretium.</p><p>Sed scelerisque neque facilisis nibh pulvinar interdum. In hac habitasse platea dictumst. Nullam ac ante eget tortor aliquam imperdiet. Proin laoreet turpis ut mauris mollis pretium. Curabitur vel tortor nisl, at facilisis nulla. Phasellus faucibus, nunc sed semper porttitor, magna mauris ultrices sapien, commodo viverra diam arcu a mauris. Cras a tristique purus. Aenean interdum, dui et venenatis elementum, libero nunc dignissim dolor, at posuere nisi magna et enim. Pellentesque eleifend hendrerit magna. Maecenas pretium nulla eget purus posuere ultricies. Etiam et velit ligula, a tempor neque. Integer ut elit at tortor placerat varius. Proin vehicula hendrerit neque ac pulvinar. Mauris dapibus dui quis turpis pretium nec gravida augue porta. Curabitur aliquam posuere auctor.</p>';

						var p = editor.document.createElement('p');

						p.setHtml(loremipsum);
						editor.insertElement(p);
					}
				});
			editor.ui.addButton( 'LoremIpsum1',
				{
					label: 'Add 1 Lorem Impsum paragraph',
					command: 'loremIpsumCommand1',
					icon: this.path + 'images/icon1.png'
				});
			editor.ui.addButton( 'LoremIpsum3',
				{
					label: 'Add 3 Lorem Impsum paragraph',
					command: 'loremIpsumCommand3',
					icon: this.path + 'images/icon3.png'
				});
			editor.ui.addButton( 'LoremIpsum5',
				{
					label: 'Add 5 Lorem Impsum paragraph',
					command: 'loremIpsumCommand5',
					icon: this.path + 'images/icon5.png'
				});
		}
	});
