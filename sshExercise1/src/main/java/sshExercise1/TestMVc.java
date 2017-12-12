package sshExercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/sdf")
public class TestMVc {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		System.out.println("dslfj");
		return "sdf";
	}
}
