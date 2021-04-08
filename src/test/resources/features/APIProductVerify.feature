Feature: 

	@G24-175
	Scenario: API Product Verify
		  Given no headers are provided
		  When User send request to baseURL
		  And Response status code should be 200
		And  header should have content Type / application/json
		And In body product name should be "Short-sleeve sweater in textured stripe"
		Then In body product code should be "AX560"