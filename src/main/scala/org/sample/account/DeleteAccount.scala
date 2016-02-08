package org.sample.account

import org.salesforce.{SObject, Util}

object DeleteAccount{
	    def main(args: Array[String]): Unit = {
				val util = new Util()
	    	val sObject = new SObject("Account", util.getBaseUrl())
	    	val objectId = "0012800000DR2Ko"
	    	sObject.deleteSObject(objectId)
	    }
}
