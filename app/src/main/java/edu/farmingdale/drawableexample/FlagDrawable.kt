package edu.farmingdale.drawableexample
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
class FlagDrawable : Drawable() {
    override fun draw(canvas: Canvas) {
        val width = bounds.width()
        val height = bounds.height().toFloat()
        val centerX = width / 2F
        val centerY = height / 2F

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)

        paint.setARGB(255, 100, 200, 100)
        canvas.drawRect(0F, 0F, width.toFloat(), height, paint)

        paint.color = Color.BLUE
        canvas.drawCircle(centerX, centerY, centerY, paint)

        paint.color = Color.YELLOW
        paint.textSize = height

        val text = "A"
        val textBounds = Rect()
        paint.getTextBounds(text, 0, text.length, textBounds)
        canvas.drawText(
            text, centerX - textBounds.exactCenterX(),
            centerY - textBounds.exactCenterY(), paint
        )
    }

    override fun setAlpha(alpha: Int) {
        // alpha determines transparency
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        // Gives the ColorFilter
    }

    override fun getOpacity(): Int {
        // Must be PixelFormat.UNKNOWN, TRANSLUCENT, TRANSPARENT, or OPAQUE
        return PixelFormat.OPAQUE
    }
}
