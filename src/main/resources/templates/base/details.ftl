<form id="createForm" action="" method="POST">
	<#if detail_template??>
    <#list detail_template as field>
    <div>
        <#if field.name != "id" && field.type != "interface java.util.List">

            <#if field.type == "class java.lang.String">
            <div>${field.name}</div>
        <input type="text" name="${field.name}" value=""/>
            <#elseif field.type == "class java.lang.Integer" || field.type == "class java.lang.Double">
            <div>${field.name}</div>
            <input type="number" id="tentacles" name="${field.name}" min="0">
       		<#elseif field.type == "class java.lang.Boolean">
            <div><input type="checkbox" value="0" name="${field.name}"> ${field.name}</div>
            </#if>
        </#if>
    <div>
    </#list>

    <#elseif item??>
    <#list item as field, value>
	<div>
		<#if field != "id" && field != "interface java.util.List" && field != "hibernateLazyInitializer">
			<#if value?is_boolean>
			<input type="checkbox" value="${value?c}" name="${field}">${field}
			<#elseif value?is_string>
				<div>${field}</div>
				<input type="text" name="${field}" value="${value}"/>
			<#elseif value?is_number>
			<div>${field}</div>
				<input type="number" id="tentacles" value="${value}" name="${field}" min="0">
			</#if>
		</#if>
	<div>
    </#list>

</#if>
    <br>
        <input type="submit" value="submit"/>
    </br>
</form>
