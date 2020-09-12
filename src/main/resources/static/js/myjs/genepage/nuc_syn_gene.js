$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/synnuccop/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var fun_arry = data["nucleotideCopSyno"];
        $('#synnuccom_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering:false,
            // scrollX:true,
            // AutoWidth:true,
            data: fun_arry,
            columns: [
                {"data": "t3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "c3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "a3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "g3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }
});
