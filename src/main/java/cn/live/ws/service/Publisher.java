/**   
 * @Title: Publisher.java
 * @Package cn.live.ws.service
 * @Description: TODO
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午4:21:59
 * @version V1.0
 */
package cn.live.ws.service;

import javax.xml.ws.Endpoint;

import cn.live.ws.service.Impl.MyServiceImpl;

/**
 * @ClassName: Publisher
 * @Description: TODO
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午4:21:59
 *
 */
public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/MyService", new MyServiceImpl());
	}
}
