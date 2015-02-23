package com.syxy.protocol;

import java.nio.ByteBuffer;

import com.syxy.server.ClientSession;

/**
 * <li>说明 协议编码接口
 * <li>作者 zer0
 * <li>创建日期 2015-2-16
 */

public interface CoderHandler {

	/**
	 * <li>方法名 process
	 * <li>@param client
	 * <li>@param str
	 * <li>返回类型 ByteBuffer
	 * <li>说明 对处理后的结果数据进行编码，并将编码后的请求响应设置给client
	 * <li>作者 zer0
	 * <li>创建日期 2015-2-16
	 */
	public ByteBuffer process(String str, ClientSession client);
	
}
