import java.io.File

abstract class BaseFileHandler(val path: String) {
    abstract fun <T> save(data: T)
    abstract fun <T> T.load(): T
}