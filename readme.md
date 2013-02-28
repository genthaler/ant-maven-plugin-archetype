# Maven Archetype to create an Ant-based Maven Plugin

## Current status

It works as an archetype. If you want to do so, and don't mind having to hack the generated project (more than I hope will be necessary once I'm done), just ignore (comment out) the integration tests.

## groupId

Now, I'm being slightly rude by using the apache groupId. I'm doing it in the hope they'll pick this up and integrate it.

## artifactId

How does it sound? I'm trying to follow the pattern of the existing Apache Maven archetypes...

Please comment at [the forum](https://github.com/genthaler/maven-archetype-ant-plugin/issues).

## Real Ant-based plugins

Some of the integration tests will create actual usable plugins, which perhaps should also go into Central. The first integration test is creating a touch-ant-maven-plugin.