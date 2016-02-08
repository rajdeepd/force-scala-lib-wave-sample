package org.sample.account

import org.salesforce.{SObject, Util}

object UpdateAccount{
	case class Account(id: String, name: String)
	def main(args: Array[String]): Unit = {
		val util = new Util()
	    val sObject = new SObject("Account", util.getBaseUrl())
	    val objectId = "0012800000EuoVB"
	    val jsonData = """{"name":"Account1.1"}"""
	    sObject.patchSObject(objectId, jsonData)
	}
}
 