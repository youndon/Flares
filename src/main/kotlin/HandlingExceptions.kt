@file:Suppress("UNREACHABLE_CODE")

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CompletionHandlerException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.channels.ClosedSendChannelException
import java.io.File


@InternalCoroutinesApi
fun myException() {
    /**
     Nothing perfect, this is the programming case,
     so when you have some code you'll trying to control this issues,
     and don't let errors itself show for the user ,
     so for solve this problem we will using 'try/catch' ,
     'try' can help you for hide the probable errors and show a message as alternative
     */
    // let's try divide some number of zero.
    try {
        val div = Integer.sum(readLine()!!.toInt(), readLine()!!.toInt())
        println(div)
    }
    catch (er:Error){
        // ...
        when(er) {
            AssertionError () -> throw AssertionError("")
            NotImplementedError () -> throw NotImplementedError("")
            KotlinReflectionNotSupportedError () -> throw KotlinReflectionNotSupportedError("")
        }
    }
    catch (ex:Exception) {
        // ...
        when (ex) {
            RuntimeException() -> throw RuntimeException("")
            TypeCastException() -> throw TypeCastException("")
            ClassCastException() -> throw ClassCastException("")
            FileSystemException(File("")) -> throw FileSystemException(File(""))
            NoSuchFileException(File("")) -> throw NoSuchFileException(File(""))
            ArithmeticException() -> throw ArithmeticException("")
            NullPointerException() -> throw NullPointerException("")
            IllegalStateException() -> throw IllegalStateException("")
            AccessDeniedException(File("")) -> throw AccessDeniedException(File(""))
            NumberFormatException() -> throw NumberFormatException("")
            NoSuchElementException() -> throw NoSuchElementException("")
            CharacterCodingException() -> throw CharacterCodingException()
            IllegalArgumentException()-> throw IllegalArgumentException("")
            IndexOutOfBoundsException()-> throw IndexOutOfBoundsException("")
            FileAlreadyExistsException(File("")) -> throw FileAlreadyExistsException(File(""))
            KotlinNullPointerException()-> throw KotlinNullPointerException("")
            NoWhenBranchMatchedException()-> throw NoWhenBranchMatchedException("")
            UnsupportedOperationException()-> throw UnsupportedOperationException("")
            ConcurrentModificationException()-> throw ConcurrentModificationException("")
            UninitializedPropertyAccessException()-> throw UninitializedPropertyAccessException("")
            CompletionHandlerException("",Throwable()) -> throw CompletionHandlerException("", Throwable())
            CoroutineExceptionHandler { coroutineContext, throwable -> val s = "$coroutineContext $throwable" } -> throw  Throwable()
//            TimeoutCancellationException("") -> throw TimeoutCancellationException("") todo internal.
            CancellationException() -> throw CancellationException("")
            ClosedReceiveChannelException("") -> throw ClosedReceiveChannelException("")
            ClosedSendChannelException("") -> throw ClosedSendChannelException("")
//    DateTimeFormatException
//    DateTimeArithmeticException
//    IllegalTimeZoneException
        }
    }
    finally {
        println("finally is not necessary ," +
                "and this procedure runs out anyway like (init) option ")
    }

}