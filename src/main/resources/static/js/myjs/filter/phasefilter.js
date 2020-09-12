showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#phase_filters").show(500);
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
    $("#phase_filters").hide(500);
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

    $('#phaseTax_select2').val("").trigger("change");
    $("#phaseOrg_select2").val("").trigger("change");
    $("#phaseAss_select2").val("").trigger("change");
    $("#phaseGen_select2").val("").trigger("change");
    $("#phasePro_select2").val("").trigger("change");
});


$('#phaseTax_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/phase/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#phaseOrg_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/phase/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#phaseAss_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/phase/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#phaseGen_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/phase/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#phasePro_select2').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/phase/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

