showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#protein_filters").show(500);
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
    $("#protein_filters").hide(500);

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

    $('#pro_gen_tax').val("").trigger("change");
    $("#pro_gen_org").val("").trigger("change");
    $("#pro_gen_ass").val("").trigger("change");
    $("#pro_gen_geneid").val("").trigger("change");
    $("#pro_gen_proid").val("").trigger("change");
});


$('#pro_geno_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_geno_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_geno_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_gen_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_gen_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
$('#pro_gen_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_gen_geneid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#pro_gen_proid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/proteinfeature/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
