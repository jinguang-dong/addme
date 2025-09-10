package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pws {
    public final rwc a;
    public final rwc b;
    public final rwc c;
    public final rwc d;

    public pws() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pws) {
            pws pwsVar = (pws) obj;
            if (this.a.equals(pwsVar.a) && this.b.equals(pwsVar.b) && this.c.equals(pwsVar.c) && this.d.equals(pwsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ (-58804091)) * 1000003) ^ 2040732332) * 1000003;
        return this.d.hashCode() ^ ((iHashCode ^ 2040732332) * 1000003);
    }

    public pws(rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4) {
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
        StringBuilder sb = new StringBuilder("{false, false, ");
        sb.append(strValueOf);
        String str = INRGuObcrHjSQz.FCJafTj;
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
