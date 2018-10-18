package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


// this is for limiting emails


// private boolean canSendEmail(LocalDate lastEmailSentDate) {
// 		LocalDate today = LocalDate.now();
// 		if (today.isAfter(lastEmailSentDate)) {
// 			return true;
// 		}
		
// 		return false;
// 	}
// }


// 	**********************************
	// this is for checking purpose

// 	package com.adp.pi.stat.infrastructure;

// import java.time.LocalDate;

// public class MustDelete {
//     public static void main (String[] args) {

//    LocalDate lastEmailSentDate = LocalDate.of(2018, 10, 18);
//         LocalDate today = LocalDate.now();
//         if (today.isAfter(lastEmailSentDate)) {
//             System.out.println("he can send the email");
//         }
//         else {
//             System.out.print("he can't send email");
//         }


//     }
}


	************************************

}
