package com.tbadhit.myunittesting

class CuboidModel {
    // (1)
    private var length: Double = 0.0
    private var width: Double = 0.0
    private var height: Double = 0.0

    // (1)
    fun save(length: Double, width: Double, height: Double) {
        this.length = length
        this.width = width
        this.height = height
    }

    // (1)
    fun getVolume() : Double = length * width * height

    // (1)
    fun getSurfaceArea(): Double {
        val lw = length * width
        var wh = width * height
        var lh = length * height

        return 2 * (lw + wh + lh)
    }

    // (1)
    fun getCircumference(): Double = 4 * (length + width + height)
}