// script.js
$(document).ready(function() {
    $('#ajaxButton').click(function() {
        var number1 = $('#number1').val();
        var number2 = $('#number2').val();

        $.ajax({
            type: 'POST',
            url: '/calculate',
            data: {
                number1: number1,
                number2: number2
            },
            success: function(response) {
                alert('Average: ' + response);
            },
            error: function() {
                alert('Error occurred.');
            }
        });
    });
});
