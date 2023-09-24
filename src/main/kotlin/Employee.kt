open class Employee(
    var name: String, var surname: String,
    var  email: Email,var educationStatus: EducationStatus,
    var position: EmployeePosition,var department: Department,
    var socialMediaAccount: ArrayList<SocialMediaAccount>,
    var address: Address
) {

    open fun work(){
        println("worked.")
    }


}