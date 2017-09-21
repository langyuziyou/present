package present.controller;  
  
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
  
//url:  http://localhost:8080/HelloSpringMVC/hello/mvc  

@Scope("prototype")
@Controller
@RequestMapping("/hello")
public class HelloController {  
          
    //方法级别的RequestMapping， 限制并缩小了URL路径匹配，同类级别的标签协同工作，最终确定拦截到的URL由那个方法处理  
    //并指定访问方法为GET  
      @RequestMapping(value="/mvc",method=RequestMethod.GET)    
        public String HelloWorld(Model model){    
            
            model.addAttribute("message","Hello Spring MVC!!!");  //传参数给前端  
              
          //视图渲染，/WEB-INF/view/HelloWorld.jsp  
            return "Hello";  //页面的名称，根据此字符串会去寻找名为HelloWorld.jsp的页面  
        }    
}  