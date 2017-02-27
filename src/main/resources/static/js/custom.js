var saved_author = undefined;
var saved_items_per_page = 0;

$('#search').click(function () {
    var name = $('#author-name').val();
    var data = {name: name};
    saved_author = data;
    console.log('request ==> ' + JSON.stringify(data));
    sendRequest(data);

});

function loadPage(button) {
    var clicked_page = $(button).html();
    saved_author.start = (clicked_page - 1) * saved_items_per_page;
    saved_author.count = saved_items_per_page;
    sendRequest(saved_author);
}

function sendRequest(author) {
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        dataType: 'json',
        url: '/scopus/search/author',
        data: JSON.stringify(author),
        beforeSend: function () {
            $('#progress').show();
            $('#works').empty();
            $('#page-buttons').empty();
        },
        success: function (response) {
            setPageButtons(response);
            setDataInTable(response);
        },
        complete: function () {
            $('#progress').hide();
        }
    });
}


function setPageButtons(response) {
    var total = response["opensearch:totalResults"];
    var items_per_page = response["opensearch:itemsPerPage"];
    var count_of_pages = total / items_per_page;
    saved_items_per_page = items_per_page;

    console.log("total ==> " + total);
    console.log("items_per_page ==> " + items_per_page);
    console.log("count_of_pages ==> " + count_of_pages);

    for (var i = 0; i < count_of_pages; i++) {
        $('#page-buttons').append('<button type="button" onclick="loadPage(this)"' +
            ' class="btn btn-default">' + (i + 1) + '</button>');
    }
}

function setDataInTable(response) {
    $('#works').append('<div class="row">' +
        '<div class="col-xs-2">creator</div>' +
        '<div class="col-xs-4">publication name</div>' +
        '<div class="col-xs-4">title</div>' +
        '<div class="col-xs-2">cover date</div>' +
        '</div>');

    response.entry.forEach(function (entry) {
        $('#works').append('<div class="row my-row">' +
            '<div class="col-xs-2">' + entry["dc:creator"] + '</div>' +
            '<div class="col-xs-4">' + entry["prism:publicationName"] + '</div>' +
            '<div class="col-xs-4">' + entry["dc:title"] + '</div>' +
            '<div class="col-xs-2">' + entry["prism:coverDate"] + '</div>' +
            '</div>');
    });
}