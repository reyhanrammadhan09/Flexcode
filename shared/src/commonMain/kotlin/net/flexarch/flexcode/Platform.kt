package net.flexarch.flexcode

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform