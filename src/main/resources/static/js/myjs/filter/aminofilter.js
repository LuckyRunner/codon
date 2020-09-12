showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#amino_filters").show(500);
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
    $("#amino_filters").hide(500);
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

    $('#aminoTax1_select2').val("").trigger("change");
    $("#aminoOrg1_select2").val("").trigger("change");
    $("#aminoAss1_select2").val("").trigger("change");
    $("#aminoGen1_select2").val("").trigger("change");
    $("#aminoPro1_select2").val("").trigger("change");
});


$('#aminoTax_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoOrg_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoAss_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoTax1_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoOrg1_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoAss1_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoGen1_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#aminoPro1_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/amino/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

