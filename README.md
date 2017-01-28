How to use Vaadin Overlays with CUBA Platform
=============================================

Prerequisites
-------------

Vaadin Overlays for Vaadin 7.6: https://github.com/Haulmont/vaadin-overlays

Demo: http://sami.virtuallypreinstalled.com/overlays/

Integration
-----------

1. Vaadin Overlays overlays-1.1.3.jar added to modules/web/lib
2. Added Maven dependency to web module

        compile(files("${project.projectDir}/lib/overlays-1.1.3.jar"))

3. Styles are defined in halo-ext.scss
4. See demo in ExtAppMainWindow class