package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppe {
    public final pos a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final ppa e;
    public final sbp f;

    public ppe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppe) {
            ppe ppeVar = (ppe) obj;
            pos posVar = this.a;
            if (posVar != null ? posVar.equals(ppeVar.a) : ppeVar.a == null) {
                if (this.b.equals(ppeVar.b) && this.c.equals(ppeVar.c) && this.d.equals(ppeVar.d) && this.e.equals(ppeVar.e) && ujp.aH(this.f, ppeVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        pos posVar = this.a;
        return this.f.hashCode() ^ (((((((((((posVar == null ? 0 : posVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public ppe(pos posVar, Set set, Set set2, Set set3, ppa ppaVar, sbp sbpVar) {
        this.a = posVar;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = ppaVar;
        this.f = sbpVar;
    }

    public final String toString() {
        sbp sbpVar = this.f;
        ppa ppaVar = this.e;
        Set set = this.d;
        Set set2 = this.c;
        Set set3 = this.b;
        return qcjAcSmlN.Dofa + String.valueOf(this.a) + ", " + String.valueOf(set3) + ", " + String.valueOf(set2) + ", " + String.valueOf(set) + ", " + String.valueOf(ppaVar) + ", " + String.valueOf(sbpVar) + "}";
    }
}
