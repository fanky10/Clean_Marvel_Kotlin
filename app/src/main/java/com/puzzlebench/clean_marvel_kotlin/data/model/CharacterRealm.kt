package com.puzzlebench.clean_marvel_kotlin.data.model

import io.realm.RealmObject


open class CharacterRealm(var name: String? = null, var description: String? = null, var thumbnail: ThumbnailRealm? =null) : RealmObject()