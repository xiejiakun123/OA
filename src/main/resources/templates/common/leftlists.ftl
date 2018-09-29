<div style="position: relative; margin-top: 20px;">
			<input type="text" placeholder="查找..." class="search-input cha" /> <span
				style="display: inline-block; height: 35px; width: 38px; background: red; position: absolute; text-align: center; line-height: 35px; border-bottom-right-radius: 2px; border-top-right-radius: 2px; background: #374850;">
				<a href="#" class="chazhao"><span class="glyphicon glyphicon-search"
					style="color: white;"></span></a>
			</span>
		</div>
		<div class="panel-group" id="accordion"
			style="margin-top: 10px; margin-left: -12px;">

			<div class="panel panel-default">
				<#list oneMenuAll as one>
				<div class="panel-heading">
					<a class="open-menu green-left" href="#collapse${one.menu_id}" data-toggle="collapse"
						data-parent="#accordion"> <span
						class="glyphicon ${one.menu_icon}"></span> <span>${one.menu_name}</span> <span
						class="glyphicon glyphicon-menu-left pull-right"></span>
					</a>
				</div>
				<div id="collapse${one.menu_id}" class="panel-collapse collapse ">
					<ul>
					<#list twoMenuAll as two>
					<#if one.menu_id==two.parent_id>
						<#if two.menuUrl??>
						<li>
							<a href="javascript:changepath('${two.menu_url}');"> <span
									class="glyphicon ${two.menu_icon}"></span> <span>${two.menu_name}</span>
							</a>
						</li>
						
						<#else>
							<li>
								<a href="#"> <span
										class="glyphicon ${two.menu_icon}"></span> <span>${two.menu_name}</span>
								</a>
							</li>
						</#if>
				</#if>
				</#list>
				</ul>
				</div>
				</#list>
			</div>
		</div>
<script>
	$(function(){
		$(".chazhao").click(function(){
			var $val=$(".cha").val();
			$(".thistable").load("menucha",{val:$val});
		});
	})
</script>