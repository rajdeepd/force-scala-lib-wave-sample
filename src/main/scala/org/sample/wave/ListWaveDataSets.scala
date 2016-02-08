package org.sample.wave

import org.salesforce.wave.WaveClient

object ListWaveDataSets{
	def main(args: Array[String]): Unit = {
		val waveClient = new WaveClient()
		val body = waveClient.listDataSets()
		println(body)
	}
}
