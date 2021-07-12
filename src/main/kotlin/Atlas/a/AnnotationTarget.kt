package a

import kotlin.annotation.AnnotationTarget
enum class AnnotationTarget {  ;
    init {

        AnnotationTarget.ANNOTATION_CLASS
        AnnotationTarget.CLASS
        AnnotationTarget.CONSTRUCTOR
        AnnotationTarget.EXPRESSION
        AnnotationTarget.FIELD
        AnnotationTarget.FILE
        AnnotationTarget.FUNCTION
        AnnotationTarget.LOCAL_VARIABLE
        AnnotationTarget.PROPERTY
        AnnotationTarget.PROPERTY_GETTER
        AnnotationTarget.PROPERTY_SETTER
        AnnotationTarget.TYPE
        AnnotationTarget.TYPEALIAS
        AnnotationTarget.TYPE_PARAMETER
        AnnotationTarget.VALUE_PARAMETER
    }
}