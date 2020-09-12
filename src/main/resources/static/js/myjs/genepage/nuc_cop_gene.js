$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/nucleotidecop/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });


    function succFunction(data) {
        var fun_arry = data["nucleotideCop"];
        $('#nuccom_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            // scrollX: true,
            // AutoWidth: true,
            data: fun_arry,
            columns: [
                {"data": "length"},
                {"data": "gc",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc1",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag1",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc2",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag2",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc3",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag3",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }
});