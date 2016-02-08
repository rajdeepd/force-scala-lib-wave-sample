package org.sample.account

import com.google.gson.Gson
import org.salesforce.{SObject, Util}


object GetAccountDetails{
	def main(args: Array[String]): Unit = {
		val util = new Util()
		val sObject = new SObject("Account", util.getBaseUrl())
		val id = "0012800000EvvnNAAR"
		val body = sObject.getSObjectDetails(id)
		val gson = new Gson
		val jsonObject = gson.fromJson(body, classOf[Account])
		println(jsonObject)
	}
}
