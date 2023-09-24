import java.util.*

class Animal {
    constructor(param:String){
        this.param=param
    }
    constructor(param:String,param2:String):this(param){
        this.param2=param2
    }

    constructor(param:String,param2:String,param3:String):this(param,param2){
        this.param3=param3
    }
    var param:String? = null
        get() {return field}
        set(value) {field=value}
    var param2:String?= null
        get() = field
        set(value) {field=value}

    var param3:String?=null
        get() = field
        set(value) {field=value}




}
