package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlk {
    public final rwc a;
    public final rwc b;
    public final rwc c;
    private final rwc d;

    public jlk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jlk) {
            jlk jlkVar = (jlk) obj;
            if (this.d.equals(jlkVar.d) && this.a.equals(jlkVar.a) && this.b.equals(jlkVar.b) && this.c.equals(jlkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return -124870335;
    }

    public jlk(rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4) {
        this.d = rwcVar;
        this.a = rwcVar2;
        this.b = rwcVar3;
        this.c = rwcVar4;
    }

    public final String toString() {
        rwc rwcVar = this.c;
        rwc rwcVar2 = this.b;
        rwc rwcVar3 = this.a;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(rwcVar3);
        String strValueOf3 = String.valueOf(rwcVar2);
        String strValueOf4 = String.valueOf(rwcVar);
        StringBuilder sb = new StringBuilder("{");
        sb.append(strValueOf);
        String str = clFzVRcygwbq.WnaHNjAKSKUh;
        sb.append(str);
        sb.append(strValueOf2);
        sb.append(str);
        sb.append(strValueOf3);
        sb.append(str);
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
