package org.sample.account

import org.salesforce.{SObject, Util}

object ExecuteSOQLQuery{
	    def main(args: Array[String]): Unit = {
				val util = new Util()
	    	val sObject = new SObject("Account", util.getBaseUrl())
	    	val json = """{"name":"Account1"}"""
	    	val soql  = """SELECT+name+from+Account"""
	    	val response = sObject.executeSOQL(soql)
	    	println("response:" + response)
	    }
}
