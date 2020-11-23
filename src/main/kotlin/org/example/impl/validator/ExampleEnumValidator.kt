package org.example.impl.validator

import org.example.inheretable.IEnumValidator
import org.example.inheretable.parent.ValidatorParent

class ExampleEnumValidator : ValidatorParent(), IEnumValidator {
    override fun onEnumField(name: String, enumek: Object, onErrorAction: ((o: Object) -> Unit)?): String {
        TODO("Not yet implemented")
    }
}