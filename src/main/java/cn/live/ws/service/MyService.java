/**   
 * @Title: MyService.java
 * @Package cn.live.ws.service
 * @Description: TODO service 包
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午2:34:39
 * @version V1.0
 */
package cn.live.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ClassName: MyService
 * @Description: TODO A service endpoint interface (SEI) is a Java interface
 *               that declares the methods that a client can invoke on the
 *               service.
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午2:34:39
 *
 */
@WebService
public interface MyService {

	/**
	 * @Title: reverse
	 * @Description: As explained it returns a revesed string according
	 *               to the value provided. The reverse method is tagged with
	 *               the a @WebMethod annotation to mark the method as exposed
	 *               as a Web Service operation.
	 * @param value
	 * @return String
	 * @throws
	 */
	@WebMethod
	String reverse(String value);
}