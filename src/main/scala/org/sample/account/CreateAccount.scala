package org.sample.account

import org.salesforce.{SObject, Util}

object CreateAccount{
	def main(args: Array[String]): Unit = {
		val util = new Util()
    val sObject = new SObject("Account", util.getBaseUrl())
    val json = """{"name":"test_manpreet"}"""
    sObject.createSObject(json)

	}
}
