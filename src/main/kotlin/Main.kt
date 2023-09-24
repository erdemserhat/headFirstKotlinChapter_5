fun main(args: Array<String>) {

    val myEmployee:Employee=Employee("Mike","Anelo",
        Email("Google","mike@gmail.com"),EducationStatus.PHD,EmployeePosition("Worker"),
        Department("IT"), arrayListOf(SocialMediaAccount("Facebook","mike1221"),
            SocialMediaAccount("Instagram","mike_ags")),Address("Turkey","Ankara","Kızılay",
                12))


    for(i in 0 until myEmployee.socialMediaAccount.size){
        println(myEmployee.socialMediaAccount.get(i).username)
    }

    val myEmployee1:SoftwareDeveloper=SoftwareDeveloper("java","Mike","Anelo",
        Email("Google","mike@gmail.com"),EducationStatus.PHD,EmployeePosition("Worker"),
        Department("IT"), arrayListOf(SocialMediaAccount("Facebook","mike1221"),
            SocialMediaAccount("Instagram","mike_ags")),Address("Turkey","Ankara","Kızılay",
            12))

    println(myEmployee1.work())

    val cat=Animal("1","2","3")
    val cat1=Animal("1","2")
    val ca2=Animal("1")



}