var pos_fix = function (a) {
    $(document).scrollTop($(a).offset().top-60)
};

window.onscroll = function(){
    var t = document.documentElement.scrollTop || document.body.scrollTop;
    var top_div = 203 -t;
    if( t >= 203 ) {
        document.getElementById('nav_scroll').style.marginTop="0px";
        $('#nav_scroll').css('width','1200px')
    }
    else {
        document.getElementById('nav_scroll').style.marginTop= top_div + "px";
        $('#nav_scroll').css('width','1170px')
    }
};