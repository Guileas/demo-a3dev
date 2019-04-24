<html>
<head>
<head>
<body>

	<button style="float: right;margin-right: 250px;"> New </button><br>
	<#list 1..10 as x>
		<p style="margin-right: 250px!important;align:center;">${x} <button> details </button> <button> supprimer </button> <button> associe </button> </p>
		<#if x == 10>
		<#break>
		</#if>
	</#list>

<body>
</html>
