package com.example.busschedule

import android.app.Application
import android.content.Context
import com.example.busschedule.data.BusScheduleDatabase

class BusScheduleApplication : Application() {
    val database : BusScheduleDatabase by lazy { BusScheduleDatabase.getDatabase(this) }
}