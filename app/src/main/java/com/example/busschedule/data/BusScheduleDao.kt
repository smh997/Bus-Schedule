package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(busSchedule: BusSchedule)

    @Update
    suspend fun update(busSchedule: BusSchedule)

    @Delete
    suspend fun delete(busSchedule: BusSchedule)

    @Query("SELECT * from bus_schedules WHERE stop_name = :stopName")
    fun getSchedule(stopName: String): Flow<BusSchedule>

    @Query("SELECT * from bus_schedules ORDER BY arrival_time")
    fun getAllSchedules(): Flow<List<BusSchedule>>
}