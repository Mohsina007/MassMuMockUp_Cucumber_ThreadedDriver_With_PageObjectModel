Feature: MassMutual Exercise1  values Page Functionality

  Background:
    Given As a validated user
    When Navigate to the url
    Then Exercise_one values page should show

  Scenario Outline: 1. Validate right number of values appear on the screen

   Then  Input Field values "<FieldValueObjectID>" are displayed as expected values on the screen with Currency as US Dollar "<ValuesExpecdted>"

    Examples:
      |FieldValueObjectID |ValuesExpecdted|
      |txt_val_1          | $122,365.24   |
      |txt_val_2          | $599.00       |
      |txt_val_4          | $850,139.99   |
      |txt_val_5          | $23,329.50    |
      |txt_val_6          | $566.27       |


  Scenario Outline: 2. validate values on the screen are greater than 0

    Then  Input Field "<ObjectID>" values are greater than zero against expected values "<ValuesExpected>"

    Examples:
      |ObjectID |ValuesExpected|
      |txt_val_1| 122,365.24  |
      |txt_val_2| 599.00      |
      |txt_val_4| 850,139.99  |
      |txt_val_5| 23,329.50   |
      |txt_val_6| 566.27      |


  Scenario: 3. validate total balance is correct based on the values listed on the screen

    When  Add all input field values based on the screen
    Then  verify total balance is correct


  Scenario Outline: 4. validate values are formattd as currencies

    Then Identifying WebElement for values "<ObjectID>" to validate currency format

    Examples:
      |ObjectID |
      |txt_val_1|
      |txt_val_2|
      |txt_val_4|
      |txt_val_5|
      |txt_val_6|


  Scenario: 5. validate total balance match with the sum of the values
    When  Add all input field values based on the screen
    Then  verify total balance is correct

