package com.dotcms.osgi.useragent.viewtool;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class UserAgentToolInfo extends ServletToolInfo {

    @Override
    public String getKey () {
        return "useragent";
    }

    @Override
    public String getScope () {
        return ViewContext.REQUEST;
    }

    @Override
    public String getClassname () {
        return UserAgentTool.class.getName();
    }

    @Override
    public Object getInstance ( Object initData ) {

    	UserAgentTool viewTool = new UserAgentTool();
        viewTool.init( initData );

        return viewTool;
    }

}