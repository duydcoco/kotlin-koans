package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean{
//    val contains42:(Int)->Boolean={x->x%42==0}
//    var x = 0
//    for(item in collection){
//        if(contains42(item)){
//            x+=1
//        }
//    }
//    if(x>0){
//        return true
//    }else{
//        return false
//    }


//    val contains42:(Int)->Boolean={x->x%42==0}
//    return collection.filter(contains42).isEmpty().not()

//    return collection.filter(){x->x%42==0}.isNotEmpty()

//    return collection.filter{x->x%42==0}.isNotEmpty()

    return collection.filter{it%42==0}.isNotEmpty()
}




