package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClientShotMetadata {
    protected transient boolean a;
    private transient long b;

    public ClientShotMetadata() {
        long jNew_ClientShotMetadata = GcamModuleJNI.new_ClientShotMetadata();
        this.a = true;
        this.b = jNew_ClientShotMetadata;
    }

    public static long a(ClientShotMetadata clientShotMetadata) {
        if (clientShotMetadata == null) {
            return 0L;
        }
        return clientShotMetadata.b;
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_ClientShotMetadata(j);
            }
            this.b = 0L;
        }
    }

    public final void c(LocationData locationData) {
        GcamModuleJNI.ClientShotMetadata_location_set(this.b, this, locationData.a, locationData);
    }

    protected final void finalize() {
        b();
    }
}
