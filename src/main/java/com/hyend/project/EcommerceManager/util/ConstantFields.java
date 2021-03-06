package com.hyend.project.EcommerceManager.util;

public class ConstantFields {
	
	/**
	 * Spread Sheet Column Fields
	 */
	public static final String[] COLUMN_FIELDS = {
		"Order Id", "Order Date", "Invoice Id", "Invoice Date",
		"Quantity", "Amount", "Payment Mode", "Payment Status",  
		"Courier Name", "Tracking Id", "Courier Status", 
		"Courier Return Status", "Courier Return Rcvd Date",
		"Courier Return Condition"
	};
	
	/**
	 * Ecommerce Platforms Names
	 */
	public static final String[] ECOMMERCE_PLATFORMS = {
		"Select Platform", "paytm", "amazon", "flipkart",
		"snapdeal", "shopclues"
	};
	
	/**
	 * ECommerce Platform
	 */
	public static final String ECOMMERCE_PLATFORM_NAME_FIELD = "ecomm_platform_name";
	
	/**
	 * Default Ecommerce Name
	 */
	public static String CURRENT_ECOMM_PLATFORM_NAME = 
			ConstantFields.ECOMMERCE_PLATFORMS[0];
	
	/**
	 * Error Messages
	 */
	public static final String NO_RECORDS_FOUND_ERROR = "no_records_found";
	public static final String ALREADY_UPDATED_ERROR = "record_already_updated";
	
	/**
	 * Sheet generation codes
	 */
	public static final int GENERATE_FOR_DATES = 0;	
	public static final int GENERATE_FOR_PAYMENT_RECEIVED = 1;
	public static final int GENERATE_FOR_COURIER_DELIVERED = 2;
	
	/**
	 * PDF File Read Fail Error Codes.
	 */
	public static final int NO_ERROR = 0;	
	public static final int PDF_NO_PAGES_ERROR = 1;
	public static final int PDF_ENCRYPTED_ERROR = 2;
	public static final int PDF_NULL_FILE_ERROR = 3;
	public static final int NOT_A_PDF_FILE_ERROR = 4;
	public static final int PDF_LOAD_READ_CLOSE_ERROR = 5;
	public static final int ECOMMERCE_PLATFORM_NOT_FOUND_ERROR = 6;	 
	
	/**
	 * Tax Fields
	 */
	public static final String TAX_DETAILS = "tax_details";
	public static final String GST_RATE_FIELD = "gst_rate";
	public static final String GST_AMOUNT_FIELD = "gst_amount";
	public static final String TAXABLE_AMOUNT_FIELD = "taxable_amount";	
	
	/**
	 * Invoice Fields
	 */
	public static final String INVOICE_DETAILS = "invoice_details";
	public static final String INVOICE_DATE_FIELD = "invoice_date";
	public static final String INVOICE_TIME_FIELD = "invoice_time";
	public static final String INVOICE_NUMBER_FIELD = "invoice_number";	
		
	/**
	 * Payments Fields
	 */	
	public static final String PAYMENT_DETAILS = "payment_details";	
	public static final String TOTAL_AMOUNT_FIELD = "total_amount";
	public static final String PAYMENT_MODE_FIELD = "payment_mode";
	public static final String PAYMENT_STATUS_RECEIVED = "received";	
	public static final String PAYMENT_STATUS_FIELD = "payment_status";
	public static final String PAYMENT_STATUS_IN_PROCESS = "in-process";
	public static final String SHIPPING_CHARGE_FIELD = "shipping_charge";
	public static final String[] PAYMENT_MODES = {
			"Update Payment Mode",
			"COD", 
			"Prepaid"
	};
	
	/**
	 * Orders Fields
	 */
	public static final String ORDER_DETAILS = "order_details";
	public static final String ORDER_ID_FIELD = "order_id";
	public static final String ORDER_DATE_FIELD = "order_date";
	public static final String ORDER_TIME_FIELD = "order_time";
	public static final String TOTAL_QUANTITY_FIELD = "total_quantity";
	
	/**
	 * Products Fields
	 */
	public static final String CPD_FIELD = "cpd";
	public static final String PRODUCT_DETAILS = "product_details";		
	public static final String PRODUCT_ID_FIELD = "product_id";
	public static final String PRODUCT_SKU_FIELD = "product_sku";
	public static final String PRODUCT_NAME_FIELD = "product_name";
	public static final String PRODUCT_WEIGHT_FIELD = "product_weight";
	public static final String PRODUCT_DESC_FIELD = "product_description";
	
	/**
	 * Logistics Fields
	 */
	public static final String COURIER_DETAILS = "courier_details";
	public static final String COURIER_NAME_FIELD = "courier_name";
	public static final String COURIER_STATUS_DELIVERED = "delivered";
	public static final String COURIER_STATUS_FIELD = "courier_status";
	public static final String COURIER_STATUS_IN_TRANSIT = "in-transit";
	public static final String COURIER_RETURN_STATUS_RETURNED = "returned";
	public static final String COURIER_TRACKING_ID_FIELD = "courier_tracking_id";
	public static final String COURIER_RETURN_STATUS_FIELD = "courier_return_status";
	public static final String COURIER_RETURN_RCVD_DATE_FIELD = "courier_return_rcvd_date";
	public static final String COURIER_RETURN_CONDITION_FIELD = "courier_return_condition";
	public static final String[] COURIER_RETURN_CONDITIONS = {
			"Update Return Condition",
			"Returned By Customer",
			"Returned From Delivery"
	};
	
	/**
	 * Buyer Fields
	 */
	public static final String BUYER_DETAILS = "buyer_details";
	public static final String BUYER_NAME_FIELD = "buyer_name";
	public static final String BUYER_POSTAL_CODE_FIELD = "buyer_postal_code";
	public static final String BUYER_PHONE_NUMBER_FIELD = "buyer_phone_number";
	public static final String BUYER_EMAIL_ADDRESS_FIELD = "buyer_email_address";	
	public static final String BUYER_BILLING_ADDRESS_FIELD = "buyer_billing_address";
	public static final String BUYER_DELIVERY_ADDRESS_FIELD = "buyer_delivery_address";
	public static final String BUYER_SHIPPING_ADDRESS_FIELD = "buyer_shipping_address";	
}
