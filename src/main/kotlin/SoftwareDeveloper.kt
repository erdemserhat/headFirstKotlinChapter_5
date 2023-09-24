class SoftwareDeveloper(var usedProgrammingLanguage:String,
                        name: String,
                        surname: String,
                        email: Email,
                        educationStatus: EducationStatus,
                        position: EmployeePosition,
                        department: Department,
                        socialMediaAccount: ArrayList<SocialMediaAccount>,
                        address: Address
): Employee(name, surname, email, educationStatus, position, department, socialMediaAccount, address),Workable {


    override fun work() {
        println("bb")
    }

    override fun getSalary() {
        TODO("Not yet implemented")
    }
}