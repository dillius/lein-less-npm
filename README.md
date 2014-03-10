# less-css-npm

A simple Leiningen plugin to make use of the NPM LESS compiler.

## Usage

Put `[less-css-npm "0.1.0"]` into the `:plugins` vector of your project.clj.

Specify the input LESS file with the project key `:less-in`.
Specify the output CSS file with the project key `:less-out`.

To run manually:

    $ lein less-css-npm

This task will also run automatically hooked into the Leiningen compile task.
