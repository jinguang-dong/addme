package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tds extends tei {
    public final Instant a;
    public final Optional b;
    public final boolean c;
    public final boolean d;
    private volatile transient boolean e;
    private volatile transient boolean f;

    public tds(Instant instant, Optional optional, boolean z, boolean z2) {
        instant.getClass();
        this.a = instant;
        this.b = optional;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.tei
    public final Instant a() {
        return this.a;
    }

    @Override // defpackage.tei
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.tei
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.tei
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tei) {
            tei teiVar = (tei) obj;
            if (this.a.equals(teiVar.a()) && this.b.equals(teiVar.b()) && this.c == teiVar.c() && this.d == teiVar.d()) {
                teiVar.e();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tei
    public final void f() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            if (!this.f) {
                this.b.isPresent();
                this.e = false;
                this.f = true;
            }
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.b;
        return "{" + this.a.toString() + ", " + optional.toString() + ", " + this.c + ", " + this.d + ", false}";
    }

    @Override // defpackage.tei
    public final void e() {
    }
}
