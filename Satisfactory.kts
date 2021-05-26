package satisfactory

import java.awt.Color

public abstract class Widget (private var height: Int, private var width: Int){

    fun getHeight(): Int {
        return height;
    }
    fun getWidth(): Int {
        return width;
    }
}

public class ImageWidget(height: Int, width: Int) : Widget(height, width) {

}

public class ButtonWidget(height: Int, width: Int) : Widget(height, width), OnClickInterface {

    override fun onClick( func : (Int, Int) -> Int ): Int {
        return func(getHeight(), getWidth())
    }
}

public interface OnClickInterface {

    fun onClick( func : (Int, Int) -> Int ): Int;
}

fun main() {
    val buttonWidget: ButtonWidget = ButtonWidget(10, 4)

    val area = {height: Int, width: Int -> height * width}
    println(buttonWidget.onClick(area))
}

main()