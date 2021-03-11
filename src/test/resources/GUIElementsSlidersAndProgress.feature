Feature: I`m demonstrating how I work with Sliders and Progress

  Background:
    Given GUIElements SlidersAndProgress. Navigate to Sliders and Progress


  Scenario: Move horizontal Slider
    And GUIElements SlidersAndProgress. Move grey horizontal Slider from "15" to "78"
    And GUIElements SlidersAndProgress. Move red horizontal Slider from "55" to "5"
    # hepl needed. it works not like supposed to

  Scenario: Move vertical Slider
    And GUIElements SlidersAndProgress. Move grey vertical sliders from "17.5" to "90"
    And GUIElements SlidersAndProgress. Move red vertical sliders from "90" to "10"


  Scenario: Move Slider range
    And GUIElements SlidersAndProgress. Change Grey slider range: buttom from "150" to "50" and top from "600" to "900"
# Ask about this test^^

