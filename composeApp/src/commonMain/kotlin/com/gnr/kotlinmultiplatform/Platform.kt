package com.gnr.kotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform