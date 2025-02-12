package pro.jayeshseth.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform