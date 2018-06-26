/**   
 * @Title: MyServiceImpl.java
 * @Package cn.live.ws.service.Impl
 * @Description: TODO service 实现包
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午3:59:03
 * @version V1.0
 */
package cn.live.ws.service.Impl;

import javax.jws.WebService;

import cn.live.ws.service.MyService;

/**
 * @ClassName: MyServiceImpl
 * @Description: TODO
 * @author FOAMVALUE FOAMVALUE@LIVE.CN
 * @date 2014年4月16日 下午3:59:03
 *
 */
@WebService(endpointInterface = "cn.live.ws.service.MyService")
public class MyServiceImpl implements MyService {

	/*
	 * (non-Javadoc) <p>Title: reverse</p> <p>Description: </p>
	 *
	 * @param value
	 *
	 * @return
	 *
	 * @see cn.live.ws.service.MyService#reverse(java.lang.String)
	 */
//	@Override
	public String reverse(String value) {
		if (value == null)
			return null;
		return new StringBuffer(value).reverse().toString();
	}

}
