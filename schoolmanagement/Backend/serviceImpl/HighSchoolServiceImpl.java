package com.example.PROJECT.serviceImpl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import com.example.PROJECT.entity.HighSchool;
import com.example.PROJECT.repository.HighSchoolRepository;
import com.example.PROJECT.services.HighSchoolAction;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;

@Service // buisness logic, bean --> studentServiceImpl
public class HighSchoolServiceImpl implements HighSchoolAction {
	 @Autowired
	private EmailService emailService;

	@Autowired
	private HighSchoolRepository schlrepo;
	private String str;
	

	@Override
	public List<HighSchool> readAllSchoolFromDb() {
		// TODO Auto-generated method stub
		return schlrepo.findAll();
	}

	@Override
	public HighSchool addSchoolDetails(HighSchool schoolObj) {
		// TODO Auto-generated method stub
		return schlrepo.save(schoolObj);
	}

	public HighSchool readSchoolFromDb(int schoolId) {
		java.util.Optional<HighSchool> studentObjFromDb = schlrepo.findById(schoolId); // select * from tn where id =
		if (studentObjFromDb.get() != null) // matching primary key is there
			return studentObjFromDb.get();
		else
			return new HighSchool();
	}

	public void deleteSchoolByregno(int deleteId) {
		java.util.Optional<HighSchool> schoolObjFromDb = schlrepo.findById(deleteId);
		if (schoolObjFromDb.get() != null)
			
//			 str = OtpGeneratorImpl.generateOtp(); PhoneNumber to = new
//			  PhoneNumber("9849263696"); PhoneNumber from = new
//			  PhoneNumber("+12059316556"); String otpMessage =
//			  "Dear Customer , Your OTP is  " + str +
//			 " for sending sms through Spring boot application. Thank You."; Message
//			  message = Message.creator(to, from,otpMessage).create();
//			 
			schlrepo.deleteById(deleteId);
	}

	public void deleteSchools() {

		schlrepo.deleteAll();
	}

//	public void updateSchoolDetails(int id, HighSchool newvlue) {
//		// TODO Auto-generated method stub
//		java.util.Optional<HighSchool> schoolObjFromDb = schlrepo.findById(id);
//		if (schoolObjFromDb.get() != null) {
//			HighSchool existingSchDetails = schoolObjFromDb.get();
//			existingSchDetails.setSchoolRegno(newvlue.getSchoolRegno());
//			existingSchDetails.setSchoolName(newvlue.getSchoolName());
//			existingSchDetails.setSchoolLocation(newvlue.getSchoolLocation());
//			existingSchDetails.setNoOfStudents(newvlue.getNoOfStudents());
//			existingSchDetails.setNoOfTeachers(newvlue.getNoOfTeachers());
//			schlrepo.save(existingSchDetails);
//		}
	public void updateSchoolDetails(int id, HighSchool newvlue)
	{
		// TODO Auto-generated method stub
		java.util.Optional<HighSchool> schoolObjFromDb = schlrepo.findById(id);
		if (schoolObjFromDb.get() != null) {
			HighSchool existingSchDetails = schoolObjFromDb.get();
			//existingSchDetails.setSchoolRegno(newvlue.getSchoolRegno());
			existingSchDetails.setSchoolName(newvlue.getSchoolName());
			existingSchDetails.setSchoolLocation(newvlue.getSchoolLocation());
			existingSchDetails.setNoOfStudents(newvlue.getNoOfStudents());
			existingSchDetails.setNoOfTeachers(newvlue.getNoOfTeachers());
			existingSchDetails.setSchoolMailId(newvlue.getSchoolMailId());
			schlrepo.save(existingSchDetails);
		//	emailService.sendEmail("msnsnigdha01@gmail.com", "Updated Successfully", "Vaild Details entered");
			
			
}
	}
}
