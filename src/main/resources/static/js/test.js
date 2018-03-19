/**
 * Created by x on 2018/3/19.
 */
var Test=function(){

    var a = function(){
        console.log("项目路径:"+basePath);
        $("#l").click(function(){
            $.ajax({
                url:basePath+"/testController/test",
                method:'get',
                dataType:'json',
            })
        })
    }

    return{
        init:function(){
           a();
        }
    }
}();