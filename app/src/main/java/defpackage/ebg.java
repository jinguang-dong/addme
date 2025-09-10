package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebg {
    public final String a;
    public final int b;
    public final int c;

    public ebg(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebg)) {
            return false;
        }
        ebg ebgVar = (ebg) obj;
        return a.ao(this.a, ebgVar.a) && this.b == ebgVar.b && this.c == ebgVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + wzgaYJqO.zpvOqPR + this.c + ')';
    }
}
