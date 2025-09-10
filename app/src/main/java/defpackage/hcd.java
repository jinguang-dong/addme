package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hcd {
    public ltd a;
    public pas b;
    private long c;
    private sbp d;
    private String e;
    private String f;
    private Instant g;
    private Instant h;
    private Uri i;
    private boolean j;
    private int k;
    private byte l;

    public hcd() {
    }

    public final hce a() {
        String str;
        String str2;
        Instant instant;
        Instant instant2;
        Uri uri;
        pas pasVar;
        if ((this.l & 1) == 0) {
            throw new IllegalStateException();
        }
        sbp sbpVarJ = sbp.j(sbp.l(Long.valueOf(this.c)));
        this.d = sbpVarJ;
        if (this.l != 7 || sbpVarJ == null || (str = this.e) == null || (str2 = this.f) == null || (instant = this.g) == null || (instant2 = this.h) == null || (uri = this.i) == null || (pasVar = this.b) == null) {
            throw new IllegalStateException();
        }
        return new hbt(this.c, this.a, sbpVarJ, str, str2, instant, instant2, uri, this.j, pasVar, this.k);
    }

    public final void b(long j) {
        this.c = j;
        this.l = (byte) (this.l | 1);
    }

    public final void c(Instant instant) {
        instant.getClass();
        this.g = instant;
    }

    public final void d(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 2);
    }

    public final void e(Instant instant) {
        instant.getClass();
        this.h = instant;
    }

    public final void f(String str) {
        str.getClass();
        this.f = str;
    }

    public final void g(int i) {
        this.k = i;
        this.l = (byte) (this.l | 4);
    }

    public final void h(String str) {
        str.getClass();
        this.e = str;
    }

    public final void i(Uri uri) {
        uri.getClass();
        this.i = uri;
    }

    public hcd(hce hceVar) {
        this.c = hceVar.b;
        this.a = hceVar.c;
        this.d = hceVar.d;
        this.e = hceVar.e;
        this.f = hceVar.f;
        this.g = hceVar.g;
        this.h = hceVar.h;
        this.i = hceVar.i;
        this.j = hceVar.j;
        this.b = hceVar.k;
        this.k = hceVar.l;
        this.l = (byte) 7;
    }
}
