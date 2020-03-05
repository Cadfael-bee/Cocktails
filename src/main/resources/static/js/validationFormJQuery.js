const passwordRegExp = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$/;
const emailRegExp = /\S+@\S+\.\S+/;

$('#userName').change(function(){
	resetError($('#userName'));
	if (validateEmpty($(this)) && validateLength($(this), 3))
		markValid($(this));
});
$('#fName').change(function(){
	resetError($(this));
	if (validateEmpty($(this)) && validateLength($(this), 4))
		markValid($(this));
});
$('#lName').change(function(){
	resetError($(this));
	if (validateEmpty($(this)) && validateLength($(this), 4))
		markValid($(this));
});
$('#email').change(function(){
	resetError($(this));
	if (validateEmpty($(this)) && validateRegExp($(this), emailRegExp))
		markValid($(this));
});
$('#password').change(function(){
	resetError($(this));
	if (validateEmpty($(this)) && validateRegExp($(this), passwordRegExp))
		markValid($(this));
});
$('#confirmPassword').change(function(){
	resetError($(this));
	if ($(this).val() && $(this).val() === $('#password').val()) {
		markValid($(this));
	} else {
		showError($(this), "Passwords doesn't match.")
	}
});

function showError(element, message) {
	var invalidFeedback = element.parent().find('.invalid-feedback');
	invalidFeedback.text(message);
	element.addClass('is-invalid');
	element.removeClass('is-valid');
}

function resetError(element) {
	var invalidFeedback = element.parent().find('.invalid-feedback');
	element.removeClass('is-invalid');
	invalidFeedback.text("");
}

function markValid(element) {
	element.addClass('is-valid');
	element.removeClass('is-invalid');
}

function validateRegExp(field, regExp) {
	if (!regExp.test(field.val())) {
		showError(field, $(field).attr('placeholder') + " must be valid");
	}
	return regExp.test(field.val());
}

function validateEmpty(field) {
	if (!field.val()) {
		showError(field, $(field).attr('placeholder') + " shouldn't be empty.");
	}
	return field.val();
}

function validateLength(field, length) {
	if (field.val().length < length) {
		showError(field, $(field).attr('placeholder') + "  should be minimum "
				+ length + " symbols length.");
	}
	return !(field.val().length < length);
}
