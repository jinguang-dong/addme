package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jly {
    public final Optional a;
    public final jma b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final Optional f;

    public jly() {
        throw null;
    }

    public static jlq a() {
        jlq jlqVar = new jlq();
        jlqVar.b(jma.a);
        jlqVar.e(Optional.empty());
        jlqVar.a = Optional.empty();
        jlqVar.b = Optional.empty();
        jlqVar.d(true);
        jlqVar.c(Optional.empty());
        return jlqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jly) {
            jly jlyVar = (jly) obj;
            if (this.a.equals(jlyVar.a) && this.b.equals(jlyVar.b) && this.c.equals(jlyVar.c) && this.d.equals(jlyVar.d) && this.e == jlyVar.e && this.f.equals(jlyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.f.hashCode() ^ (((iHashCode * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.d;
        Optional optional3 = this.c;
        jma jmaVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(jmaVar) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + this.e + ", " + String.valueOf(optional) + "}";
    }

    public jly(Optional optional, jma jmaVar, Optional optional2, Optional optional3, boolean z, Optional optional4) {
        this.a = optional;
        this.b = jmaVar;
        this.c = optional2;
        this.d = optional3;
        this.e = z;
        this.f = optional4;
    }
}
