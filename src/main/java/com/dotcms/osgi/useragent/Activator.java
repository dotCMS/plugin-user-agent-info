package com.dotcms.osgi.useragent;


import com.dotcms.osgi.useragent.viewtool.UserAgentToolInfo;
import com.dotcms.repackage.org.osgi.framework.BundleContext;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;



public class Activator extends GenericBundleActivator {


	public void start(BundleContext bundleContext) throws Exception {
        //Initializing services...
        initializeServices( bundleContext );

        //Registering the ViewTool service
        registerViewToolService( bundleContext, new UserAgentToolInfo() );


		
		Logger.info(this.getClass(), "Starting UserAgent Viewtool - $useragent");

	}

	public void stop(BundleContext context) throws Exception {

		unregisterViewToolServices();
		Logger.info(this.getClass(), "Stopping UserAgent Viewtool - $useragent");


	}

}