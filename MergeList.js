var mergeTwoLists = function(list1, list2) {
    let merge=[]
    merge=list1.concat(list2)
    result=merge.sort()
    return result
};
let list1 = [1,2,4]
let list2 = [1,3,4]
let res=mergeTwoLists(list1,list2)
console.log(res)