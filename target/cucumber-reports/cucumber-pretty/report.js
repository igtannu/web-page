$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Drag_Drop.feature");
formatter.feature({
  "line": 1,
  "name": "Drag and Drop Feature",
  "description": "I want to use this Feature as fig Dropped",
  "id": "drag-and-drop-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Drag and Drop Feature",
  "description": "",
  "id": "drag-and-drop-feature;drag-and-drop-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tests"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open Emulator and App",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Views and Drag_Drop",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Drag First circle to Second",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Sucessfully Dropped and get it Written",
  "keyword": "Then "
});
formatter.match({
  "location": "Hide_Show_Animation_Steps.open_Emulator_and_App()"
});
formatter.result({
  "duration": 10158061900,
  "status": "passed"
});
formatter.match({
  "location": "Drag_Drop_Steps.click_on_Views_and_Drag_Drop()"
});
formatter.result({
  "duration": 3347078000,
  "status": "passed"
});
formatter.match({
  "location": "Drag_Drop_Steps.drag_First_circle_to_Second()"
});
formatter.result({
  "duration": 3477726400,
  "status": "passed"
});
formatter.match({
  "location": "Drag_Drop_Steps.sucessfully_Dropped_and_get_it_Written()"
});
formatter.result({
  "duration": 75340600,
  "status": "passed"
});
});