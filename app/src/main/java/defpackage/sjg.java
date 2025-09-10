package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sjg extends sif {
    private final String a;

    protected sjg(String str) {
        this.a = str;
    }

    @Override // defpackage.sif
    public String a() {
        return this.a;
    }

    @Override // defpackage.sif
    public void b(RuntimeException runtimeException, sid sidVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
