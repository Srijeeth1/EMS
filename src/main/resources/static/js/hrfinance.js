document.getElementById('nextButton').addEventListener('click', function() {
  // Get input values
  var empid = document.getElementById('empid').value;
  var accountNum = document.getElementById('accountNum').value;
  var pancard = document.getElementById('pancard').value;
  var hrname = document.getElementById('hrname').value;
  var ifscCode = document.getElementById('ifscCode').value;

  // Regular expressions
  var accountNumRegex = /^\d{9,18}$/; // 9 to 18 digits
  var pancardRegex = /[A-Z]{5}[0-9]{4}[A-Z]{1}/; // 5 uppercase letters, 4 digits, and 1 uppercase letter
  var ifscCodeRegex = /^[A-Z]{4}0[A-Z0-9]{6}$/; // 4 letters followed by 0 and 6 alphanumeric characters

  // Validation
  var valid = true;

  if (!accountNumRegex.test(accountNum)) {
    document.getElementById('accountNumError').textContent = 'Invalid Bank Account Number';
    valid = false;
  } else {
    document.getElementById('accountNumError').textContent = '';
  }

  if (!pancardRegex.test(pancard)) {
    document.getElementById('pancardError').textContent = 'Invalid PAN Card Number';
    valid = false;
  } else {
    document.getElementById('pancardError').textContent = '';
  }

  if (ifscCode && !ifscCodeRegex.test(ifscCode)) {
    document.getElementById('ifscCodeError').textContent = 'Invalid IFSC Code';
    valid = false;
  } else {
    document.getElementById('ifscCodeError').textContent = '';
  }

  // If all fields are valid, proceed to the next step
});