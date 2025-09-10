package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rva {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final rus d;
    public final Optional e;
    private final Optional f;

    public rva() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rva) {
            rva rvaVar = (rva) obj;
            if (this.a.equals(rvaVar.a) && this.b == rvaVar.b && this.c == rvaVar.c && this.d.equals(rvaVar.d) && this.f.equals(rvaVar.f) && this.e.equals(rvaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.f.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.f;
        rus rusVar = this.d;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + String.valueOf(rusVar) + ", 0, " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public rva(ByteBuffer byteBuffer, int i, int i2, rus rusVar, Optional optional, Optional optional2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = rusVar;
        this.f = optional;
        this.e = optional2;
    }
}
