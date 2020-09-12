var Aminoapp = function () {

    var handlerInitaminoTables = function (url, columns) {
        var _aminoTable = $("#amino_table").DataTable({
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
            "ajax": {
                "url": url
            },
            "columns": columns
        });
        return _aminoTable;
    };
    var handlerInitaminoGTables = function (url, columns) {
        var _aminoGTable = $("#aminoG_table").DataTable({
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
            "ajax": {
                "url": url
            },
            "columns": columns
        });
        return _aminoGTable;
    };


    return {
        initMinoTables: function (url, columns) {
            return handlerInitaminoTables(url, columns);
        },

        initMinoGTables: function (url, columns) {
            return handlerInitaminoGTables(url, columns);
        }
    }
}();

