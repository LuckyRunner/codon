var Browseapp = function () {

    var handlerInitSpeciesTables = function (url, columns) {
        var _speciesTable = $("#species_table").DataTable({
            "paging":true,//是否假分页
            "info": true,//左下角的信息
            "lengthChange":false,//左上角的每页显示数目
            "aLengthMenu": [10, 25, 50, 100],
            "ordering":true,//是否允许排序
            "searching":false,//是否允许搜索
            "deferRender":true,//延迟渲染，提高初始化速度
            "autoWidth"   : false,
            "scrollX" : true,
            "bProcessing": false,
            "bServerSide": true,
            "destroy": true,
            "oLanguage": {
                "sZeroRecords": "Sorry， no data available",
                "sInfoEmpty": "",
                "sSearch": ""
            },
            "ajax": {
                "url": url
            },
            "columns": columns
        });
        return _speciesTable;
    };
    var handlerInitGeneTables = function (url, columns) {
        var _geneTable = $("#gene_table").DataTable({
            "paging":true,//是否假分页
            "info":false,//左下角的信息
            "lengthChange":false,//左上角的每页显示数目
            "aLengthMenu": [10, 25, 50, 100],
            "ordering":false,//是否允许排序
            "searching":false,//是否允许搜索
            "deferRender":true,//延迟渲染，提高初始化速度
            "autoWidth"   : false,
            "scrollX" : true,
            "bProcessing": false,
            "bServerSide": true,
            "destroy": true,
            "oLanguage": {
                "sZeroRecords": "Sorry， no data available",
                "sInfoEmpty": "",
                "sSearch": ""
            },
            "ajax": {
                "url": url
            },
            "columns": columns
        });
        return _geneTable;
    };


    return {
        initSpeciesTables: function (url, columns) {
            return handlerInitSpeciesTables(url, columns);
        },

        initGeneTables: function (url, columns) {
            return handlerInitGeneTables(url, columns);
        }
    }
}();

