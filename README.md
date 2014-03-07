# less-css-npm

A simple Leiningen plugin to make use of the NPM LESS compiler.

## Usage

FIXME: Use this for user-level plugins:

Put `[less-css-npm "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
less-css-npm 0.1.0-SNAPSHOT`.

Use this for project-level plugins:

Put `[less-css-npm "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

Specify the input LESS file with the project key `:less-in`.
Specify the output CSS file with the project key `:less-out`.

To run manually:

    $ lein less-css-npm

This task will also run automatically hooked into the Leiningen compile task.
