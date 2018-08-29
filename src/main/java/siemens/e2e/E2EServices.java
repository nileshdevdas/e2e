package siemens.e2e;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class E2EServices {

	@RequestMapping(path = "version", method = RequestMethod.GET, produces = "application/json")
	public String getVersion() {
		return "1.0";
	}

	@RequestMapping(path = "user", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User getUserInfo(@RequestParam(name = "username") String username) {
		User user = new User();
		user.setUsername(username);
		user.setPassword("xx023jlkajdsf9-");
		user.setStatus("Active");
		user.setEmail("user@username.com");
		return user;
	}
}
