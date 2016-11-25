package com.rjfun.cordova.httpd;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.cordova.CallbackContext;

public class WebServer extends NanoHTTPD
{
	public WebServer(InetSocketAddress localAddr, AndroidFile wwwroot,CallbackContext delayCallback) throws IOException {
		super(localAddr, wwwroot,delayCallback);
	}

	public WebServer(int port, AndroidFile wwwroot ,CallbackContext delayCallback) throws IOException {
		super(port, wwwroot,delayCallback);
	}
}
