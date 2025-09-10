package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class shc extends shd {
    private final int d;
    private int f = 0;
    private final String b = "A";
    private final String c = "a";
    private final String e = "PG";

    public shc(int i) {
        this.d = i;
    }

    @Override // defpackage.shd
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.shd
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.shd
    public final String c() {
        String str = this.e;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.shd
    public final String d() {
        return this.c;
    }

    @Override // defpackage.shd
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shc)) {
            return false;
        }
        shc shcVar = (shc) obj;
        if (!this.c.equals(shcVar.c) || this.d != shcVar.d) {
            return false;
        }
        String str = shcVar.b;
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
