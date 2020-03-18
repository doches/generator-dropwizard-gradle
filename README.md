# generator-dropwizard-gradle

This is a [Yeoman](http://yeoman.io/) generator that scaffolds out an API service backed by Java 8 and Dropwizard, using Gradle as a build system
and for dependency manager.

## Getting Started

Install Yeoman via npm:

    $ npm install -g yo

Once you've got Yeoman set up, install this generator:

    $ npm install -g generator-dropwizard-gradle

Create the directory in which your new project will live, then call Yeoman to scaffold out your project:

    $ mkdir awesome
    $ cd awesome
    $ yo dropwizard-gradle

Answer a couple of easy questions, and you'll be greeted with a ready-to-rock project. Open the directory up in your Java IDE of choice (I like [IDEA](https://www.jetbrains.com/idea/)), import the project as a Gradle project, and you're good to go.

### Running

You can start your server for testing like so:

    ./gradlew run

This will start the server with the configuration file at:

    <project>-distribution/src/dev/var/conf/server.yml

And the keystore / truststores at:

    <project>-distribution/src/standard/var/conf


### Shipping

Wow, that was fast! Once you're ready to deploy, run:

    $ ./gradlew distZip

from the root of the project, and you'll receive a handy deployable .zip with all of your Java dependencies and runtime configuration:

    $ ls awesome-distribution/build/distributions/
    $ awesome-distribution-0.0.0.zip

Use git flow and you'll get automatically-sane version tags on your deployable artefacts, too. Ship that .zip onto your server, unzip it, and start your service as you would any Dropwizard server:

    $ unzip awesome-distribution-0.0.0.zip
    $ cd awesome-distribution-0.0.0
    $ ./bin/awesome-distribution server var/conf/server.yml

Hit up your server in a browser ([http://localhost:8000/](http://localhost:8000/) by default), and you should see your shiny new application, live and ready to go.
