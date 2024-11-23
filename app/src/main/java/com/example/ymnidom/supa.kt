package com.example.ymnidom

import android.app.Application
import android.net.http.HttpResponseCache.install
import com.google.android.gms.auth.api.Auth
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object supa: Application() {
    val supabase = createSupabaseClient (
        supabaseUrl = "https://uhonejuffamtcebrradq.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVob25lanVmZmFtdGNlYnJyYWRxIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzE0ODMzNzEsImV4cCI6MjA0NzA1OTM3MX0.2M2ALvpPpPFa60igaz-kNHVLs7LtaU5ouxkveVdyqqM"
    ) {
        install(Postgrest)
    }
    public fun getSB() : SupabaseClient {
        return supabase
    }
}