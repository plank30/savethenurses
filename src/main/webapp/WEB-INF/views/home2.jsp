<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<body>

  <div class="tabbable" id="demo-tab"> <!-- Only required for left/right tabs -->
    <!-- Tab Definitions-->               
    <ul class="nav nav-tabs">
      <li><a href="#messageconverters" data-toggle="tab">Message Converters</a></li>
      <li><a href="#convert" data-toggle="tab">Type Conversion</a></li>
    </ul>  

    <!-- Tab Content-->
    <div class="tab-content">                  
    	<div class="tab-pane" id="messageconverters">
        <h2>Http Message Converters</h2>
        <p>
          See the <code>org.springframework.samples.mvc.messageconverters</code> package for the @Controller code
        </p>  
        <div id="stringMessageConverter">
          <h3>MappingJacksonHttpMessageConverter</h3>
          <ul>
            <li>
              <form id="readJson" class="readJsonForm" action="<c:url value="/messageconverters/json" />" method="post">
                <input id="readJsonSubmit" type="submit" value="Read JSON" class="btn btn-primary" /> 
              </form>
            </li>
            <li>
              <form id="readJsonInvalid" class="readJsonForm invalid" action="<c:url value="/messageconverters/json" />" method="post">
                <input id="readInvalidJsonSubmit" type="submit" value="Read invalid JSON (400 response code)" class="btn btn-primary" />  
              </form>
            </li>
            <li>
              <a id="writeJson" class="writeJsonLink" href="<c:url value="/messageconverters/json" />">Write JSON</a>
            </li>
          </ul>
        </div>
      </div>	


    </div> <!--tab-content-->
  </div> <!--tabbable-->   

</body>
</html>