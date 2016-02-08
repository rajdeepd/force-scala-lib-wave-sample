package org.sample.wave

import org.salesforce.wave.WaveClient

object ListWaveResources{
	def main(args: Array[String]): Unit = {
    val waveClient = new WaveClient()
    val body = waveClient.listResources()
		println(body)
	}
}
