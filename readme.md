# Maven Archetype to create an Ant-based Maven Plugin

## Current status

It's working! You can now use it to generate a simple Ant-based plugin with a correspondingly simple integration test.

I can't guarantee right now that the generated project will cleanly execute the integration tests; the invoker plugin does some funky things that might cause the integration tests to fail standalone. That's the next thing on my list.

## groupId

Now, I'm being slightly rude by using the apache groupId. I'm doing it in the hope they'll pick this up and integrate it.

## artifactId

How does it sound? I'm trying to follow the pattern of the existing Apache Maven archetypes...

Please comment at [the forum](https://github.com/genthaler/maven-archetype-ant-plugin/issues).

## Links

* [Maven - Guide to Developing Ant Plugins](http://maven.apache.org/guides/plugin/guide-ant-plugin-development.html)
* [Maven Plugin Plugin - Writing an Ant Maven Plugin](http://maven.apache.org/plugin-tools/maven-plugin-plugin/examples/ant-mojo.html)
* [4.4. Creating an Ant Maven Plugin _ Documentation Sonatype.com](http://www.sonatype.com/books/mcookbook/reference/ch04s04.html)
* [Maven - Developers centre - Testing Plugins Strategies](http://maven.apache.org/plugin-developers/plugin-testing.html)
* [Maven - Guide to Developing Java Plugins](http://maven.apache.org/guides/plugin/guide-java-plugin-development.html)
* [MaestroDev | Developing your First Mojo](http://www.maestrodev.com/better-builds-with-maven/developing-custom-maven-plugins/developing-your-first-mojo/)
* [Maven Plugin Plugin - Introduction.html](http://maven.apache.org/plugin-tools/maven-plugin-plugin)
[Maven Archetype Plugin](http://maven.apache.org/archetype/maven-archetype-plugin)
* [Touch Ant Task](http://ant.apache.org/manual/Tasks/touch.html)  (used in the integration test)
