@Stories
Feature: Search for song on youtube page
  As a user
  Want to enter the Youtube page
  To search and play a song

@scenario1
  Scenario: Select a song randomly
    Given That the user enters the youtube page
    When The user clicks on the search bar and types a song
    Then The user looks and selects the correct song