package model
import java.awt.Point
import java.awt.Rectangle
import java.awt.Window

interface Glyph {
    fun draw(window: Window)
    fun intersects(point: Point): Boolean
    fun insert(glyph: Glyph, position: Int)
    fun remove(position: Int)
    fun child(position: Int): Glyph?
    fun parent(): Glyph?
    fun bounds(): Double
}