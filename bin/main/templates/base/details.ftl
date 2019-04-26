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
    <#list item as field>
    <#list item?keys as key>
    <div>
        <#if field.name != "id" && field.type != "interface java.util.List">

            <#if field.type == "class java.lang.String">
            <div>${field.name}</div>
        <input type="text" name="${field.name}" value=""/>
            <#elseif field.type == "class java.lang.Integer" || field.type == "class java.lang.Double">
            <div>${field.name}</div>
            <input type="number" id="tentacles" name="${field.name}" min="0">
       		<#elseif field.type == "class java.lang.Boolean">
            <div><input type="checkbox" id="scales" name="${field.name}"> ${field.name}</div>
            </#if>
        </#if>
    <div>

    </#list>

    </#list>
</#if>
    <br>
        <input type="submit" value="submit"/>
    </br>
</form>
