package org.sample.wave

import org.salesforce.wave.WaveClient

object ListWaveFolders{
	def main(args: Array[String]): Unit = {
		val waveClient = new WaveClient()
    val body = waveClient.listFolders()
		println(body)
	}
}
