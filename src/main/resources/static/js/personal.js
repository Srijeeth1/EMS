
  const mobile = document.querySelector('#mobile');
  const mobileError = document.querySelector('#mobile-error');
  const emergencyContact = document.querySelector('#emergencyContact');
  const emergencyContactError = document.querySelector('#emergencyContact-error');
  const aadharCard = document.querySelector('#aadharCard');
  const aadharCardError = document.querySelector('#aadharCard-error');

  function validateForm() {
    let isValid = true;
console.log("help");
    if (!/^\d{10,12}$/.test(mobile.value)) {
      mobileError.textContent = 'Please enter a valid mobile number.';
      mobileError.style.color = 'red';
      isValid = false;
    } else {
      mobileError.textContent = '';
    }

    if (!/^\d{10,12}$/.test(emergencyContact.value)) {
      emergencyContactError.textContent = 'Please enter a valid contact number.';
      emergencyContactError.style.color = 'red';
      isValid = false;
    } else {
      emergencyContactError.textContent = '';
    }

    if (!/^\d{12}$/.test(aadharCard.value)) {
      aadharCardError.textContent = 'Please enter a valid Aadhar Card number.';
      aadharCardError.style.color = 'red';
      isValid = false;
    } else {
      aadharCardError.textContent = '';
    }

    return isValid;
  }

document.querySelector('form').addEventListener('submit', (e) => {
  if (!validateForm()) {
    e.preventDefault(); // Prevent form submission if validation fails
  }
  });
