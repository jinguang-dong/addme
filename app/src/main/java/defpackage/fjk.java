package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjk {
    public final InterleavedImageU8 a;
    public final ShotMetadata b;
    public final boolean c;
    public final String d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final lsu h;
    public final Optional i;
    public final hxu j;
    public final gga k;

    public fjk() {
        throw null;
    }

    public static fjj a() {
        fjj fjjVar = new fjj((byte[]) null);
        fjjVar.b(true);
        fjjVar.b = "";
        fjjVar.d = Optional.of(hqp.COTTAGE);
        return fjjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fjk) {
            fjk fjkVar = (fjk) obj;
            if (this.a.equals(fjkVar.a) && this.b.equals(fjkVar.b) && this.j.equals(fjkVar.j) && this.k.equals(fjkVar.k) && this.c == fjkVar.c && this.d.equals(fjkVar.d) && this.e.equals(fjkVar.e) && this.f.equals(fjkVar.f) && this.g.equals(fjkVar.g) && this.h.equals(fjkVar.h) && this.i.equals(fjkVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        Optional optional = this.i;
        lsu lsuVar = this.h;
        Optional optional2 = this.g;
        Optional optional3 = this.f;
        Optional optional4 = this.e;
        gga ggaVar = this.k;
        hxu hxuVar = this.j;
        ShotMetadata shotMetadata = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(shotMetadata) + ", " + String.valueOf(hxuVar) + ", " + String.valueOf(ggaVar) + ", " + this.c + ", " + this.d + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(lsuVar) + ", " + String.valueOf(optional) + "}";
    }

    public fjk(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, hxu hxuVar, gga ggaVar, boolean z, String str, Optional optional, Optional optional2, Optional optional3, lsu lsuVar, Optional optional4) {
        this.a = interleavedImageU8;
        this.b = shotMetadata;
        this.j = hxuVar;
        this.k = ggaVar;
        this.c = z;
        this.d = str;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = lsuVar;
        this.i = optional4;
    }
}
