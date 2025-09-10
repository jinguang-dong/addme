package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iar {
    public final String a;
    public final String b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final Optional j;

    public iar() {
        throw null;
    }

    public static hxa a() {
        hxa hxaVar = new hxa();
        hxaVar.h(false);
        hxaVar.b(-1.0f);
        hxaVar.d(-1.0f);
        hxaVar.c(-1.0f);
        hxaVar.e(0);
        hxaVar.j(Optional.empty());
        return hxaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iar) {
            iar iarVar = (iar) obj;
            String str = this.a;
            if (str != null ? str.equals(iarVar.a) : iarVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(iarVar.b) : iarVar.b == null) {
                    if (this.c.equals(iarVar.c) && this.d.equals(iarVar.d) && this.e == iarVar.e) {
                        if (Float.floatToIntBits(this.f) == Float.floatToIntBits(iarVar.f)) {
                            if (Float.floatToIntBits(this.g) == Float.floatToIntBits(iarVar.g)) {
                                if (Float.floatToIntBits(this.h) == Float.floatToIntBits(iarVar.h) && this.i == iarVar.i && this.j.equals(iarVar.j)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return this.j.hashCode() ^ ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ this.i) * 1000003);
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.d;
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", " + String.valueOf(optional2) + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", " + String.valueOf(optional) + "}";
    }

    public iar(String str, String str2, Optional optional, Optional optional2, boolean z, float f, float f2, float f3, int i, Optional optional3) {
        this.a = str;
        this.b = str2;
        this.c = optional;
        this.d = optional2;
        this.e = z;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = i;
        this.j = optional3;
    }
}
