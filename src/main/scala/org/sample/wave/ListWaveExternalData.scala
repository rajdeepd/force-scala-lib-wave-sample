package org.sample.wave

import org.salesforce.wave.WaveClient

object ListWaveExternalData{
	def main(args: Array[String]): Unit = {
		val waveClient = new WaveClient()
    val body = waveClient.listInsightsExternalData()
		println(body)
	}
}
