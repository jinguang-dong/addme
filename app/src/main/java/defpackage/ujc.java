package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ujc implements Serializable, ujm {
    protected final Object a;
    private final Class b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public ujc(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.ujm
    public final int cT() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc)) {
            return false;
        }
        ujc ujcVar = (ujc) obj;
        return this.e == ujcVar.e && this.f == ujcVar.f && this.g == ujcVar.g && a.ao(this.a, ujcVar.a) && a.ao(this.b, ujcVar.b) && this.c.equals(ujcVar.c) && this.d.equals(ujcVar.d);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        int i = ukb.a;
        return ujp.f(this);
    }
}
