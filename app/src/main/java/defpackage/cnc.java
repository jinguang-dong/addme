package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnc {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final Object e;

    public cnc(int i, boolean z, String str, int i2, int i3) {
        this.b = i;
        this.c = z;
        this.e = str;
        this.a = i2;
        this.d = i3;
    }

    @Deprecated
    public cnc(Uri uri, int i, int i2, boolean z, int i3) {
        coe.d(uri);
        this.e = uri;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }
}
