package com.edibleday

import org.teavm.tooling.TeaVMTargetType

open class TeaVMPluginExtension {
    var mainClass: String? = null
    var flavourVersion: String? = null
    var installDirectory: String? = null
    var targetFileName: String? = null
    var copySources: Boolean? = null
    var generateSourceMap: Boolean? = null
    var minified: Boolean? = null
    var targetType: TeaVMTargetType? = null
    var incremental: Boolean? = null
}
