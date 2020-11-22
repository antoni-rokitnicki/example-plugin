package org.example

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ExampleAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        println("e2 = $e")
    }
}
