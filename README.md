plugins-dotcms-oauth
====================

This is an osgi plugin that provides an example of single sign-on using OAuth2.  This intended to be a drop in replacement for the standard dotcms login, both for front end users and for backend users and effectivly disables the out of the box authentication.  This plugin is provided as a code example and should not be used in a production environment without careful understanding of what the code does.

It provides an example Google and a Facebook implementation. 
* https://developers.google.com/accounts/docs/OAuth2
* https://developers.facebook.com/docs/facebook-login/v2.1



## Building
To download and build,clone the repo, cd into the cloned directoy and run
```
git clone https://github.com/dotCMS/plugin-dotcms-oauth.git
cd ./plugin-dotcms-oauth
MAKE CONFIG CHANGES
./gradlew jar
```
 the plugin will be built under ./build/lib

## Using
To use this plugin, you will need to have a developer account with the providers (Google, Facebook) and a application registered with the providers.  In each application, make sure you: 
* Authorize the application scopes required by the plugin
* Authorize the Callback host to receive the callback.
* Copy the application API key and API secret and set them in the oauth.properties file.

See the oauth.properties for the required scopes.

This plugin "rewrites" the urls Dotcms uses to login (both front and backend) and points them to the OAuth provider specified.  You can see and or add/delete/modify these "rewrites" in the Activator class here.  

https://github.com/dotCMS/plugin-dotcms-oauth/blob/master/src/main/java/com/dotcms/osgi/oauth/Activator.java

If you want to avoid using oauth and authenticate via the standard Dotcms authentication, you can pass the url parameter native=true like this:

````
http://localhost:8080/html/portal/login.jsp?native=true 
````
or 
````
http://localhost:8080/dotCMS/login?native=true 
````


## OSGi Exports
Below is a list of exports that are required by this plugin
```
org.apache.velocity.tools.view.tools,
org.apache.velocity.tools.view.servlet,
org.apache.velocity.tools.view,
javax.xml.bind,
com.liferay.portal.util,
com.liferay.portal.model,
com.liferay.portal.auth,
com.dotmarketing.viewtools,
com.dotmarketing.util.json,
com.dotmarketing.util,
com.dotmarketing.osgi,
com.dotmarketing.filters,
com.dotmarketing.exception,
com.dotmarketing.cms.login.factories,
com.dotmarketing.cms.factories,
com.dotmarketing.business,
```


