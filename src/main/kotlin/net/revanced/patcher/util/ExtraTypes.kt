package net.revanced.patcher.util

import org.objectweb.asm.Type

object ExtraTypes {
    /**
     * Any object type.
     * Should be used instead of types such as: "Ljava/lang/String;"
     */
    val Any = Type.getType(Object::class.java)
    val ArrayAny = Type.getType(Array<String>::class.java)
}