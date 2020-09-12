var Phaseapp = function () {

    var handlerInitphaseTables = function (url, columns) {
        var _phaseTable = $("#phase_table").DataTable({
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
        return _phaseTable;
    };
    var handlerInitphaseGTables = function (url, columns) {
        var _phaseGTable = $("#phaseG_table").DataTable({
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
        return _phaseGTable;
    };


    return {
        initPhaseTables: function (url, columns) {
            return handlerInitphaseTables(url, columns);
        },

        initPhaseGTables: function (url, columns) {
            return handlerInitphaseGTables(url, columns);
        }
    }
}();

