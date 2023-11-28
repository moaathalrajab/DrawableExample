package edu.farmingdale.drawableexample
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
class MyDrawable : Drawable() {
    override fun draw(canvas: Canvas) {

        // Get the drawable's bounds
        val width = bounds.width()
        val centerX = width / 2F

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)

        // Snowman base, middle, top
        paint.color = Color.LTGRAY
        canvas.drawCircle(centerX, 400F, 100F, paint)
        canvas.drawCircle(centerX, 260F, 80F, paint)
        canvas.drawCircle(centerX, 140F, 60F, paint)

        // Hat: bottom and top
        paint.color = Color.BLUE
        canvas.drawRect(centerX - 50, 80F, centerX + 50, 90F, paint)
        canvas.drawRect(centerX - 30, 10F, centerX + 30, 80F, paint)
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