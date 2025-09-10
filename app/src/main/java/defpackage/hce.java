package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hce implements fqc {
    public final long b;
    public final ltd c;
    public final sbp d;
    public final String e;
    public final String f;
    public final Instant g;
    public final Instant h;
    public final Uri i;
    public final boolean j;
    public final pas k;
    public final int l;

    public hce() {
        throw null;
    }

    public static hcd l() {
        hcd hcdVar = new hcd();
        hcdVar.f("");
        hcdVar.h("");
        hcdVar.b = a;
        hcdVar.g(0);
        return hcdVar;
    }

    @Override // defpackage.fqc
    public final int a() {
        return this.l;
    }

    @Override // defpackage.fqc
    public final long b() {
        return this.b;
    }

    @Override // defpackage.fqc
    public final Uri c() {
        return this.i;
    }

    @Override // defpackage.fqc
    public final ltd d() {
        return this.c;
    }

    @Override // defpackage.fqc
    public final pas e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        ltd ltdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hce) {
            hce hceVar = (hce) obj;
            if (this.b == hceVar.b && ((ltdVar = this.c) != null ? ltdVar.equals(hceVar.c) : hceVar.c == null) && ujp.aH(this.d, hceVar.d) && this.e.equals(hceVar.e) && this.f.equals(hceVar.f) && this.g.equals(hceVar.g) && this.h.equals(hceVar.h) && this.i.equals(hceVar.i) && this.j == hceVar.j && this.k.equals(hceVar.k) && this.l == hceVar.l) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fqc
    public final sbp f() {
        return this.d;
    }

    @Override // defpackage.fqc
    public final Instant g() {
        return this.g;
    }

    @Override // defpackage.fqc
    public final Instant h() {
        return this.h;
    }

    public final int hashCode() {
        ltd ltdVar = this.c;
        int iHashCode = ltdVar == null ? 0 : ltdVar.hashCode();
        long j = this.b;
        return this.l ^ ((((((((((((((((((iHashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003);
    }

    @Override // defpackage.fqc
    public final String i() {
        return this.f;
    }

    @Override // defpackage.fqc
    public final String j() {
        return this.e;
    }

    @Override // defpackage.fqc
    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        pas pasVar = this.k;
        Uri uri = this.i;
        Instant instant = this.h;
        Instant instant2 = this.g;
        sbp sbpVar = this.d;
        return "{" + this.b + ", " + String.valueOf(this.c) + ", " + sbpVar.toString() + ", " + this.e + ", " + this.f + ", " + instant2.toString() + ", " + instant.toString() + ", " + uri.toString() + ", " + this.j + ", " + pasVar.toString() + ", " + this.l + "}";
    }

    public hce(long j, ltd ltdVar, sbp sbpVar, String str, String str2, Instant instant, Instant instant2, Uri uri, boolean z, pas pasVar, int i) {
        this.b = j;
        this.c = ltdVar;
        sbpVar.getClass();
        this.d = sbpVar;
        str.getClass();
        this.e = str;
        str2.getClass();
        this.f = str2;
        instant.getClass();
        this.g = instant;
        instant2.getClass();
        this.h = instant2;
        uri.getClass();
        this.i = uri;
        this.j = z;
        pasVar.getClass();
        this.k = pasVar;
        this.l = i;
    }
}
