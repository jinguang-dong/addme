package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idx {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final ShotMetadata e;
    public final sbp f;
    public final Optional g;
    public final iea h;
    private final Optional i;

    public idx() {
        throw null;
    }

    public static idw a() {
        idw idwVar = new idw(null);
        int i = sbp.d;
        idwVar.c(sex.a);
        idwVar.b(iea.a);
        return idwVar;
    }

    public final long[] b() {
        sbp sbpVar = this.f;
        long[] jArr = new long[sbpVar.size()];
        for (int i = 0; i < sbpVar.size(); i++) {
            Long l = (Long) ((poe) sbpVar.get(i)).a(CaptureResult.SENSOR_TIMESTAMP);
            jArr[i] = l == null ? -1L : l.longValue();
        }
        return jArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idx) {
            idx idxVar = (idx) obj;
            if (this.a.equals(idxVar.a) && this.b.equals(idxVar.b) && this.c.equals(idxVar.c) && this.d.equals(idxVar.d) && this.e.equals(idxVar.e) && ujp.aH(this.f, idxVar.f) && this.g.equals(idxVar.g) && this.h.equals(idxVar.h) && this.i.equals(idxVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        return this.i.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.i;
        iea ieaVar = this.h;
        Optional optional2 = this.g;
        sbp sbpVar = this.f;
        ShotMetadata shotMetadata = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(shotMetadata) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(optional2) + ", " + String.valueOf(ieaVar) + ", " + String.valueOf(optional) + "}";
    }

    public idx(Optional optional, Optional optional2, Optional optional3, Optional optional4, ShotMetadata shotMetadata, sbp sbpVar, Optional optional5, iea ieaVar, Optional optional6) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = shotMetadata;
        this.f = sbpVar;
        this.g = optional5;
        this.h = ieaVar;
        this.i = optional6;
    }
}
