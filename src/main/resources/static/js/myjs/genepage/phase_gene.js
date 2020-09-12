$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/phase/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });


    function succFunction(data) {
        var fun_arry = data["phaseSeperations"];
        $('#phase_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            data: fun_arry,
            columns: [
                {"data": "taxonomy"},
                {"data": "organism"},
                {"data": "assemblyAccession"},
                {"data": "geneId"},
                {"data": "proteinId"},
                {"data": "llr",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "coreScore",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "papaProp",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "papaFi",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "aaLength"},
                {"data": "disorderPercent",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "disorder30aaNum"},
                {"data": "disorder30aaLoc"},
                {"data": "disorder50aaNum"},
                {"data": "disorder50aaLoc"},
                {"data": "disorderSegmentNum"},
                {"data": "disorderSegmentLen"},
                {"data": "psCore",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }
});
