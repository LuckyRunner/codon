$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/proteinfeature/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var fun_arry = data["proteinFeature"];
        $('#protein_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering:false,
            data: fun_arry,
            columns: [
                {"data": "mw",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "sa",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "rv",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "kdhydrophobicity",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "wwhydrophobicity",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "hhhydrophobicity",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "positive",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "negative",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "neutral",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "alpha",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "beta",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}

            ]
        });
    }
});
