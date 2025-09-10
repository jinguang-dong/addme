package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgn {
    public final rwc a;
    public final rwc b;
    public final rwc c;
    public final rwc d;

    public lgn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lgn) {
            lgn lgnVar = (lgn) obj;
            if (this.a.equals(lgnVar.a) && this.b.equals(lgnVar.b) && this.c.equals(lgnVar.c) && this.d.equals(lgnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public lgn(rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4) {
        this.a = rwcVar;
        this.b = rwcVar2;
        this.c = rwcVar3;
        this.d = rwcVar4;
    }

    public final String toString() {
        rwc rwcVar = this.d;
        rwc rwcVar2 = this.c;
        rwc rwcVar3 = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(rwcVar3);
        String strValueOf3 = String.valueOf(rwcVar2);
        String strValueOf4 = String.valueOf(rwcVar);
        StringBuilder sb = new StringBuilder("{");
        sb.append(strValueOf);
        String str = IQwwK.pbrSC;
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
