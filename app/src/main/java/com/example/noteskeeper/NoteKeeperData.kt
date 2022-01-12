package com.example.noteskeeper

data class CourseInfo (val courseId: String, val tite:String) {
    override fun toString(): String {
        return tite
    }
}

data class NoteInfo (var course:CourseInfo?=null, var title:String?=null, var text: String?=null)

