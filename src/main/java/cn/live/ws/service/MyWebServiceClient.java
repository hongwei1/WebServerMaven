/**   
 * @Title: MyWebServiceClient.java
 * @Package cn.live.ws.service
 * @Description: TODO
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午10:39:59
 * @version V1.0
 */
package cn.live.ws.service;

import cn.live.ws.service.impl.MyService;
import cn.live.ws.service.impl.MyServiceImplService;

/**
 * @ClassName: MyWebServiceClient
 * @Description: TODO create the Web service client class
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午10:39:59
 *
 */
public class MyWebServiceClient {
	public static void main(String[] args) {
		MyServiceImplService serviceImpl = new MyServiceImplService();
		MyService service = serviceImpl.getMyServiceImplPort();
		System.out.println(service.reverse("123456"));
	}
}
