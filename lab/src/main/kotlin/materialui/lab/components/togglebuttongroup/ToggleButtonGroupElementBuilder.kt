package materialui.lab.components.togglebuttongroup

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.togglebuttongroup.enums.ToggleButtonGroupStyle
import org.w3c.dom.events.Event
import react.RClass

class ToggleButtonGroupElementBuilder internal constructor(
    type: RClass<ToggleButtonGroupProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ToggleButtonGroupProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<ToggleButtonGroupStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.exclusive: Boolean? by materialProps
    var Tag.onChange: (Event, value: Any?) -> Unit by materialProps
    fun Tag.onChange(block: (Event, Any?) -> Unit) { onChange = block }
    var Tag.value: Any? by materialProps
}
