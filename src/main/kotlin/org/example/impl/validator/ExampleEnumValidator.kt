package org.example.impl.validator

import org.example.inheretable.IEnumValidator

class ExampleEnumValidator : IEnumValidator {
    override fun onEnumField(name: String, enumek: Object, onErrorAction: ((o: Object) -> Unit)?): String {
        TODO("Not yet implemented")
    }
}