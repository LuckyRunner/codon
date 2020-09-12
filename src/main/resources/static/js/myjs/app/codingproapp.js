var Codingproapp = function () {
    var handlerInitCodingproTables = function (url, columns) {
        var _codingproTable = $("#codingPro_table").DataTable({
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
        return _codingproTable;
    };
    var handlerInitCodingproGTables = function (url, columns) {
        var _codingproGTable = $("#codingProG_table").DataTable({
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
        return _codingproGTable;
    };


    return {

        initCodingproTables: function (url, columns) {
            return handlerInitCodingproTables(url, columns);
        },
        initCodingproGTables: function (url, columns) {
            return handlerInitCodingproGTables(url, columns);
        }

    }
}();
