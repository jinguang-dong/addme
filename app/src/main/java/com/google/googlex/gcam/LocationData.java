package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocationData {
    public transient long a;
    protected transient boolean b;

    public LocationData() {
        long jNew_LocationData = GcamModuleJNI.new_LocationData();
        this.b = true;
        this.a = jNew_LocationData;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_LocationData(j);
            }
            this.a = 0L;
        }
    }

    public final void b(double d) {
        GcamModuleJNI.LocationData_altitude_set(this.a, this, d);
    }

    public final void c(double d) {
        GcamModuleJNI.LocationData_degree_of_precision_set(this.a, this, d);
    }

    public final void d(double d) {
        GcamModuleJNI.LocationData_latitude_set(this.a, this, d);
    }

    public final void e(double d) {
        GcamModuleJNI.LocationData_longitude_set(this.a, this, d);
    }

    public final void f(String str) {
        GcamModuleJNI.LocationData_processing_method_set(this.a, this, str);
    }

    protected final void finalize() {
        a();
    }

    public final void g(long j) {
        GcamModuleJNI.LocationData_timestamp_unix_set(this.a, this, j);
    }
}
