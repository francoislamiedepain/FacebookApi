package rest_fb;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
//import com.restfb.Parameter;
import com.restfb.Version;
//import com.restfb.types.Page;
import com.restfb.types.User;

public class GetUserDetails {

	public static void main(String[] args) {
		// For all API calls, you need to tell RestFB how to turn the JSON
		// returned by Facebook into Java objects.  In this case, the data
		// we get back should be mapped to the User and Page types, respectively.
		// You can write your own types too!
		
		FacebookClient facebookClient = new DefaultFacebookClient("your_access_token", Version.VERSION_8_0);

		User user = facebookClient.fetchObject("me", User.class);
//		Page page = facebookClient.fetchObject("KheosBandOfficial", Page.class, 
//		                 Parameter.with("fields", "fan_count"));

		System.out.println("User name: " + user.getName());
//		System.out.println("Page likes: " + page.getFanCount());

	}

}
