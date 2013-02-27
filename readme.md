# Maven Archetype to create an Ant-based Maven Plugin

## Current status

It's building, but generation from the maven-invoker-plugin is problematic.

## groupId

Now, I'm being slightly rude by using the apache groupId, I'm doing it in the hope they'll pick this up and integrate it.

## artifactId

How does it sound? I'm trying to follow the pattern of the existing Apache Maven archetypes...

Please comment at [the forum](https://github.com/genthaler/maven-archetype-ant-plugin/issues).

## Real Ant-based plugins

Some of the integration tests will create actual usable plugins, which perhaps should also go into Central. The first integration test is creating a touch-ant-maven-plugin.

