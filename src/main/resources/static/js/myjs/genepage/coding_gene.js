$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/codpot/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var fun_arry = data["codingPotential"];
        $('#codingPro_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering:false,
            data: fun_arry,
            columns: [
                {"data": "fickettScore",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "cpc2CodingProbability",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "cpc2Label", render: function(value,row,index){
                        return value.replace(value[0],value[0].toUpperCase());
                    }},
                {"data": "lgcCodingProbability",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "lgcLabel"}
            ]
        });
    }
});
