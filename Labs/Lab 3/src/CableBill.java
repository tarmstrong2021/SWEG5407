import java.util.Scanner;

public class CableBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// global values
		int acct_num;
		char cust_type;
		double amount = 0.0;

		// values for Residential
		double res_bill_processing_fee = 4.5;
		double res_basic_service_fee = 20.5;
		double res_prem_channel = 7.5;

		// values for Business
		double biz_bill_processing_fee = 15.0;
		double biz_basic_service_fee = 75.0; // up to 10 connections
		double biz_additional_connections = 5.0; // each connection over 10
		double biz_premium_channel = 50;

		// get account number
		Scanner console = new Scanner(System.in);
		System.out.println("Please Enter Account number: ");
		acct_num = console.nextInt();

		// get customer type
		System.out.println("Enter customer tpye (R/r/B/b): ");
		cust_type = console.next().charAt(0);

		// get number of premium channels
		System.out.println("Enter number of premium channels: ");
		int num_prem_channels = console.nextInt();

		// use Switch to direct Residential or Business Customer
		switch (cust_type) {
		case 'R':
		case 'r':

			amount = num_prem_channels * res_prem_channel + res_basic_service_fee + res_bill_processing_fee;

			break;

		case 'B':
		case 'b':

			System.out.println("Enter number of basic service connections: ");
			int num_connections = console.nextInt();

			// calculate biz customer amount based on number of connections
			if (num_connections <= 10) {
				amount = biz_basic_service_fee + biz_bill_processing_fee + (biz_premium_channel * num_prem_channels);
			} else {
				amount = biz_basic_service_fee + biz_bill_processing_fee
						+ (biz_additional_connections * (num_connections - 10))
						+ (biz_premium_channel * num_prem_channels);
			}

			break;

		default:
			System.out.println("Enter customer tpye (R/r/B/b): ");
			break;

		}
		// print bill amount
		System.out.println("Total Amount is " + amount);
	}

}
