package com.github.xianchaoyu.test.services

import com.intellij.openapi.project.Project
import com.github.xianchaoyu.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
