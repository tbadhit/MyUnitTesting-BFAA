package com.tbadhit.myunittesting

// (1)
class MainViewModel(private val cuboidModel: CuboidModel) {
    // (1)
    fun getCircumference(): Double = cuboidModel.getCircumference()

    // (1)
    fun getSurfaceArea(): Double = cuboidModel.getSurfaceArea()

    // (1)
    fun getVolume(): Double = cuboidModel.getVolume()

    // (1)
    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(l,w,h)
    }
}