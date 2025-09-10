package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pur extends pus {
    private final Uri a;

    public pur(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.pus, defpackage.put
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof put) {
            put putVar = (put) obj;
            putVar.b();
            if (this.a.equals(putVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.put
    public final void b() {
    }
}
