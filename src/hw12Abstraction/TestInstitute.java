package hw12Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.age = 40;
		columbiaUniversity.name = "Tasnim";
		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.lawInfo();
		columbiaUniversity.hygenic();
		//columbiaUniversity

MedicalSchool medicalSchool=new ColumbiaUniversity();
medicalSchool.macanicalLab();
medicalSchool.anatomyLab();
medicalSchool.biochemistryLab();

University university=new ColumbiaUniversity();
university.classSize();
university.gymnasium();
University.library();

RockefellerUniversity rockefellerUniversity=new RockefellerUniversity();
rockefellerUniversity.aronaticalInfo();
rockefellerUniversity.macanicalLab();
rockefellerUniversity.maths();


EngineeringSchool engineeringSchool=new RockefellerUniversity();
engineeringSchool.computerLab();
engineeringSchool.macanicalLab();

	}
}
