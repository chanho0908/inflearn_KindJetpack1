package com.inhatc.inflearn_kindjetpack.room.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inhatc.inflearn_kindjetpack.room.db.database.TextDatabase
import com.inhatc.inflearn_kindjetpack.room.db.entity.TextEntity
import com.inhatc.inflearn_kindjetpack.room.db.entity.WordEntity
import com.inhatc.inflearn_kindjetpack.room.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.w3c.dom.Text

class MainViewModel(application: Application): AndroidViewModel(application) {

    val context = getApplication<Application>()
    val db = TextDatabase.getDatabase(context)

    private var _textList = MutableLiveData<List<TextEntity>>()
    val textList: LiveData<List<TextEntity>>
        get() = _textList

    private var _wordList = MutableLiveData<List<WordEntity>>()
    val wordList: LiveData<List<WordEntity>>
        get() = _wordList

    private val repository = Repository(context)

    fun getData() = viewModelScope.launch(Dispatchers.IO) {
        _textList.postValue(repository.getTextList())
        _wordList.postValue(repository.getWordList())
    }

    fun insertData(text: String) = viewModelScope.launch(Dispatchers.IO) {
        repository.insertTextData(text)
        repository.insertWordData(text)
    }

    fun removeData() = viewModelScope.launch(Dispatchers.IO) {
        repository.deleteTextData()
        repository.deleteWordData()
    }
}