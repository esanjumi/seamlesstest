# seamlesstest

// Test of a QA role.

Question 1: Write a test script to test valid log in.
Steps:
1. Click “Form Authentication”
2. Enter tomsmith for the username and SuperSecretPassword! for the password
3. Assert the success message “You logged into a secure area!”
Question 2: Write a test script for invalid log in
Steps:
1. Load url
2. Click “Form Authentication”
3. Enter thomas for the username and SecretPassword! for the password
4. Assert the error message “Your username is invalid!”
