Feature: Wikipedia search functionality and verifications

  #WSF-45234--> potential jira ticket number

  Scenario:Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title


  Scenario:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @scenarioOutline
  Scenario Outline:Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header


    Examples: search values we are going to be using in this scenario is as below
      | searchValue      | expectedTitle    | expectedMainHeader |
      | Fernando Muslera | Fernando Muslera | Fernando Muslera   |
      | Sacha Boey       | Sacha Boey       | Sacha Boey         |
      | Mauro Icardi     | Mauro Icardi     | Mauro Icardi       |
      | Juan Mata        | Juan Mata        | Juan Mata          |
      | Kerem Aktürkoğlu | Kerem Aktürkoğlu | Kerem Aktürkoğlu   |
      | Lucas Torreira   | Lucas Torreira   | Lucas Torreira     |
      | Victor Nelsson   | Victor Nelsson   | Victor Nelsson     |


    #TC#3: Wikipedia Search Functionality Header Verification
    #1. User is on Wikipedia home page
    #2. User types Steve Jobs in the wiki search box
    #3. User clicks wiki search button
    #4. User sees Steve Jobs is in the main header
    #Note: Follow POM
    #TC#4: Wikipedia Search Functionality Image Header Verification
    #1. User is on Wikipedia home page
    #2. User types Steve Jobs in the wiki search box
    #3. User clicks wiki search button
    #4. User sees Steve Jobs is in the image header
    #Note: Follow POM