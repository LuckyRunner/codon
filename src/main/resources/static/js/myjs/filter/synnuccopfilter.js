showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#syn_filters").show(500);
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
    $("#syn_filters").hide(500);

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

    $('#syn_gen_tax').val("").trigger("change");
    $("#syn_gen_org").val("").trigger("change");
    $("#syn_gen_ass").val("").trigger("change");
    $("#syn_gen_genid").val("").trigger("change");
    $("#syn_gen_poroid").val("").trigger("change");

});


$('#syn_geno_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_geno_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_geno_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_gen_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_gen_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_gen_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_gen_genid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#syn_gen_poroid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/synnuccop/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

