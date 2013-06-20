package SuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ProfileManagement.ChagneAcitvationCode.ChangeUserActivationCode;
import ProfileManagement.ChangePin.ChangePinCode;
import ProfileManagement.EditProfile.EditXidioUserNameInProfileManagement;
import UserAccountManagement.ChangeCreditCardDetails;
import UserAuthentication.ResettingPassword.ChangeUserLoginPassword;
import UserAuthentication.UserRegistration.RegisterToXidioApplicationUsingValidCredentials;
import UserAuthentication.UserRegistration.RegisterToXidioApplicationWithoutEnteringEmail;
import UserAuthentication.UserRegistration.RegisterToXidioApplicationWithoutEnteringFirstName;
import VideoManagement.VideoSearchFunctionality.FeedBack.ProvideVideoFeedback;
import VideoManagement.VideoSearchFunctionality.SearchVideoByCategory.SeachAndSubscribeVideo;
import VideoManagement.VideoSearchFunctionality.SearchVideoByCategory.UnsubscribeUserSubscribedVideo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	RegisterToXidioApplicationWithoutEnteringFirstName.class,
	RegisterToXidioApplicationWithoutEnteringEmail.class,
	RegisterToXidioApplicationUsingValidCredentials.class,
	ChangeUserLoginPassword.class,
	SeachAndSubscribeVideo.class,
	UnsubscribeUserSubscribedVideo.class,
	EditXidioUserNameInProfileManagement.class,
	ChangeCreditCardDetails.class,
	ChangePinCode.class,
	ChangeUserActivationCode.class

})
public class runDemoTestSuite {

}
