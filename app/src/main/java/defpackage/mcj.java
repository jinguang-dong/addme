package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcj {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final rus d;
    public final rwc e;
    public final rwc f;

    public mcj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcj) {
            mcj mcjVar = (mcj) obj;
            if (this.a.equals(mcjVar.a) && this.b == mcjVar.b && this.c == mcjVar.c && this.d.equals(mcjVar.d) && this.e.equals(mcjVar.e) && this.f.equals(mcjVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * (-721379959))) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        rwc rwcVar = this.f;
        rwc rwcVar2 = this.e;
        rus rusVar = this.d;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + String.valueOf(rusVar) + ", 0, " + String.valueOf(rwcVar2) + ", " + String.valueOf(rwcVar) + "}";
    }

    public mcj(ByteBuffer byteBuffer, int i, int i2, rus rusVar, rwc rwcVar, rwc rwcVar2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = rusVar;
        this.e = rwcVar;
        this.f = rwcVar2;
    }
}
