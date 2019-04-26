<div>
 <a href="./details" style="font-size: 20px;margin:15px;">New</a>
<#if items??>
<div style="width:600px; height:600px; overflow: auto;">
    <#list items as item>

        <#list item?keys as key>
            <#if !item[key]?is_sequence && item[key]?has_content>

                <#if item[key]?is_boolean>
            <div>${item[key]?c}</div>
                <#elseif item[key]?is_date_like>
            <div>${item[key]?string("yyyy/MM/dd HH:mm:ss")}</td>
                <#else>
            <div>${item[key]}</div>
                </#if>
            </#if>

        </#list>
        <div>
        <#list item?keys as key>
            <#if item[key]?is_sequence>
            <a href="">${key}</a>
            </#if>
            <#if key == "id">
             <a href="./delete/${item[key]}">Supprimer</a>
             <a href="./details/${item[key]}">Modifier</a>
            </#if>
        </#list>
        <div>

    </#list>
    </div>
</#if>
</div>
