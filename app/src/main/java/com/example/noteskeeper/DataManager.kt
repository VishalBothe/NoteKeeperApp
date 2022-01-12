package com.example.noteskeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initalizeCourses()
        intiallizeNotes()
    }

    private fun intiallizeNotes() {
    }

    private fun initalizeCourses() {
        var course = CourseInfo("Android_intents", "Android programming with Intents")
        courses.set(course.courseId, course)
        var note = NoteInfo(course, course.courseId, course.tite)
        notes.add(note)

        course = CourseInfo("java_lang","Java Fundamentals:The Language")
        courses.set(course.courseId,course)
        note = NoteInfo(course, course.courseId, course.tite)
        notes.add(note)

        course = CourseInfo("java_core","Java Fundamentals:Te core platform")
        courses.set(course.courseId,course)
        note = NoteInfo(course, course.courseId, course.tite)
        notes.add(note)

        course = CourseInfo("Android_adv","Android Advanced")
        courses.set(course.courseId,course)
        note = NoteInfo(course, course.courseId, course.tite)
        notes.add(note)
    }
}