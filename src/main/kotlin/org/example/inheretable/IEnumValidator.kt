package org.example.inheretable

interface IEnumValidator {

    fun onEnumField(name: String, enumek: Object, onErrorAction: ((o: Object) -> Unit)?) : String

    fun onEnumField(name: String, enumek: Object) : String {
        return onEnumField(name, enumek, null)
    }
}