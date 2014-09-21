Not Found Services Web
==========
[![Build Status](https://travis-ci.org/tmoreira2020/liferay-thiagomoreira-plugins.svg?branch=master)](https://travis-ci.org/tmoreira2020/liferay-thiagomoreira-plugins)

Service used to store the keywords that returned zero results in a search operation. The service is composed by two sub projects:

* not-found-services-web-service = contains the public API it don't need to be imported by your application the best practice is use the Liferay's MessageBus to interact with the service.
* not-found-services-web-impl = contains the real implementation of the service.

### How to use?

First of all you need to deploy the **not-found-services-web-impl-1.2.0.0.war** in your servlet container. The second is step is create a asynchronous call to the Liferay's MessageBus like the one below. That's it.

```java
List results = ...

if (results.isEmpty()) {
	Message message = new Message();

	message.put("className", className);
	message.put("keywords", keywords);
	message.put("serviceContext", ServiceContextThreadLocal.getServiceContext());

	MessageBusUtil.sendMessage("thiagomoreira/notfound", message);
}
```

### License

Not Found Services Web is licensed under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) license.

### Maven/Gradle

Not Found Services Web is available on Maven central, the artifact is as follows:

Maven:

```xml
<dependency>
    <groupId>br.com.thiagomoreira.liferay.plugins</groupId>
    <artifactId>not-found-services-web</artifactId>
    <version>1.2.0.0</version>
</dependency>
```
Gradle:

```groovy
dependencies {
    compile(group: "br.com.thiagomoreira.liferay.plugins", name: "not-found-services-web", version: "1.2.0.0");
}
```
### Support
Not Found Services Web tracks [bugs and feature requests](https://github.com/tmoreira2020/liferay-thiagomoreira-plugins/issues) with Github's issue system. Feel free to open your [new ticket](https://github.com/tmoreira2020/liferay-thiagomoreira-plugins/issues/new)!

### Roadmap
* Develop an admin portlet to list and purge the data.


### Contributing

Not Found Services Web is a project based on Maven to improve it you just need to fork the repository, clone it and from the command line invoke

```shell
mvn package
```
After complete your work you can send a pull request to incorporate the modifications.

Enjoy!