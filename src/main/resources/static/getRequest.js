
GET: $(document).ready(
    function ajaxGet() {
        $.ajax({
            type : "GET",
            url : "getEntries",
            success : function(result) {
                if (result.status == "success") {
                    $('#getResultDiv ul').empty();
                    var custList = "";
                    $.each(result.data,
                        function(i, entry) {
                            var user = entry.text + "<br>";
                            $('#getResultDiv .list-group').append(
                                user)
                        });
                    console.log("Success: ", result);
                } else {
                    $("#getResultDiv").html("<strong>Error</strong>");
                    console.log("Fail: ", result);
                }
            },
            error : function(e) {
                $("#getResultDiv").html("<strong>Error</strong>");
                console.log("ERROR: ", e);
            }
        });
    })
    // ajaxGet();
