import demos.DemoRunner
import demos.MyDemo
import org.openrndr.application
import org.openrndr.configuration
import org.openrndr.extensions.Debug3D
import org.openrndr.extensions.FunctionDrawer


class Sandbox : DemoRunner() {
    override lateinit var camera: Debug3D

    override fun setup() {
        camera = Debug3D()
        val demo = MyDemo(DemoHashBlur3)
        extend(FunctionDrawer {
            demo()
        })
    }
}


fun main(args: Array<String>) {
    application(Sandbox(), configuration {
        width = 1920
        height = 1080
    })
}
