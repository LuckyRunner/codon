showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#coding_filters").show(500);
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
    $("#coding_filters").hide(500);
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

    $('#codpro_gen_tax').val("").trigger("change");
    $("#codpro_gen_org").val("").trigger("change");
    $("#codpro_gen_ass").val("").trigger("change");
    $("#codpro_gen_genid").val("").trigger("change");
    $("#codpro_gen_proid").val("").trigger("change");
    $("#codpro_gen_cpc2").val("-1").trigger("change");
    $("#codpro_gen_lgc").val("-1").trigger("change");
});

$('#codpro_geno_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codpro_geno_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codpro_geno_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codpro_gen_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codpro_gen_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
$('#codpro_gen_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codpro_gen_genid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
$('#codpro_gen_proid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codpot/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
