fun main(args: Array<String>) {

    val myEmployee:Employee=Employee("Mike","Anelo",
        Email("Google","mike@gmail.com"),EducationStatus.PHD,EmployeePosition("Worker"),
        Department("IT"), arrayListOf(SocialMediaAccount("Facebook","mike1221"),
            SocialMediaAccount("Instagram","mike_ags")),Address("Turkey","Ankara","Kızılay",
                12))


    for(i in 0 until myEmployee.socialMediaAccount.size){
        println(myEmployee.socialMediaAccount.get(i).username)
    }

}