showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#browse_filters").show(500);
    $("#result").removeClass("col-md-12");
    $("#result").addClass("col-md-9")
    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
        //当切换tab时，强制重新计算列宽
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );

    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

};

hideFilter = function () {

    $("#showF").hide();
    $("#hideF").show();
    $("#browse_filters").hide(500);
    $("#result").removeClass("col-md-9");
    $("#result").addClass("col-md-12")

    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
        //当切换tab时，强制重新计算列宽
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );

    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

};


$('#reset').on('click', function() {

    $('#browse_tax_gen').val("").trigger("change");
    $("#browse_org_gen").val("").trigger("change");
    $("#browse_ass_gen").val("").trigger("change");
    $("#browse_geni_gen").val("").trigger("change");
    $("#browse_genn_gen").val("").trigger("change");
    $("#browse_proi_gen").val("").trigger("change");
    $("#browse_prn_gen").val("").trigger("change");
    $("#browse_quality_gen").val("").trigger("change")
});

$('#browse_tax_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#browse_org_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
$('#browse_ass_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#browse_geni_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#browse_genn_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/genename',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#browse_proi_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#browse_prn_gen').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/browse/proteinname',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

