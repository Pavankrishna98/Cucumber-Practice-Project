Feature: functional testing
	
	@retest
  @smoketest
  Scenario: smoke testing
    Given open browser for ex:firefox

  @realtest
  Scenario: real testing
    Given open url of facebook for test

  @retest
  Scenario: re testing
    Given enter username into resp. field

	
  @regressiontest
  Scenario: regression testing
    Given enter password into resp. field

	@regressiontest
  @sanitytest
  Scenario: sanity testing
    Given click login button to go further
